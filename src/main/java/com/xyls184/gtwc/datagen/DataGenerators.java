package com.xyls184.gtwc.datagen;
// 负责处理数据
import com.xyls184.gtwc.GTWC;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = GTWC.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // 注册我们写的 Providers
        generator.addProvider(event.includeClient(), new ModZhCNLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new ModEnUSLangProvider(packOutput)); // 如果你写了英文的话
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));

        // 标签属于服务端数据 (Server data)
        // 注意：ItemTagProvider 通常需要一个 BlockTagProvider 作为前置参数，如果你没有方块标签，可以像下面这样塞一个空的进去
        BlockTagsProvider blockTagsProvider = new BlockTagsProvider(packOutput, lookupProvider, GTWC.MOD_ID, existingFileHelper) {
            @Override protected void addTags(HolderLookup.Provider pProvider) {}
        };
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ModItemTagProvider(packOutput, lookupProvider, blockTagsProvider, existingFileHelper));
    }
}

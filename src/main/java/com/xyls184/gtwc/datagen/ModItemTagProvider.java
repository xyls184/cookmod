package com.xyls184.gtwc.datagen;

import com.xyls184.gtwc.GTWC;
import com.xyls184.gtwc.item.AutoAdd;
import com.xyls184.gtwc.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, blockTagsProvider.contentsGetter(), GTWC.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // 根据枚举自动挂载标签
        for (AutoAdd food : AutoAdd.values()) {
            for (String tagString : food.getTags()) {
                // 将字符串 (如 "forge:crops") 转换为 Minecraft 的 TagKey
                TagKey<Item> tagKey = ItemTags.create(new ResourceLocation(tagString));
                // 将物品加入该标签
                this.tag(tagKey).add(ModItems.AUTO_ADD_MAP.get(food).get());
            }
        }
    }
}
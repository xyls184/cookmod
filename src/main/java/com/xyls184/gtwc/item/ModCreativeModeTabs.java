package com.xyls184.gtwc.item;

import com.xyls184.gtwc.GTWC;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GTWC.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VEGETABLES_TAB = CREATIVE_MODE_TABS.register("vegetables_tab",
            () -> CreativeModeTab.builder()
                    // 物品栏的图标（比如拿番茄当图标）
                    .icon(() -> new ItemStack(ModItems.AUTO_ADD_MAP.get(AutoAdd.TOMATO).get()))
                    // 物品栏的名称，对应 lang 文件里的 itemGroup.vegetables
                    .title(Component.translatable("itemGroup.vegetables"))
                    // 自动遍历枚举并添加物品
                    .displayItems((parameters, output) -> {
                        for (AutoAdd food : AutoAdd.values()) {
                            if (food.getTabGroup().equals("vegetables")) {
                                output.accept(ModItems.AUTO_ADD_MAP.get(food).get());
                            }
                        }
                    })
                    .build());

    public static void register(net.minecraftforge.eventbus.api.IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
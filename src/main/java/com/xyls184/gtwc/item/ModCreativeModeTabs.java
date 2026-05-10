package com.xyls184.gtwc.item;

import com.xyls184.gtwc.GTWC;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GTWC.MOD_ID);

    // 1. 基础蔬菜物品栏
    public static final RegistryObject<CreativeModeTab> VEGETABLES_TAB = CREATIVE_MODE_TABS.register("vegetables_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.AUTO_ADD_MAP.get(AutoAdd.TOMATO).get()))
                    // 【修改】：换成翻译键
                    .title(Component.translatable("itemGroup.gtwc.vegetables"))
                    .displayItems((parameters, output) -> {
                        for (AutoAdd food : AutoAdd.values()) {
                            // 注意：如果要排除原版物品（如原版马铃薯）出现在你的创造栏里，可以加个 !food.isVanilla() 判断
                            if (food.getTabGroup().equals("vegetables") && !food.isVanilla()) {
                                output.accept(ModItems.AUTO_ADD_MAP.get(food).get());
                            }
                        }
                    })
                    .build());

    // 2. 蔬菜半成品物品栏
    public static final RegistryObject<CreativeModeTab> VEGETABLE_DERIVATIVES_TAB = CREATIVE_MODE_TABS.register("vegetable_derivatives_tab",
            () -> CreativeModeTab.builder()
                    // 图标随便选了一个库里的半成品（比如西葫芦片），如果想安全点，可以专门注册一个不可用的物品做图标
                    .icon(() -> new ItemStack(VegetableProcessor.VEGETABLE_DERIVATIVES.get("sliced_zucchini").get()))
                    // 翻译键
                    .title(Component.translatable("itemGroup.gtwc.vegetable_derivatives"))
                    .displayItems((parameters, output) -> {
                        // 【遍历刚刚我们在 Processor 里建的仓库，全部塞进去】
                        for (RegistryObject<Item> derivative : VegetableProcessor.VEGETABLE_DERIVATIVES.values()) {
                            output.accept(derivative.get());
                        }
                    })
                    .build());

    /* ==========================================================
       【示例模板】：未来如果有“谷物”和“谷物半成品”，可以这样加：
       ==========================================================

    // 3. 谷物基础物品栏
    public static final RegistryObject<CreativeModeTab> GRAIN_TAB = CREATIVE_MODE_TABS.register("grain_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.AUTO_ADD_MAP.get(AutoAdd.RICE).get()))
                    .title(Component.translatable("itemGroup.gtwc.grain"))
                    .displayItems((parameters, output) -> {
                        for (AutoAdd food : AutoAdd.values()) {
                            if (food.getTabGroup().equals("grain") && !food.isVanilla()) {
                                output.accept(ModItems.AUTO_ADD_MAP.get(food).get());
                            }
                        }
                    })
                    .build());

    // 4. 谷物半成品物品栏
    public static final RegistryObject<CreativeModeTab> GRAIN_DERIVATIVES_TAB = CREATIVE_MODE_TABS.register("grain_derivatives_tab",
            () -> CreativeModeTab.builder()
                    // 假设你写了 GrainProcessor 并有一个 GRAIN_DERIVATIVES 的仓库
                    .icon(() -> new ItemStack(GrainProcessor.GRAIN_DERIVATIVES.get("flour_rice").get()))
                    .title(Component.translatable("itemGroup.gtwc.grain_derivatives"))
                    .displayItems((parameters, output) -> {
                        for (RegistryObject<Item> derivative : GrainProcessor.GRAIN_DERIVATIVES.values()) {
                            output.accept(derivative.get());
                        }
                    })
                    .build());
    */

    public static void register(net.minecraftforge.eventbus.api.IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
package com.xyls184.gtwc.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class VegetableProcessor {

    // 【新增】：创建一个大仓库，用来保存所有生成的“蔬菜半成品”
    // 键是 String (如 "sliced_zucchini")，值是 Forge 的 RegistryObject
    public static final Map<String, RegistryObject<Item>> VEGETABLE_DERIVATIVES = new LinkedHashMap<>();
    // 接收 Forge 的物品注册器作为参数
    public static void registerVegetableDerivatives(DeferredRegister<Item> itemRegistry) {
        for (AutoAdd item : AutoAdd.values()) {
            // 只处理 tabGroup 为 vegetables 的物品
            if (!"vegetables".equals(item.getTabGroup())) {
                continue;
            }

            // 将黑名单转换为 List 方便判断
            List<ProcessType> disabledList = Arrays.asList(item.getDisabledTypes());

            for (ProcessType type : ProcessType.values()) {

                // 【新增拦截】：如果这个处理方式不适用于当前物品的分类，直接跳过！
                // 比如：当前物品是西葫芦(vegetables)，遇到肉糜(MINCE)时，就会直接跳过，不需要你写进黑名单。
                if (!type.isApplicableTo(item.getTabGroup())) {
                    continue;
                }

                // 【原有的黑名单拦截】：检查是否在你手动写的屏蔽列表里
                if (disabledList.contains(type)) {
                    continue;
                }

                // 生成新的物品 ID
                String newId = type.generateId(item.getId());
                // 【修改】：接收 Forge 返回的注册对象，并存进我们的仓库里
                RegistryObject<Item> registeredItem = itemRegistry.register(newId, () -> new Item(new Item.Properties()));
                VEGETABLE_DERIVATIVES.put(newId, registeredItem);
            }
        }
    }

    // 生成对应的格雷科技机器配方（在 DataGen 中调用）
    public static void generateRecipes(/* 你的 RecipeProvider consumer 参数填这里 */) {
        for (AutoAdd item : AutoAdd.values()) {
            if (!"vegetables".equals(item.getTabGroup())) continue;
            List<ProcessType> disabledList = Arrays.asList(item.getDisabledTypes());

            for (ProcessType type : ProcessType.values()) {
                if (disabledList.contains(type)) continue;

                // TODO: 格雷配方生成占位符
                /*
                // 伪代码示例 (取决于GTCEu 1.20.1的API具体写法):
                switch (type) {
                    case SLICE:
                        GTRecipeTypes.CUTTER_RECIPES.recipeBuilder("cut_" + item.getId())
                            .inputItems(item.getId()) // 原始蔬菜
                            .outputItems(type.generateId(item.getId())) // 切片蔬菜
                            .duration(100).EUt(8)
                            .save(consumer);
                        break;
                    case SHRED:
                        // 车床配方 LATHE_RECIPES ...
                        break;
                    // ... 其他机器配方
                }
                */
            }
        }
    }
}
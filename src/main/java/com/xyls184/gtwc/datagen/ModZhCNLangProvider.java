package com.xyls184.gtwc.datagen;

import com.xyls184.gtwc.GTWC;
import com.xyls184.gtwc.item.AutoAdd;
import com.xyls184.gtwc.item.ModItems;
import com.xyls184.gtwc.item.ProcessType;
import com.xyls184.gtwc.item.VegetableProcessor;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;

import java.util.Arrays;
import java.util.List;

public class ModZhCNLangProvider extends LanguageProvider {
    public ModZhCNLangProvider(PackOutput output) {
        super(output, GTWC.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        // 1. 翻译创造模式物品栏 (Creative Tabs)
        add("itemGroup.gtwc.vegetables", "蔬菜");
        add("itemGroup.gtwc.vegetable_derivatives", "蔬菜半成品");
        // 以后加了谷物： add("itemGroup.gtwc.grain", "Grains");

        // 2. 自动生成：基础物品翻译
        for (AutoAdd food : AutoAdd.values()) {
            // 原版物品不需要翻译，直接跳过
            if (!food.isVanilla()) {
                add(ModItems.AUTO_ADD_MAP.get(food).get(), food.getZhName());
            }

            // 3. 自动生成：蔬菜半成品的翻译
            if ("vegetables".equals(food.getTabGroup())) {
                List<ProcessType> disabledList = Arrays.asList(food.getDisabledTypes());

                for (ProcessType type : ProcessType.values()) {
                    if (!type.isApplicableTo(food.getTabGroup())) continue;
                    if (disabledList.contains(type)) continue;

                    // 获取生成的 ID，比如 "sliced_zucchini"
                    String newId = type.generateId(food.getId());

                    // 去我们刚刚在 Processor 里建的仓库里，把对应的物品拿出来
                    RegistryObject<Item> regObj = VegetableProcessor.VEGETABLE_DERIVATIVES.get(newId);

                    if (regObj != null) {
                        // 调用我们在 ProcessType 里写的英文生成模板："%s片" -> "Sliced Zucchini"
                        String autoZhName = type.generateZhName(food.getZhName());
                        add(regObj.get(), autoZhName);
                    }
                }
            }
        }
    }
}
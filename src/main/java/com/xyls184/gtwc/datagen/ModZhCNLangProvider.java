package com.xyls184.gtwc.datagen;

import com.xyls184.gtwc.GTWC;
import com.xyls184.gtwc.item.AutoAdd;
import com.xyls184.gtwc.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModZhCNLangProvider extends LanguageProvider {
    public ModZhCNLangProvider(PackOutput output) {
        super(output, GTWC.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        // 自动生成中文本地化
        for (AutoAdd food : AutoAdd.values()) {
            add(ModItems.AUTO_ADD_MAP.get(food).get(), food.getZhName());
        }
        add("itemGroup.vegetables", "蔬菜");
    }


}

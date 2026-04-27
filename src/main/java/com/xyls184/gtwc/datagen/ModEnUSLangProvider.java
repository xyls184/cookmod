package com.xyls184.gtwc.datagen;

import com.xyls184.gtwc.GTWC;
import com.xyls184.gtwc.item.AutoAdd;
import com.xyls184.gtwc.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUSLangProvider extends LanguageProvider {
    public ModEnUSLangProvider(PackOutput output) {
        super(output, GTWC.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // generate English translation automatically
        for (AutoAdd food : AutoAdd.values()) {
            add(ModItems.AUTO_ADD_MAP.get(food).get(), food.getEnName());
        }
        add("itemGroup.vegetables", "蔬菜");
    }


}
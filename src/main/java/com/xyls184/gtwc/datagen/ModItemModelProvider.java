package com.xyls184.gtwc.datagen;

import com.xyls184.gtwc.GTWC;
import com.xyls184.gtwc.item.AutoAdd;
import com.xyls184.gtwc.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GTWC.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // 根据枚举自动生成模型和贴图路径
        for (AutoAdd food : AutoAdd.values()) {
            // basicItem 是 Forge 提供的一个便捷方法，它会自动生成 generated 类型的模型，并将贴图指向 item/物品id
            String id = food.getId();

            // 构造贴图文件在系统中的虚拟路径，用于检查
            ResourceLocation textureLoc = new ResourceLocation(GTWC.MOD_ID, "item/" + id);

            // 使用 existingFileHelper 检查 src/main/resources/assets/gtwc/textures/item/id.png 是否真实存在
            if (this.existingFileHelper.exists(textureLoc, PackType.CLIENT_RESOURCES, ".png", "textures")) {
                // 贴图存在：使用 Forge 默认的 basicItem，自动补全 parent 和 layer0
                basicItem(ModItems.AUTO_ADD_MAP.get(food).get());
            } else {
                // 贴图不存在：手动构建模型，只继承基础模型，不指定 texture
                // 这样 runData 不会因为找不到文件而报错，进游戏后也会因为缺失贴图而显示紫黑色方块
                getBuilder(id)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"));
            }
        }
    }
}
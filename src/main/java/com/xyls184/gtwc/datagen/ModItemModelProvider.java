package com.xyls184.gtwc.datagen;

import com.xyls184.gtwc.GTWC;
import com.xyls184.gtwc.item.AutoAdd;
import com.xyls184.gtwc.item.ModItems;
import com.xyls184.gtwc.item.VegetableProcessor;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GTWC.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // 1. 自动生成：基础物品的模型
        for (AutoAdd food : AutoAdd.values()) {
            // 【重要】：原版物品（如马铃薯）不需要我们生成模型，直接跳过
            if (food.isVanilla()) continue;

            String id = food.getId();
            RegistryObject<Item> itemObj = ModItems.AUTO_ADD_MAP.get(food);

            if (itemObj != null) {
                generateModelWithCheck(id, itemObj.get());
            }
        }

        // 2. 自动生成：蔬菜半成品的模型
        // 遍历我们在 Processor 里建的仓库
        for (Map.Entry<String, RegistryObject<Item>> entry : VegetableProcessor.VEGETABLE_DERIVATIVES.entrySet()) {
            String id = entry.getKey();         // 获取 ID，如 "sliced_zucchini"
            Item item = entry.getValue().get(); // 获取对应的物品实例

            generateModelWithCheck(id, item);
        }

        /* ==========================================================
           【示例模板】：未来如果有“谷物”和“肉类”半成品，可以这样加：
           ==========================================================
        // 3. 自动生成：谷物半成品的模型
        for (Map.Entry<String, RegistryObject<Item>> entry : GrainProcessor.GRAIN_DERIVATIVES.entrySet()) {
            generateModelWithCheck(entry.getKey(), entry.getValue().get());
        }

        // 4. 自动生成：肉类半成品的模型
        for (Map.Entry<String, RegistryObject<Item>> entry : MeatProcessor.MEAT_DERIVATIVES.entrySet()) {
            generateModelWithCheck(entry.getKey(), entry.getValue().get());
        }
        */
    }

    /**
     * 【新增辅助方法】：把检查贴图是否存在的逻辑抽离出来，方便复用
     * @param id 物品的 ID，比如 "sliced_zucchini"
     * @param item 具体的 Item 对象
     */
    private void generateModelWithCheck(String id, Item item) {
        // 构造贴图文件在系统中的虚拟路径
        ResourceLocation textureLoc = new ResourceLocation(GTWC.MOD_ID, "item/" + id);

        // 使用 existingFileHelper 检查 src/main/resources/assets/gtwc/textures/item/id.png 是否真实存在
        if (this.existingFileHelper.exists(textureLoc, PackType.CLIENT_RESOURCES, ".png", "textures")) {
            // 贴图存在：使用 Forge 默认的 basicItem，自动补全 parent 和 layer0
            basicItem(item);
        }
//        else {
//            // 贴图不存在：手动构建模型，只继承基础模型，不指定 texture
//            // 这样 runData 不会因为找不到文件而报错，进游戏后显示紫黑色方块
//            getBuilder(id).parent(new ModelFile.UncheckedModelFile("item/generated"));
//        }
    }
}
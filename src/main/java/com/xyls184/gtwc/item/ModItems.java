package com.xyls184.gtwc.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.Map;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "gtwc");

    // 用一个 Map 把生成的 RegistryObject 存起来，Datagen 和创造物品栏需要用到
    // 注意：这里存的仅仅是 AutoAdd 中定义的【模组新增基础物品】（如西葫芦、大米），原版物品不会存入
    public static final Map<AutoAdd, RegistryObject<Item>> AUTO_ADD_MAP =
            new EnumMap<>(AutoAdd.class);

    // 遍历枚举，自动注册好物品
    static {
        // 第一步：注册 AutoAdd 里的基础物品
        for (AutoAdd food : AutoAdd.values()) {

            // 【新增】：如果是原版物品（如原版的土豆、南瓜），直接跳过基础物品的注册！
            // 它们也不会被放入 AUTO_ADD_MAP 中，因为游戏里已经有原版的了。
            if (food.isVanilla()) {
                continue;
            }

            // 只有模组新增物品，才会在这里注册并存入 Map
            RegistryObject<Item> registeredItem = ITEMS.register(food.getId(),
                    () -> new Item(new Item.Properties()));
            AUTO_ADD_MAP.put(food, registeredItem);
        }

        // 第二步：调用蔬菜处理器，自动向 ITEMS 注册蔬菜的衍生物品（切片、块、泥等）
        // 这里依然会读取到原版土豆，并完美生成“土豆片”、“土豆泥”等衍生品
        VegetableProcessor.registerVegetableDerivatives(ITEMS);

        // 未来如果你添加了谷物处理器或肉类处理器，可以直接在这里继续追加：
        // GrainProcessor.registerGrainDerivatives(ITEMS);
        // MeatProcessor.registerMeatDerivatives(ITEMS);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
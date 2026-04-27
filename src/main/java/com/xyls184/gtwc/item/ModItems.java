package com.xyls184.gtwc.item;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.EnumMap;
import java.util.Map;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "gtwc");
    // 翻车后再试着这么写
//    public static final RegistryObject<Item> SWEET_POTATO = ITEMS.register("sweet_potato",
//            () -> new Item(new Item.Properties()));
//    public static final RegistryObject<Item> TARO = ITEMS.register("taro",
//            () -> new Item(new Item.Properties()));
//    public static final RegistryObject<Item> PEANUT = ITEMS.register("peanut",
//            () -> new Item(new Item.Properties()));
//    public static void register(IEventBus eventBus) {
//        ITEMS.register(eventBus);
//    }

    // 试着用forge data generator解决
    // 用一个 Map 把生成的 RegistryObject 存起来，Datagen 和创造物品栏需要用到
    public static final Map<AutoAdd, RegistryObject<Item>> AUTO_ADD_MAP =
            new EnumMap<>(AutoAdd.class);

    // 遍历枚举，自动注册好物品
    static {
        for (AutoAdd food : AutoAdd.values()) {
            RegistryObject<Item> registeredItem = ITEMS.register(food.getId(),
                    () -> new Item(new Item.Properties()));
            AUTO_ADD_MAP.put(food, registeredItem);
        }
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package com.xyls184.gtwc; 
//wokraft
import com.xyls184.gtwc.item.ModItems;
import com.xyls184.gtwc.item.ModCreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("gtwc")
public class GTWC {
    public static final String MOD_ID = "gtwc";

    public GTWC() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // 物品注册表
        ModItems.register(modEventBus);
        // 创造物品注册表
        ModCreativeModeTabs.register(modEventBus);
    }
}
package com.valkyrdev.valcore.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.valkyrdev.valcore.valcore;

public class enderioingots {

    public static void init() {
        Item pulsatinghsla = new Item().setUnlocalizedName("pulsatinghsla").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":pulsatinghsla");
        GameRegistry.registerItem(pulsatinghsla, "pulsatinghsla");
        Item conductivehsla = new Item().setUnlocalizedName("conductivehsla").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":conductivehsla");
        GameRegistry.registerItem(conductivehsla, "conductivehsla");
        Item silversilumin = new Item().setUnlocalizedName("silversilumin").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":silversilumin");
        GameRegistry.registerItem(silversilumin, "silversilumin");
        Item energeticsilumin = new Item().setUnlocalizedName("energeticsilumin").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":energeticsilumin");
        GameRegistry.registerItem(energeticsilumin, "energeticsilumin");
        Item vividspringsteel = new Item().setUnlocalizedName("vividspringsteel").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":vividspringsteel");
        GameRegistry.registerItem(vividspringsteel, "vividspringsteel");
        Item vibrantspringsteel = new Item().setUnlocalizedName("vibrantspringsteel").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":vibrantspringsteel");
        GameRegistry.registerItem(vibrantspringsteel, "vibrantspringsteel");
        Item inductivepinkslime = new Item().setUnlocalizedName("inductivepinkslime").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":inductivepinkslime");
        GameRegistry.registerItem(inductivepinkslime, "inductivepinkslime");
        Item inductivecrystalline = new Item().setUnlocalizedName("inductivecrystalline").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":inductivecrystalline");
        GameRegistry.registerItem(inductivecrystalline, "inductivecrystalline");
        Item melodictungsten = new Item().setUnlocalizedName("melodictungsten").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":melodictungsten");
        GameRegistry.registerItem(melodictungsten, "melodictungsten");
        Item stellarbedrock = new Item().setUnlocalizedName("stellarbedrock").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":stellarbedrock");
        GameRegistry.registerItem(stellarbedrock, "stellarbedrock");
    }
}

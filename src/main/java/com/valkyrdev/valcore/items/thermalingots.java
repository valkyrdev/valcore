package com.valkyrdev.valcore.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.valkyrdev.valcore.valcore;

public class thermalingots {
    public static void init() {
        Item invarcomp = new Item().setUnlocalizedName("invarcomp").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":invarcomp");
        GameRegistry.registerItem(invarcomp, invarcomp.getUnlocalizedName());
        Item signaliumcomp = new Item().setUnlocalizedName("signaliumcomp").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":signaliumcomp");
        GameRegistry.registerItem(signaliumcomp, signaliumcomp.getUnlocalizedName());
        Item enderiumcomp = new Item().setUnlocalizedName("enderiumcomp").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":enderiumcomp");
        GameRegistry.registerItem(enderiumcomp, enderiumcomp.getUnlocalizedName());
        Item solderingot = new Item().setUnlocalizedName("solderingot").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":solderingot");
        GameRegistry.registerItem(solderingot, solderingot.getUnlocalizedName());
        Item cupronickel = new Item().setUnlocalizedName("cupronickel").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":cupronickel");
        GameRegistry.registerItem(cupronickel, cupronickel.getUnlocalizedName());
    }
}

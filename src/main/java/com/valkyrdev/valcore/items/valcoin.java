 package com.valkyrdev.valcore.items;

 import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 import com.valkyrdev.valcore.valcore;

 public class valcoin {
     public static Item valcoin;

     public static void init() {
         Item diamondvalcoin = new Item().setUnlocalizedName("diamondvalcoin").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":diamondvalcoin");
         GameRegistry.registerItem(diamondvalcoin, diamondvalcoin.getUnlocalizedName());
         Item ironvalcoin = new Item().setUnlocalizedName("ironvalcoin").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":ironvalcoin");
         GameRegistry.registerItem(ironvalcoin, ironvalcoin.getUnlocalizedName());
         Item goldvalcoin = new Item().setUnlocalizedName("goldvalcoin").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":goldvalcoin");
         GameRegistry.registerItem(goldvalcoin, goldvalcoin.getUnlocalizedName());
     }
 }



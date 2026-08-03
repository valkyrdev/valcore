package com.valkyrdev.valcore.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.valkyrdev.valcore.valcore;

public class craftingcomps {
    public static void init() {
        Item soldercoil = new Item().setUnlocalizedName("soldercoil").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":soldercoil");
        GameRegistry.registerItem(soldercoil, "soldercoil");
        Item heatcoil = new Item().setUnlocalizedName("heatcoil").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":heatcoil");
        GameRegistry.registerItem(heatcoil, "heatcoil");
        Item soldertip = new Item().setUnlocalizedName("soldertip").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":soldertip");
        GameRegistry.registerItem(soldertip, "soldertip");
        Item soldertool = new Item().setUnlocalizedName("soldertool").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":soldertool");
        GameRegistry.registerItem(soldertool, "soldertool");
        Item sleepheart = new Item().setUnlocalizedName("sleepheart").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":sleepheart");
        GameRegistry.registerItem(sleepheart, "sleepheart");
        Item quantum_alloy = new Item().setUnlocalizedName("quantum_alloy").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":quantum_alloy");
        GameRegistry.registerItem(quantum_alloy, "quantum_alloy");
        Item quantum_circuit = new Item().setUnlocalizedName("quantum_circuit").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":quantum_circuit");
        GameRegistry.registerItem(quantum_circuit, "quantum_circuit");

}
}

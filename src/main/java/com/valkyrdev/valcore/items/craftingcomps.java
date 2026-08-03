package valkyrdev.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import valkyrdev.valcore;

public class craftingcomps {
    public static void init() {
        Item soldercoil = new Item().setUnlocalizedName("soldercoil").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":soldercoil");
        GameRegistry.registerItem(soldercoil, soldercoil.getUnlocalizedName());
        Item heatcoil = new Item().setUnlocalizedName("heatcoil").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":heatcoil");
        GameRegistry.registerItem(heatcoil, heatcoil.getUnlocalizedName());
        Item soldertip = new Item().setUnlocalizedName("soldertip").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":soldertip");
        GameRegistry.registerItem(soldertip, soldertip.getUnlocalizedName());
        Item soldertool = new Item().setUnlocalizedName("soldertool").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":soldertool");
        GameRegistry.registerItem(soldertool, soldertool.getUnlocalizedName());
        Item sleepheart = new Item().setUnlocalizedName("sleepheart").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":sleepheart");
        GameRegistry.registerItem(sleepheart, sleepheart.getUnlocalizedName());
        Item quantum_alloy = new Item().setUnlocalizedName("quantum_alloy").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":quantum_alloy");
        GameRegistry.registerItem(quantum_alloy, quantum_alloy.getUnlocalizedName());
        Item quantum_circuit = new Item().setUnlocalizedName("quantum_circuit").setCreativeTab(CreativeTabs.tabMisc).setTextureName(valcore.MODID + ":quantum_circuit");
        GameRegistry.registerItem(quantum_circuit, quantum_circuit.getUnlocalizedName());

}
}

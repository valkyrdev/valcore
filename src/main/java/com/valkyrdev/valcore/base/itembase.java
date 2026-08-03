package valkyrdev.base;

import cpw.mods.fml.common.registry.GameRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import valkyrdev.valcore;


public class itembase extends Item {
    public itembase() {
        super();
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
    @Override
    public Item setUnlocalizedName(String itemname) {
        GameRegistry.registerItem(this, itemname);
        return super.setUnlocalizedName(itemname);
        }
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IIconRegister iconRegister){
            itemIcon = iconRegister.registerIcon("valcore:" + getUnlocalizedName().substring(5).toLowerCase());

    }


}

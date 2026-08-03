 package valkyrdev;

 import cpw.mods.fml.common.Mod;
 import cpw.mods.fml.common.Mod.EventHandler;
 import cpw.mods.fml.common.Mod.Instance;
 import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
 import valkyrdev.items.iteminit;

 @Mod(modid = "valcore", name = "Valcore", version = "1.0.0")
 public class valcore {
     public static final String NAME = "Valcore";
     public static final String MODID = "valcore";
     public static final String VERSION = "1.0.0";

     @Mod.Instance("valcore")
     public static valcore instance;
  @EventHandler
   public void preInit(FMLPreInitializationEvent event) {
           iteminit.init();
          }

    @EventHandler
      public void init(FMLInitializationEvent event) {}
     @EventHandler
     public void postInit(FMLPostInitializationEvent event) {}
 }


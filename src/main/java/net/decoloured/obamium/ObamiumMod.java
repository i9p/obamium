package net.decoloured.obamium;

import net.decoloured.obamium.init.ObamiumBlocks;
import net.decoloured.obamium.init.ObamiumItems;
import net.decoloured.obamium.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/*
 * ok, so somebody (my cerebrum) said that you need to add
 * comments in your code in case some poor soul discovers it.
 * problem is that it is 2:56am at the time im writing this,
 * that thought woke me up from deep sleep and i cant go back
 * to sleep before i finish this :flushed::flushed::flushed:.
 */
@Mod(modid = ObamiumMod.MODID, name = ObamiumMod.MODNAME, version = ObamiumMod.VERSION)
public class ObamiumMod {
    public static final String MODID = "obamium";
    static final String MODNAME = "Obamium Mod";
    static final String VERSION = "0.8";
    private static final String CLIENT_PROXY_CLASS = "net.decoloured.obamium.proxy.ClientProxy";
    private static final String SERVER_PROXY_CLASS = "net.decoloured.obamium.proxy.CommonProxy";

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    private static CommonProxy proxy;

    public static final ObamiumTab tabObamium = new ObamiumTab("tabObamium");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ObamiumBlocks.init();
        ObamiumBlocks.register();
        ObamiumItems.init();
        ObamiumItems.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRenders();
        System.out.println("// Obama has taken over the Minecraft Universe");
        System.out.println("// May he bless us with his powerful weaponry and technology");
        System.out.println("obamium mod fully loaded");

        /* CRAFTING & SMELTING */
        GameRegistry.addRecipe(new ItemStack(ObamiumBlocks.obamium_block),
                "OOO",
                "OOO",
                "OOO",
                'O', ObamiumItems.obamium_ingot
        );

        // tools
        GameRegistry.addRecipe(new ItemStack(ObamiumItems.obamium_sword),
                "O",
                "O",
                "S",
                'O', ObamiumItems.obamium_ingot, 'S', Items.stick
        );
        GameRegistry.addRecipe(new ItemStack(ObamiumItems.obamium_pickaxe),
                "OOO",
                " S ",
                " S ",
                'O', ObamiumItems.obamium_ingot, 'S', Items.stick
        );
        GameRegistry.addRecipe(new ItemStack(ObamiumItems.obamium_axe),
                "OO",
                "SO",
                "S ",
                'O', ObamiumItems.obamium_ingot, 'S', Items.stick
        );
        GameRegistry.addRecipe(new ItemStack(ObamiumItems.obamium_shovel),
                "O",
                "S",
                "S",
                'O', ObamiumItems.obamium_ingot, 'S', Items.stick
        );
        GameRegistry.addRecipe(new ItemStack(ObamiumItems.obamium_hoe),
                "OO",
                "S ",
                "S ",
                'O', ObamiumItems.obamium_ingot, 'S', Items.stick
        );

        // armor
        GameRegistry.addRecipe(new ItemStack(ObamiumItems.obamas_sunglasses),
                "OOO",
                "G G",
                'O', ObamiumItems.obamium_ingot, 'G', Blocks.stained_glass_pane
        );
        GameRegistry.addRecipe(new ItemStack(ObamiumItems.obamas_shirt),
                "O O",
                "OOO",
                "OOO",
                'O', ObamiumItems.obamium_ingot
        );
        GameRegistry.addRecipe(new ItemStack(ObamiumItems.obamas_pants),
                "OOO",
                "O O",
                "O O",
                'O', ObamiumItems.obamium_ingot
        );
        GameRegistry.addRecipe(new ItemStack(ObamiumItems.obamas_shoes),
                "O O",
                "O O",
                'O', ObamiumItems.obamium_ingot
        );
        // shapeless
        GameRegistry.addShapelessRecipe(new ItemStack(ObamiumItems.obamium_ingot, 9),
                ObamiumBlocks.obamium_block
        );
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 64, 3),
                ObamiumItems.obamium_ingot
        );
        GameRegistry.addSmelting(ObamiumBlocks.obamium_ore, new ItemStack(ObamiumItems.obamium_ingot), 2F);
    }
}

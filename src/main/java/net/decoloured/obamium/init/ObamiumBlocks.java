package net.decoloured.obamium.init;

import net.decoloured.obamium.ObamiumMod;
import net.decoloured.obamium.init.blocks.BlockObamiumBlock;
import net.decoloured.obamium.init.blocks.BlockObamiumOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObamiumBlocks {
    public static Block obamium_block;
    public static Block obamium_ore;

    public static void init() { // sets block properties i.e. sets hardness, unlocalized name, creative tab
        obamium_block = new BlockObamiumBlock().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("obamium_block").setCreativeTab(ObamiumMod.tabObamium);
        obamium_ore = new BlockObamiumOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setUnlocalizedName("obamium_ore").setCreativeTab(ObamiumMod.tabObamium);
        System.out.println("obamium blocks initialised");
    }
    public static void register() { // registers the block so it's in the game
        GameRegistry.registerBlock(obamium_block, obamium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(obamium_ore, obamium_ore.getUnlocalizedName().substring(5));
        System.out.println("obamium blocks registered");
    }
    public static void registerRenders() { // thing below
        registerRender(obamium_block);
        registerRender(obamium_ore);
        System.out.println("obamium block model & textures registered");
    }
    private static void registerRender(Block block) { // can we go back to setTextureName()?
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ObamiumMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}

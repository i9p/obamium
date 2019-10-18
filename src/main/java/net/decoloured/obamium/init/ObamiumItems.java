package net.decoloured.obamium.init;

import net.decoloured.obamium.ObamiumMod;
import net.decoloured.obamium.init.tools.ItemObamiumArmor;
import net.decoloured.obamium.init.tools.ItemObamiumAxe;
import net.decoloured.obamium.init.tools.ItemObamiumPickaxe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObamiumItems {
    // materials
    public static final Item.ToolMaterial obamium = EnumHelper.addToolMaterial("obamium", 4, 4096, 16.0F, 12.0F, 32);
    private static final ItemArmor.ArmorMaterial obamiumArmor = EnumHelper.addArmorMaterial("obamium", ObamiumMod.MODID + ":obamium", 64, new int[] { 4, 10, 8, 5 }, 32);

    // items
    public static Item obamium_ingot;
    // tools
    public static Item obamium_sword;
    public static Item obamium_pickaxe;
    public static Item obamium_axe;
    public static Item obamium_shovel;
    public static Item obamium_hoe;
    // armor
    public static Item obamas_sunglasses;
    public static Item obamas_shirt;
    public static Item obamas_pants;
    public static Item obamas_shoes;

    public static void init() { // sets item type, unlocalised name and creative tab to item variables
        // items
        obamium_ingot = new Item().setUnlocalizedName("obamium_ingot").setCreativeTab(ObamiumMod.tabObamium);
        // tools
        obamium_sword = new ItemSword(obamium).setUnlocalizedName("obamium_sword").setCreativeTab(ObamiumMod.tabObamium);
        obamium_pickaxe = new ItemObamiumPickaxe(obamium).setUnlocalizedName("obamium_pickaxe").setCreativeTab(ObamiumMod.tabObamium); // ItemPickaxe protected?
        obamium_axe = new ItemObamiumAxe(obamium).setUnlocalizedName("obamium_axe").setCreativeTab(ObamiumMod.tabObamium); // ItemAxe protected?
        obamium_shovel = new ItemSpade(obamium).setUnlocalizedName("obamium_shovel").setCreativeTab(ObamiumMod.tabObamium);
        obamium_hoe = new ItemHoe(obamium).setUnlocalizedName("obamium_hoe").setCreativeTab(ObamiumMod.tabObamium);
        // armor
        obamas_sunglasses = new ItemObamiumArmor(obamiumArmor, 0).setUnlocalizedName("obamas_sunglasses").setCreativeTab(ObamiumMod.tabObamium);
        obamas_shirt = new ItemObamiumArmor(obamiumArmor, 1).setUnlocalizedName("obamas_shirt").setCreativeTab(ObamiumMod.tabObamium);
        obamas_pants = new ItemObamiumArmor(obamiumArmor, 2).setUnlocalizedName("obamas_pants").setCreativeTab(ObamiumMod.tabObamium);
        obamas_shoes = new ItemObamiumArmor(obamiumArmor, 3).setUnlocalizedName("obamas_shoes").setCreativeTab(ObamiumMod.tabObamium);

        /* confirmation */
        System.out.println("obamium items initialised");
    }
    public static void register() { // registers the item using the
        // items
        GameRegistry.registerItem(obamium_ingot, obamium_ingot.getUnlocalizedName().substring(5));
        // tools
        GameRegistry.registerItem(obamium_sword, obamium_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obamium_pickaxe, obamium_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obamium_axe, obamium_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obamium_shovel, obamium_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obamium_hoe, obamium_hoe.getUnlocalizedName().substring(5));
        // armor
        GameRegistry.registerItem(obamas_sunglasses, obamas_sunglasses.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obamas_shirt, obamas_shirt.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obamas_pants, obamas_pants.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obamas_shoes, obamas_shoes.getUnlocalizedName().substring(5));

        /* confirmation */
        System.out.println("obamium items registered");
    }
    public static void registerRenders() { // i don't have to type a lot because registerRender() does everything
        // items
        registerRender(obamium_ingot);
        // tools
        registerRender(obamium_sword);
        registerRender(obamium_pickaxe);
        registerRender(obamium_axe);
        registerRender(obamium_shovel);
        registerRender(obamium_hoe);
        // armor
        registerRender(obamas_sunglasses);
        registerRender(obamas_shirt);
        registerRender(obamas_pants);
        registerRender(obamas_shoes);

        /* confirmation */
        System.out.println("obamium item models & textures registered");
    }
    private static void registerRender(Item item) { // i would like to talk to the ceo of minecraft 1.8
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ObamiumMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}

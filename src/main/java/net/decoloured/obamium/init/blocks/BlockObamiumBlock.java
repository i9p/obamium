package net.decoloured.obamium.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockObamiumBlock extends Block {
    public BlockObamiumBlock() {
        super(Material.iron, MapColor.brownColor);
        setHarvestLevel("pickaxe", 4); // plan b
    }
}

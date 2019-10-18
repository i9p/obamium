package net.decoloured.obamium.init.blocks;

import net.minecraft.block.BlockOre;
import net.minecraft.block.material.MapColor;

public class BlockObamiumOre extends BlockOre {
    public BlockObamiumOre() {
        super(MapColor.stoneColor);
        setHarvestLevel("pickaxe", 3); // plan b
    }
}

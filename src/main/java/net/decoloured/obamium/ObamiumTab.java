package net.decoloured.obamium;

import net.decoloured.obamium.init.ObamiumItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ObamiumTab extends CreativeTabs {
    ObamiumTab(String label) { // creative mode tab image and unlocalised name
        super(label);
        this.setBackgroundImageName("obamium.png");
    }

    @Override
    public Item getTabIconItem() { // icon for creative mode tab
        return ObamiumItems.obamium_ingot;
    }
}

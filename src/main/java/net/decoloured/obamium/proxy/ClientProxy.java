package net.decoloured.obamium.proxy;

import net.decoloured.obamium.init.ObamiumBlocks;
import net.decoloured.obamium.init.ObamiumItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        ObamiumBlocks.registerRenders();
        ObamiumItems.registerRenders();
    }
}

package com.critmx.modulartrinkets.common;

import com.critmx.modulartrinkets.common.registry.BlockRegister;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class MTClientSetupClass {

    public static void renderAllTranslucent() {
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.TRINKETANVIL.get(), RenderType.translucent());
    }
}

package hualong.ticc.event;

import hualong.ticc.init.TiCCBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvent {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        setRenderLayer(event, TiCCBlocks.QUARTZ_GLASS, RenderType.cutout());
    }

    public static void setRenderLayer(FMLClientSetupEvent event, Supplier<? extends Block> object, RenderType type) {
        event.enqueueWork(() -> RenderTypeLookup.setRenderLayer(object.get(), type));
    }

}

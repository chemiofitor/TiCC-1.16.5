package hualong.ticc;

import hualong.ticc.compat.TenTiCC;
import hualong.ticc.init.TiCCBlocks;
import hualong.ticc.init.TiCCItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import slimeknights.mantle.registration.deferred.BlockDeferredRegister;
import slimeknights.mantle.registration.deferred.FluidDeferredRegister;
import slimeknights.mantle.registration.deferred.ItemDeferredRegister;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class TiCCUtil {
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(TiCCMod.MODID);
    public static final BlockDeferredRegister BLOCKS = new BlockDeferredRegister(TiCCMod.MODID);
    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(TiCCMod.MODID);
    public static final DeferredRegister<Modifier> MODIFIERS = DeferredRegister.create(Modifier.class, TiCCMod.MODID);
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
        BLOCKS.register(bus);
        FLUIDS.register(bus);
        MODIFIERS.register(bus);
    }

    public static void loadAll() {
        TiCCItems.load();
        TiCCBlocks.load();
        if (ModList.get().isLoaded("ten3"))
            TenTiCC.load();
    }
}

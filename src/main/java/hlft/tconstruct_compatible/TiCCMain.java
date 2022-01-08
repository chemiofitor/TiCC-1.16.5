package hlft.tconstruct_compatible;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("tconstruct_compatible")
public class TiCCMain {
    public static final String MODID = "tconstruct_compatible";

    public TiCCMain() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        TiCCUtil.loadAll();
        TiCCUtil.registerAll(bus);
    }
}

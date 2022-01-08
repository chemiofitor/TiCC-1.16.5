package hlft.tconstruct_compatible;

import hlft.tconstruct_compatible.index.TiCCBlocks;
import hlft.tconstruct_compatible.index.TiCCItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;

import javax.annotation.Nonnull;

import static hlft.tconstruct_compatible.TiCCMain.MODID;

public class TiCCUtil {
    public static final ItemGroup TAB = new ItemGroup(MODID) {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return TiCCItems.QUARTZ_GLASS.get().getDefaultInstance();
        }
    };

    public static ResourceLocation modRL(String path) {
        return new ResourceLocation(MODID, path);
    }

    public static void loadAll() {
        TiCCItems.load();
        TiCCBlocks.load();
    }

    public static void registerAll(IEventBus bus) {
        TiCCItems.ITEMS.register(bus);
        TiCCBlocks.BLOCKS.register(bus);
    }
}

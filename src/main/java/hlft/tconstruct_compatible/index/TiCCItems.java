package hlft.tconstruct_compatible.index;

import hlft.tconstruct_compatible.TiCCMain;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static hlft.tconstruct_compatible.TiCCUtil.TAB;

public class TiCCItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TiCCMain.MODID);

    public static final RegistryObject<Item> QUARTZ_GLASS = ITEMS.register("quartz_glass", () ->
            new BlockItem(TiCCBlocks.QUARTZ_GLASS.get(), itemPro()));

    public static final RegistryObject<Item> WOODEN_FRAME = ITEMS.register("wooden_frame", () ->
            new BlockItem(TiCCBlocks.WOODEN_FRAME.get(), itemPro()));

    public static final RegistryObject<Item> IRON_FRAME = ITEMS.register("iron_frame", () ->
            new BlockItem(TiCCBlocks.IRON_FRAME.get(), itemPro()));

    public static final RegistryObject<Item> LEAD_FRAME = ITEMS.register("lead_frame", () ->
            new BlockItem(TiCCBlocks.LEAD_FRAME.get(), itemPro()));

    public static final RegistryObject<Item> COPPER_FRAME = ITEMS.register("copper_frame", () ->
            new BlockItem(TiCCBlocks.COPPER_FRAME.get(), itemPro()));

    public static final RegistryObject<Item> TIN_FRAME = ITEMS.register("tin_frame", () ->
            new BlockItem(TiCCBlocks.TIN_FRAME.get(), itemPro()));


    public static void load() {}

    public static Item.Properties itemPro() {
        return new Item.Properties().tab(TAB);
    }
}

package hlft.tconstruct_compatible.index;

import hlft.tconstruct_compatible.TiCCMain;
import hlft.tconstruct_compatible.block.FrameBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TiCCBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TiCCMain.MODID);

    public static final RegistryObject<GlassBlock> QUARTZ_GLASS = BLOCKS.register("quartz_glass", () ->
            new GlassBlock(copyBlock(Blocks.GLASS)));

    public static final RegistryObject<FrameBlock> WOODEN_FRAME = BLOCKS.register("wooden_frame", FrameBlock::wooden);
    public static final RegistryObject<FrameBlock> IRON_FRAME = BLOCKS.register("iron_frame", FrameBlock::metal);
    public static final RegistryObject<FrameBlock> LEAD_FRAME = BLOCKS.register("lead_frame", FrameBlock::metal);
    public static final RegistryObject<FrameBlock> COPPER_FRAME = BLOCKS.register("copper_frame", FrameBlock::metal);
    public static final RegistryObject<FrameBlock> TIN_FRAME = BLOCKS.register("tin_frame", FrameBlock::metal);

    public static void load() {}

    public static AbstractBlock.Properties copyBlock(Block block) {
        return AbstractBlock.Properties.copy(block);
    }
}

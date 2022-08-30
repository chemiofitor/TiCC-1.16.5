package hualong.ticc.init;

import hualong.ticc.block.FrameBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.item.BlockItem;
import slimeknights.mantle.registration.object.ItemObject;

import static hualong.ticc.TiCCUtil.BLOCKS;
import static hualong.ticc.init.TiCCItems.itemPro;

public class TiCCBlocks {
    public static final ItemObject<GlassBlock> QUARTZ_GLASS = BLOCKS.register("quartz_glass", () ->
            new GlassBlock(copyBlock(Blocks.GLASS).strength(1F)), block -> new BlockItem(block, itemPro()));

    public static final ItemObject<FrameBlock> WOODEN_FRAME = BLOCKS.register("wooden_frame",
            FrameBlock::wooden, block -> new BlockItem(block, itemPro()));
    public static final ItemObject<FrameBlock> IRON_FRAME = BLOCKS.register("iron_frame",
            FrameBlock::metal, block -> new BlockItem(block, itemPro()));
    public static final ItemObject<FrameBlock> LEAD_FRAME = BLOCKS.register("lead_frame",
            FrameBlock::metal, block -> new BlockItem(block, itemPro()));
    public static final ItemObject<FrameBlock> COPPER_FRAME = BLOCKS.register("copper_frame",
            FrameBlock::metal, block -> new BlockItem(block, itemPro()));
    public static AbstractBlock.Properties copyBlock(Block block) {
        return AbstractBlock.Properties.copy(block);
    }

    public static void load() {}
}

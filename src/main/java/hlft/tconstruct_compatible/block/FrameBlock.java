package hlft.tconstruct_compatible.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class FrameBlock extends AbstractGlassBlock {
    public FrameBlock(Properties properties) {
        super(properties.noOcclusion()
                .isValidSpawn((state, reader, pos, type) -> false)
                .isViewBlocking((state, reader, pos) -> false)
                .isSuffocating((state, reader, pos) -> false)
        );
    }

    public static FrameBlock metal() {
        return new FrameBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL)
                .strength(3.2F,3.2F)
                .sound(SoundType.ANCIENT_DEBRIS)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }

    public static FrameBlock wooden() {
        return new FrameBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD)
                .strength(2F, 2F)
                .harvestTool(ToolType.AXE)
                .sound(SoundType.WOOD))
        {
            @Override
            public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                return 3;
            }
        };
    }

    @OnlyIn(Dist.CLIENT)
    public float getShadeBrightness(BlockState state,IBlockReader reader,BlockPos pos) {
        return 0.8F;
    }
}

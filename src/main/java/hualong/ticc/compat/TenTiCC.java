package hualong.ticc.compat;

import hualong.ticc.block.FrameBlock;
import hualong.ticc.modifiers.PhotosynthesisModifier;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import slimeknights.mantle.registration.ModelFluidAttributes;
import slimeknights.mantle.registration.object.FluidObject;
import slimeknights.mantle.registration.object.ItemObject;

import static hualong.ticc.TiCCUtil.*;
import static hualong.ticc.init.TiCCItems.itemPro;

public class TenTiCC {

    public static final RegistryObject<PhotosynthesisModifier> PHOTOSYNTHESIS = MODIFIERS.register("photosynthesis", PhotosynthesisModifier::new);

    public static final FluidObject<ForgeFlowingFluid> GLOWSTONE = FLUIDS.register("glowstone", hotBuilder().temperature(200), Material.LAVA,  15);
    public static final FluidObject<ForgeFlowingFluid> REDSTONE = FLUIDS.register("redstone", hotBuilder().temperature(700), Material.LAVA,  10);
    public static final FluidObject<ForgeFlowingFluid> MOLTEN_CHLORIUM = FLUIDS.register("molten_chlorium", hotBuilder().temperature(800), Material.LAVA,  14);
    public static final FluidObject<ForgeFlowingFluid> MOLTEN_POWERED_TIN = FLUIDS.register("molten_powered_tin", hotBuilder().temperature(300), Material.LAVA,  14);

    public static final ItemObject<FrameBlock> CHLORIUM_FRAME = BLOCKS.register("chlorium_frame",
            FrameBlock::metal, block -> new BlockItem(block, itemPro()));

    private static FluidAttributes.Builder hotBuilder() {
        return ModelFluidAttributes.builder().density(2000).viscosity(10000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA);
    }

    public static void load() {}
}

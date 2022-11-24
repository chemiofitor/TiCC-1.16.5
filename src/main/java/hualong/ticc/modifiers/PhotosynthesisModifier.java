package hualong.ticc.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class PhotosynthesisModifier extends Modifier {
    public PhotosynthesisModifier() {
        super(0x78D32E);
    }

    @Override
    public void onInventoryTick(IModifierToolStack tool, int level, World world, LivingEntity holder, int itemSlot, boolean isSelected, boolean isCorrectSlot, ItemStack stack) {
        if (!world.isClientSide && holder.tickCount % 20 == 0 && holder.getUseItem() != stack) {
            BlockPos pos = holder.blockPosition().above();
            if (RANDOM.nextFloat() < 0.15 * level && (world.isRainingAt(pos) || (world.isDay() && world.canSeeSky(pos)))) {
                if (tool.getDamage() > 0)
                    tool.setDamage(tool.getDamage() - 1);
            }
        }
    }
}

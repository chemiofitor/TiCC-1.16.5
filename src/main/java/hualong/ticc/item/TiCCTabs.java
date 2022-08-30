package hualong.ticc.item;

import hualong.ticc.TiCCMod;
import hualong.ticc.init.TiCCBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TiCCTabs {
    public static ItemGroup MAIN = new ItemGroup(TiCCMod.MODID) {
        @Override
        public ItemStack makeIcon() {
            return TiCCBlocks.IRON_FRAME.asItem().getDefaultInstance();
        }
    };
}

package hualong.ticc.init;

import net.minecraft.item.Item;

import static hualong.ticc.item.TiCCTabs.MAIN;

public class TiCCItems {
    public static void load() {}

    public static Item.Properties itemPro() {
        return new Item.Properties().tab(MAIN);
    }

}

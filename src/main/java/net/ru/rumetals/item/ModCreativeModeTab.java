package net.ru.rumetals.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab RU_METALS_TAB = new CreativeModeTab("rumetaltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MITHRIL.get());
        }
    };
}

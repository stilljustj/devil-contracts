package net.devilcontracts.item;

import net.devilcontracts.DevilContracts;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL = registerItem("steel", new Item(new Item.Settings()));
    public static final Item COAL_NUGGET = registerItem("coal_nugget", new Item(new Item.Settings()));

private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(DevilContracts.MOD_ID, name), item);
    }

    public static void registerModItems() {
    }
}
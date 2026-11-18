package net.devilcontracts.item;

import net.devilcontracts.DevilContracts;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL = registerItem("steel", new Item(new Item.Settings()));
    public static final Item COAL_NUGGET = registerItem("coal_nugget", new Item(new Item.Settings()));
    public static final Item KNIFE = registerItem("knife", new SwordItem(ModToolMaterials.KNIFE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.KNIFE, 2, -0.5f))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DevilContracts.MOD_ID, name), item);
    }

    public static void registerModItems() {
    }
}
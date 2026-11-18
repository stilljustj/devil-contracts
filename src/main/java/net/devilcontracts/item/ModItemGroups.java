package net.devilcontracts.item;

import net.devilcontracts.DevilContracts;
import net.devilcontracts.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DEVIL_CONTRACTS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DevilContracts.MOD_ID, "devil_contracts_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.STEEL))
                    .displayName(Text.translatable("itemgroup.devil-contracts.devil_contracts_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL);
                        entries.add(ModItems.COAL_NUGGET);
                        entries.add(ModItems.KNIFE);
                    })
                    .build());

    public static final ItemGroup DEVIL_CONTRACTS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DevilContracts.MOD_ID, "devil_contracts_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.STEEL_BLOCK))
                    .displayName(Text.translatable("itemgroup.devil-contracts.devil_contracts_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.STEEL_BLOCK);
                    })
                    .build());

    public static void registerItemGroups() {
        DevilContracts.LOGGER.info("Registering Item Groups for " + DevilContracts.MOD_ID);
    }
}
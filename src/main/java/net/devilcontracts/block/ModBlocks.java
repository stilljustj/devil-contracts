package net.devilcontracts.block;

import net.devilcontracts.DevilContracts;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

public static final Block STEEL_BLOCK = registerBlock(
        new Block(AbstractBlock.Settings.create().strength(5f)
        .requiresTool().sounds(BlockSoundGroup.COPPER)));



private static Block registerBlock(Block block) {
    registerBlockItem(block);
    return Registry.register(Registries.BLOCK, Identifier.of(DevilContracts.MOD_ID, "steel_block"), block);
}

private static void registerBlockItem(Block block) {
    Registry.register(Registries.ITEM, Identifier.of(DevilContracts.MOD_ID, "steel_block"),
            new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
    }
}

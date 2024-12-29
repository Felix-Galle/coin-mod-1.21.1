package net.felix.coinmod.block;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.felix.coinmod.CoinMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BIG_COIN_CRATE = registerBlock("big_coin_crate", new Block(AbstractBlock.Settings.create().strength(3f).sounds(BlockSoundGroup.WOOD)));








    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CoinMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CoinMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CoinMod.LOGGER.info("Registering Mod Blocks for " + CoinMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.BIG_COIN_CRATE);
        });
    }
}

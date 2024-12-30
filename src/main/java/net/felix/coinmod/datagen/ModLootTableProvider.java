package net.felix.coinmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.felix.coinmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.SurvivesExplosionLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    protected ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }


    @Override
    public void generate() {
        addDrop(ModBlocks.BIG_COIN_CRATE); // Drops itself
        addDrop(Blocks.DIRT, block -> LootTable.builder().pool(pool -> pool.rolls(1).with(ItemEntry.builder(Blocks.DIRT).conditionally(SurvivesExplosionLootCondition.builder())).pool(pool -> pool.rolls(1).with(ItemEntry.builder(Items.GOLD_NUGGET)).conditionally(RandomChanceLootCondition.builder(0.1f)));)

    }

}

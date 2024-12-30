package net.felix.coinmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.felix.coinmod.item.ModItems;
import net.felix.coinmod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.CURRENCY_ITEMS)
                .add(ModItems.GOLD_COIN)
                .add(ModItems.BIG_GOLD_COIN)
                .add(ModItems.SMALL_PILE_BIG_GOLD_COIN)
                .add(ModItems.BIG_PILE_BIG_GOLD_COIN)
                .add(ModItems.HUGE_PILE_BIG_GOLD_COIN)
                .add(ModItems.BAG_HUGE_PILE_BIG_GOLD_COIN);
    }
}

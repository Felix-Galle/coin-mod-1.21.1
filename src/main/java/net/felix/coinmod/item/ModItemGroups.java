package net.felix.coinmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.felix.coinmod.CoinMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CoinMod.MOD_ID, "gold_coin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gold_coin"))
                    .icon(() -> new ItemStack(ModItems.GOLD_COIN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COIN_FRAGMENT);
                        entries.add(ModItems.GOLD_COIN);
                        entries.add(ModItems.CRUSHED_AMETHYST);
                    }).build());

    public static void registerItemGroups() {
        CoinMod.LOGGER.info("Registering Item Groups for " + CoinMod.MOD_ID);
    }
}
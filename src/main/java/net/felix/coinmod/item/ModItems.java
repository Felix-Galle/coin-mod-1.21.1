package net.felix.coinmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.felix.coinmod.CoinMod;
import net.felix.coinmod.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;


public class ModItems {
    public static final Item COIN_FRAGMENT = registerItem("coin_fragment", new coin_fragment(new Item.Settings()));
    public static final Item GOLD_COIN = registerItem("gold_coin", new gold_coin(new Item.Settings()));
    public static final Item BIG_GOLD_COIN = registerItem("big_gold_coin", new big_gold_coin(new Item.Settings()));
    public static final Item CRUSHED_AMETHYST = registerItem("crushed_amethyst", new crushed_amethyst(new Item.Settings().food(ModFoodComponents.CRUSHED_AMETHYST)));
    public static final Item SMALL_PILE_BIG_GOLD_COIN = registerItem("small_pile_big_gold_coin", new small_pile_big_gold_coin(new Item.Settings()));
    public static final Item BIG_PILE_BIG_GOLD_COIN = registerItem("big_pile_big_gold_coin", new big_pile_big_gold_coin(new Item.Settings()));
    public static final Item HUGE_PILE_BIG_GOLD_COIN = registerItem("huge_pile_big_gold_coin", new huge_pile_big_gold_coin(new Item.Settings()));
    public static final Item BAG_HUGE_PILE_BIG_GOLD_COIN = registerItem("bag_huge_pile_big_gold_coin", new bag_huge_pile_big_gold_coin(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CoinMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoinMod.LOGGER.info("Registering Mod Items for " + CoinMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(COIN_FRAGMENT);
            entries.add(GOLD_COIN);
            entries.add(BIG_GOLD_COIN);
            entries.add(CRUSHED_AMETHYST);
            entries.add(SMALL_PILE_BIG_GOLD_COIN);
            entries.add(BIG_PILE_BIG_GOLD_COIN);
            entries.add(HUGE_PILE_BIG_GOLD_COIN);
            entries.add(BAG_HUGE_PILE_BIG_GOLD_COIN);

        });
    }
}

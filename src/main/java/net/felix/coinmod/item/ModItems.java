package net.felix.coinmod.item;



import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.felix.coinmod.CoinMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COIN_FRAGMENT = registerItem("coin_fragment", new Item(new Item.Settings()));
    public static final Item COIN = registerItem("coin", new Item(new Item.Settings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(COIN_FRAGMENT);
        entries.add(COIN);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CoinMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoinMod.LOGGER.info("Registering Mod Items for " + CoinMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}

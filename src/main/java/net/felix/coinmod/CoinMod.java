package net.felix.coinmod;

import net.fabricmc.api.ModInitializer;
import net.felix.coinmod.item.ModItemGroups;
import net.felix.coinmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoinMod implements ModInitializer {
	public static final String MOD_ID = "coinmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		//This is a test
	}
}
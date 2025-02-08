package net.felix.coinmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
//import net.felix.coinmod.datagen.ModBlockTagProvider;
//import net.felix.coinmod.datagen.ModItemTagProvider;
//import net.felix.coinmod.datagen.ModModelProvider;

public class CoinModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		//FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		//pack.addProvider(ModBlockTagProvider::new);
		//pack.addProvider(ModItemTagProvider::new);
		//pack.addProvider(ModModelProvider::new);
	}
}

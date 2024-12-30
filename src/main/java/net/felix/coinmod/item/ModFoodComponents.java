package net.felix.coinmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    //causes crushed_amethyst to act like edible drugs, allowing for a temporary buff
    public static final FoodComponent CRUSHED_AMETHYST = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300,1), 0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 3), 0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, 5), 0.7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 600, 5), 0.1f)
            .build();

}

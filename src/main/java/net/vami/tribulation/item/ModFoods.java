package net.vami.tribulation.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ECTOPLASM = new FoodProperties.Builder().nutrition(2).alwaysEat().fast().saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.5f).build();
}

package net.yunitrish.saplinor.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ApplePie = new FoodComponent.Builder().hunger(6).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0f).alwaysEdible().build();
}

package io.github.bl3dak.oresascended.init;

import io.github.bl3dak.oresascended.OresAscended;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OresAscended.MODID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(props()
                    .fireResistant()
                    .tab(OresAscended.TAB)));

    public static final RegistryObject<Item> TOURMALINE = ITEMS.register("tourmaline",
            () -> new Item(props()
                    .fireResistant()
                    .tab(OresAscended.TAB)));


    //tools stuff

    public static final RegistryObject<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(Tiers.SAPPHIRE, 5, 3.5f, props()));

    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(Tiers.SAPPHIRE, 4, 3.5f, props()));

    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(Tiers.SAPPHIRE, 7, 3.5f, props()));

    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(Tiers.SAPPHIRE, 3, 3.5f, props()));

    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(Tiers.SAPPHIRE, 2, 3.5f, props()));

    public static final RegistryObject<SwordItem> TOURMALINE_SWORD = ITEMS.register("tourmaline_sword",
            () -> new SwordItem(Tiers.TOURMALINE, 5, 3.5f, props()));

    public static final RegistryObject<PickaxeItem> TOURMALINE_PICKAXE = ITEMS.register("tourmaline_pickaxe",
            () -> new PickaxeItem(Tiers.TOURMALINE, 4, 3.5f, props()));

    public static final RegistryObject<AxeItem> TOURMALINE_AXE = ITEMS.register("tourmaline_axe",
            () -> new AxeItem(Tiers.TOURMALINE, 7, 3.5f, props()));

    public static final RegistryObject<ShovelItem> TOURMALINE_SHOVEL = ITEMS.register("tourmaline_shovel",
            () -> new ShovelItem(Tiers.TOURMALINE, 3, 3.5f, props()));

    public static final RegistryObject<HoeItem> TOURMALINE_HOE = ITEMS.register("tourmaline_hoe",
            () -> new HoeItem(Tiers.TOURMALINE, 2, 3.5f, props()));


    public static Item.Properties props() {
        return new Item.Properties().tab(OresAscended.TAB);
    }

    public static class Tiers {
        public static final Tier SAPPHIRE = new ForgeTier(
                5,
                800,
                15f,
                3f,
                22,
                null,
                () -> Ingredient.of(ItemInit.SAPPHIRE.get()));

        public static final Tier TOURMALINE = new ForgeTier(
                6,
                4062,
                16f,
                5f,
                20,
                null,
                () -> Ingredient.of(ItemInit.TOURMALINE.get()));
    }



    //food stuff
    public static final RegistryObject<Item> SAPPHIRE_APPLE = ITEMS.register("sapphire_apple",
            () -> new Item(props()
                    .food(Foods.SAPPHIRE_APPLE)
                    .tab(OresAscended.TAB)));

    public static final RegistryObject<Item> TOURMALINE_APPLE = ITEMS.register("tourmaline_apple",
            () -> new Item(props()
                    .food(Foods.TOURMALINE_APPLE)
                    .tab(OresAscended.TAB)));

    public static class Foods {
        public static final FoodProperties SAPPHIRE_APPLE = new FoodProperties.Builder()
                    .alwaysEat().nutrition(6)
                    .saturationMod(0.8f)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 3), 1f)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 6000, 4), 1f)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000), 1f)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 1), 1f)
                .build();


        public static final FoodProperties TOURMALINE_APPLE = new FoodProperties.Builder()
                    .alwaysEat().nutrition(8)
                    .saturationMod(1f)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200, 4), 1f)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 6000, 9), 1f)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000), 1f)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 2), 1f)
                .build();
    }
}


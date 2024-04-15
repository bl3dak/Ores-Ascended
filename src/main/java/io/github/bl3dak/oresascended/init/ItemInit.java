package io.github.bl3dak.oresascended.init;

import io.github.bl3dak.oresascended.OresAscended;
import io.github.bl3dak.oresascended.base.ModArmorMaterial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OresAscended.MODID);

    public static Item.Properties props() {
        return new Item.Properties().tab(OresAscended.TAB);
    }

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
            () -> new SwordItem(ToolTiers.SAPPHIRE, 5, -2.4f, props()));

    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ToolTiers.SAPPHIRE, 4, -2.8f, props()));

    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ToolTiers.SAPPHIRE, 7, -3.0f, props()));

    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ToolTiers.SAPPHIRE, 3, -3.0f, props()));

    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ToolTiers.SAPPHIRE, 2, -3.0f, props()));

    public static final RegistryObject<SwordItem> TOURMALINE_SWORD = ITEMS.register("tourmaline_sword",
            () -> new SwordItem(ToolTiers.TOURMALINE, 5, -2.4f, props()));

    public static final RegistryObject<PickaxeItem> TOURMALINE_PICKAXE = ITEMS.register("tourmaline_pickaxe",
            () -> new PickaxeItem(ToolTiers.TOURMALINE, 4, -2.8f, props()));

    public static final RegistryObject<AxeItem> TOURMALINE_AXE = ITEMS.register("tourmaline_axe",
            () -> new AxeItem(ToolTiers.TOURMALINE, 7, -3.0f, props()));

    public static final RegistryObject<ShovelItem> TOURMALINE_SHOVEL = ITEMS.register("tourmaline_shovel",
            () -> new ShovelItem(ToolTiers.TOURMALINE, 3, -3.0f, props()));

    public static final RegistryObject<HoeItem> TOURMALINE_HOE = ITEMS.register("tourmaline_hoe",
            () -> new HoeItem(ToolTiers.TOURMALINE, 2, -3.0f, props()));


    public static class ToolTiers {
        public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(new ForgeTier(
                    5,
                    800,
                    15f,
                    5f,
                    22,
                BlockInit.Tags.NEEDS_SAPPHIRE_TOOL,
                () -> Ingredient.of(ItemInit.SAPPHIRE.get())),
                new ResourceLocation(OresAscended.MODID, "sapphire"),
                List.of(Tiers.NETHERITE),
                List.of());

        public static final Tier TOURMALINE = TierSortingRegistry.registerTier(new ForgeTier(
                    6,
                    4062,
                    16f,
                    6f,
                    20,
                BlockInit.Tags.NEEDS_TOURMALINE_TOOL,
                () -> Ingredient.of(ItemInit.TOURMALINE.get())),
                new ResourceLocation(OresAscended.MODID, "tourmaline"),
                List.of(ToolTiers.SAPPHIRE),
                List.of());
    }


    //armor stuff

    public static final RegistryObject SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
        () -> new ArmorItem(ArmorTiers.SAPPHIRE, EquipmentSlot.FEET, props()));

    public static final RegistryObject SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ArmorTiers.SAPPHIRE, EquipmentSlot.LEGS, props()));

    public static final RegistryObject SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ArmorTiers.SAPPHIRE, EquipmentSlot.CHEST, props()));

    public static final RegistryObject SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(ArmorTiers.SAPPHIRE, EquipmentSlot.HEAD, props()));

    public static final RegistryObject TOURMALINE_BOOTS = ITEMS.register("tourmaline_boots",
            () -> new ArmorItem(ArmorTiers.TOURMALINE, EquipmentSlot.FEET, props()));

    public static final RegistryObject TOURMALINE_LEGGINGS = ITEMS.register("tourmaline_leggings",
            () -> new ArmorItem(ArmorTiers.TOURMALINE, EquipmentSlot.LEGS, props()));

    public static final RegistryObject TOURMALINE_CHESTPLATE = ITEMS.register("tourmaline_chestplate",
            () -> new ArmorItem(ArmorTiers.TOURMALINE, EquipmentSlot.CHEST, props()));

    public static final RegistryObject TOURMALINE_HELMET = ITEMS.register("tourmaline_helmet",
            () -> new ArmorItem(ArmorTiers.TOURMALINE, EquipmentSlot.HEAD, props()));

    public static class ArmorTiers {
        public static final ArmorMaterial SAPPHIRE = new ModArmorMaterial(
                "sapphire",
                30,
                new int[] {4, 7, 9, 4},
                22,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                3.5f,
                0.0f,
                () -> Ingredient.of(ItemInit.SAPPHIRE.get())
        );

        public static final ArmorMaterial TOURMALINE = new ModArmorMaterial(
                "tourmaline",
                40,
                new int[] {5, 8, 10, 5},
                20,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                4.0f,
                0.2f,
                () -> Ingredient.of(ItemInit.TOURMALINE.get())
        );
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


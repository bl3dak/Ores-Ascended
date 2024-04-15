package io.github.bl3dak.oresascended.init;

import io.github.bl3dak.oresascended.OresAscended;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OresAscended.MODID);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = register("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND)
                        .requiresCorrectToolForDrops()
                        .strength(6.0F, 7.0F)
                        .sound(SoundType.METAL)),
            new Item.Properties()
                    .tab(OresAscended.TAB));

    public static final RegistryObject<Block> TOURMALINE_BLOCK = register("tourmaline_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD)
                        .requiresCorrectToolForDrops()
                        .strength(12.0F, 1200.0F)
                        .sound(SoundType.METAL)),
            new Item.Properties()
                    .tab(OresAscended.TAB));


    public static final RegistryObject<Block> SAPPHIRE_ORE = register("sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.METAL), UniformInt.of(3, 7)),
            new Item.Properties()
                    .tab(OresAscended.TAB));

    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = register("deepslate_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(SAPPHIRE_ORE.get()).color(MaterialColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 3.0F)
                    .sound(SoundType.METAL), UniformInt.of(3, 7)),
            new Item.Properties()
                    .tab(OresAscended.TAB));

    public static final RegistryObject<Block> TOURMALINE_ORE = register("tourmaline_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(6.0F, 1200.0F)
                    .sound(SoundType.METAL), UniformInt.of(4, 8)),
            new Item.Properties()
                    .tab(OresAscended.TAB));

    public static final RegistryObject<Block> DEEPSLATE_TOURMALINE_ORE = register("deepslate_tourmaline_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(TOURMALINE_ORE.get()).color(MaterialColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    .strength(8.0F, 1200.0F)
                    .sound(SoundType.METAL), UniformInt.of(4, 8)),
            new Item.Properties()
                    .tab(OresAscended.TAB));


    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}


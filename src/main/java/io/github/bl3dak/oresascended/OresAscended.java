package io.github.bl3dak.oresascended;

import io.github.bl3dak.oresascended.init.BlockInit;
import io.github.bl3dak.oresascended.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(OresAscended.MODID)
public class OresAscended {
    public static final String MODID = "oresascended";

    public OresAscended() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);

        BlockInit.BLOCKS.register(bus);
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.SAPPHIRE.get().getDefaultInstance();
        }
    };
}

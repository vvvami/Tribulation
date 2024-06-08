package net.vami.tribulation.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vami.tribulation.Tribulation;
import net.vami.tribulation.block.ModBlocks;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Tribulation.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TRIBULATION_TAB = CREATIVE_MODE_TABS.register("tribulation_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VEIL_INGOT.get()))
                    .title(Component.translatable("creativetab.tribulation.tribulation_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.VEIL_INGOT.get());
                        pOutput.accept(ModItems.VEIL_DUST.get());
                        pOutput.accept(ModBlocks.VEIL_BLOCK.get());
                        pOutput.accept(ModItems.ECTOPLASM.get());
                        pOutput.accept(ModItems.HUOYAN_ESSENCE.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

package net.vami.tribulation.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vami.tribulation.Tribulation;
import net.vami.tribulation.item.custom.FuelItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tribulation.MOD_ID);

    public static final RegistryObject<Item> VEIL_INGOT = ITEMS.register("veil_ingot",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> VEIL_DUST = ITEMS.register("veil_dust",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ECTOPLASM = ITEMS.register("ectoplasm",
            () -> new Item(new Item.Properties().food(ModFoods.ECTOPLASM)));

    public static final RegistryObject<Item> HUOYAN_ESSENCE = ITEMS.register("huoyan_essence",
            () -> new FuelItem(new Item.Properties().fireResistant(),4000));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

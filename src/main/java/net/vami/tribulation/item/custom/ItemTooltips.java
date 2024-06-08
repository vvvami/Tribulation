package net.vami.tribulation.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.vami.tribulation.item.ModItems;

import javax.annotation.Nullable;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.List;

@Mod.EventBusSubscriber
public class ItemTooltips {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        execute(event, event.getItemStack(), event.getToolTip());
    }

    public static void execute(ItemStack itemstack, List<Component> tooltip) {
        execute(null, itemstack, tooltip);
    }

    private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
        if (tooltip == null)
            return;
        if (itemstack.is(ModItems.VEIL_INGOT.get())) {
            tooltip.add(Component.literal("§7§o" + Component.translatable("tooltip.tribulation.veil_ingot").getString()));
        }
    }
}

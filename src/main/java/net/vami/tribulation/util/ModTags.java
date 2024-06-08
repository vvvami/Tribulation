package net.vami.tribulation.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.vami.tribulation.Tribulation;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> VEIL_BLOCKS = tag("veil_blocks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Tribulation.MOD_ID, name));
        }
    }

    public static class Items {



        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Tribulation.MOD_ID, name));
        }
    }
}

package net.vami.tribulation.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;
import net.vami.tribulation.block.ModBlocks;
import net.vami.tribulation.item.ModItems;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> VEIL_SMELTABLES = List.of(ModItems.VEIL_DUST.get(), ModItems.ECTOPLASM.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreCooking(consumer, RecipeSerializer.SMELTING_RECIPE, VEIL_SMELTABLES, RecipeCategory.MISC,
                ModItems.VEIL_INGOT.get(), 2f, 800, "veil", "veil_ingot_blast_veil_dust");
        oreCooking(consumer, RecipeSerializer.BLASTING_RECIPE, VEIL_SMELTABLES, RecipeCategory.MISC,
                ModItems.VEIL_INGOT.get(), 2f, 400, "veil", "veil_ingot_blast_veil_dust");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VEIL_BLOCK.get())
                .pattern("VVV7")
                .pattern("VVV")
                .pattern("VVV")
                .define('V', ModItems.VEIL_INGOT.get())
                .unlockedBy(getHasName(ModItems.VEIL_INGOT.get()), has(ModItems.VEIL_INGOT.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VEIL_INGOT.get(), 9)
                .requires(ModBlocks.VEIL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.VEIL_BLOCK.get()), has(ModBlocks.VEIL_BLOCK.get()))
                .save(consumer);
    }


}

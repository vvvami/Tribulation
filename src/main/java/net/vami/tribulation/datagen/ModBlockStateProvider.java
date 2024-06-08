package net.vami.tribulation.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.vami.tribulation.Tribulation;
import net.vami.tribulation.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Tribulation.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        cubeBlockWithItem(ModBlocks.VEIL_BLOCK);

    }

    private void cubeBlockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

package net.gamerk.another_structures.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gamerk.another_structures.registries.ItemRegistry;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class AnotherModelsProvider extends FabricModelProvider {
    public AnotherModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemRegistry.EXPERIMENTAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemRegistry.EXPERIMENTAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemRegistry.EXPERIMENTAL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemRegistry.EXPERIMENTAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemRegistry.EXPERIMENTAL_SHOVEL, Models.HANDHELD);
    }
}

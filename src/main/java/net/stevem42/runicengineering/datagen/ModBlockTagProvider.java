package net.stevem42.runicengineering.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.stevem42.runicengineering.RunicEngineering;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, RunicEngineering.ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}

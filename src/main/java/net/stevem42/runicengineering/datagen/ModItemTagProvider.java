package net.stevem42.runicengineering.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.stevem42.runicengineering.RunicEngineering;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider  extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, RunicEngineering.ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}

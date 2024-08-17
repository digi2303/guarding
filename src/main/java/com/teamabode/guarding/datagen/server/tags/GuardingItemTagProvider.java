package com.teamabode.guarding.datagen.server.tags;

import com.teamabode.guarding.core.registry.GuardingItems;
import com.teamabode.guarding.core.tag.GuardingItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class GuardingItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public GuardingItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        this.getOrCreateTagBuilder(GuardingItemTags.SHIELD_ENCHANTABLE).addOptionalTag(ConventionalItemTags.SHIELD_TOOLS);
        this.getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE).setReplace(false).add(GuardingItems.NETHERITE_SHIELD);
        this.getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).setReplace(false).add(GuardingItems.NETHERITE_SHIELD);
        this.getOrCreateTagBuilder(ConventionalItemTags.SHIELD_TOOLS).setReplace(false).add(GuardingItems.NETHERITE_SHIELD);
    }
}

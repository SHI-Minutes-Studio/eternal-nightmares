package com.shiminutes.eternalnightmares.item;

import com.shiminutes.eternalnightmares.EternalNightmares;
import com.shiminutes.eternalnightmares.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DISABLED_STRUCTURES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EternalNightmares.MOD_ID, "disabled_structures"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.DUST))
                    .displayName(Text.translatable("itemgroup.eternalnightmares.disabled_structures"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DUST_BLOCK);
                        entries.add(ModItems.DUST);
                    }).build());


    public static void registerItemGroups() {
        EternalNightmares.LOGGER.info("Registering Mod Item Groups for Eternal Nightmares");
    }
}

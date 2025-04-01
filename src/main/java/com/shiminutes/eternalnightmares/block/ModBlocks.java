package com.shiminutes.eternalnightmares.block;

import com.shiminutes.eternalnightmares.EternalNightmares;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ColoredFallingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DUST_BLOCK = registerBlock("dust_block",
            new ColoredFallingBlock(new ColorCode(12434877),
                    AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(1f, 1f)
                    .sounds(BlockSoundGroup.GRAVEL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(EternalNightmares.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(EternalNightmares.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        EternalNightmares.LOGGER.info("Registering Mod Blocks for Eternal Nightmares");
    }
}

package com.shiminutes.eternalnightmares.block;

import com.shiminutes.eternalnightmares.EternalNightmares;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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

    public static final Block GRAY_ICE = registerBlock("gray_ice",
            new IceBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .slipperiness(0.986F)
                    .ticksRandomly()
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .solidBlock(Blocks::never)
            ));

    public static final Block COMPRESSED_GRAY_ICE = registerBlock("compressed_gray_ice",
                new Block(AbstractBlock.Settings.create()
                        .mapColor(MapColor.TERRACOTTA_CYAN)
                        .instrument(NoteBlockInstrument.CHIME)
                        .slipperiness(0.992F)
                        .strength(0.5F)
                        .sounds(BlockSoundGroup.GLASS)
            ));

    public static final Block HARDENED_GRAY_ICE = registerBlock("hardened_gray_ice",
            new TranslucentBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(2.8F)
                    .slipperiness(0.998F)
                    .sounds(BlockSoundGroup.GLASS)
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

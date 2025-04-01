package com.shiminutes.eternalnightmares.item;

import com.shiminutes.eternalnightmares.EternalNightmares;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DUST = registerItem("dust", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EternalNightmares.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EternalNightmares.LOGGER.info("Registering Mod Items for Eternal Nightmares");
    }
}

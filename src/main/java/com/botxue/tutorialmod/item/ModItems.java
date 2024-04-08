package com.botxue.tutorialmod.item;

import com.botxue.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ICE_ETHER = registerItems("ice_ether", new Item(new FabricItemSettings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries FabricItemGroupEntries) {
        FabricItemGroupEntries.add(ICE_ETHER);
    }

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

    }
}

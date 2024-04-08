package com.botxue.tutorialmod.item;

import com.botxue.tutorialmod.TutorialMod;
import com.botxue.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Tutorial_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "tutorial_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.tutorial_group"))
                    .icon(() -> new ItemStack(ModItems.ICE_ETHER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ICE_ETHER);
                        entries.add(Items.DIAMOND);
                        entries.add(ModBlocks.ICE_ETHER_BLOCK);
                        entries.add(Blocks.DIAMOND_BLOCK);
                    }).build());

    public static void registerModItemGroup() {

    }
}

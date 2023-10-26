package net.ergaxyn.tutorialmod.item;

import net.ergaxyn.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ergaxyn.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup INGREDIENTS_FOR_GUNS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "nylon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.nylon"))
                    .icon(() -> new ItemStack(ModItems.NYLON)).entries((displayContext, entries) -> {
                        entries.add(ModItems.NYLON);

                        entries.add(ModBlocks.NYLON_BLOCK);
                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}

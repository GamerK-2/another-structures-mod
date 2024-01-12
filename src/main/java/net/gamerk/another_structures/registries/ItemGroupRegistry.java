package net.gamerk.another_structures.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gamerk.another_structures.AnotherStructuresMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroupRegistry {
    public static final ItemGroup Another_Structures_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AnotherStructuresMod.MOD_ID, "another_structures"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.another_structures"))
                    .icon(() -> new ItemStack(ItemRegistry.EXPERIMENTAL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ItemRegistry.EXPERIMENTAL_INGOT);
                    }).build());

    public static void registerItemGroups() {
        AnotherStructuresMod.LOGGER.info("Registering Item Groups for " + AnotherStructuresMod.MOD_ID);
    }
}
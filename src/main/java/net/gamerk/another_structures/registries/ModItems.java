package net.gamerk.another_structures.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.gamerk.another_structures.AnotherStructuresMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item TEST;

    static {
        TEST = registerItem("test", new Item(new FabricItemSettings()));
    }

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(TEST);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AnotherStructuresMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AnotherStructuresMod.LOGGER.info("Registering Mod Items for " + AnotherStructuresMod.MOD_ID);
    }
}

package net.gamerk.another_structures.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gamerk.another_structures.AnotherStructuresMod;
import net.gamerk.another_structures.utils.AnotherToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {
    public static final Item EXPERIMENTAL_INGOT;
    public static final Item EXPERIMENTAL_PICKAXE;
    public static final Item EXPERIMENTAL_AXE;
    public static final Item EXPERIMENTAL_HOE;
    public static final Item EXPERIMENTAL_SWORD;
    public static final Item EXPERIMENTAL_SHOVEL;

    static {
        EXPERIMENTAL_INGOT = registerItem("experimental_ingot", new Item(new FabricItemSettings()));
        EXPERIMENTAL_PICKAXE = registerItem("experimental_pickaxe",
                new PickaxeItem(AnotherToolMaterial.EXPERIMENTAL, 1, -2.6F, new FabricItemSettings()));
        EXPERIMENTAL_AXE = registerItem("experimental_axe",
                new AxeItem(AnotherToolMaterial.EXPERIMENTAL, 5.5F, -2.9F, new FabricItemSettings()));
        EXPERIMENTAL_HOE = registerItem("experimental_hoe",
                new HoeItem(AnotherToolMaterial.EXPERIMENTAL, -4, 0.0F, new FabricItemSettings()));
        EXPERIMENTAL_SWORD = registerItem("experimental_sword",
                new SwordItem(AnotherToolMaterial.EXPERIMENTAL, 4, -2.2F, new FabricItemSettings()));
        EXPERIMENTAL_SHOVEL = registerItem("experimental_shovel",
                new ShovelItem(AnotherToolMaterial.EXPERIMENTAL, 2.0F, -2.8F, new FabricItemSettings()));
    }

    private static void ItemsToIngredientTab(FabricItemGroupEntries entries) {
        entries.add(EXPERIMENTAL_INGOT);
    }

    private static void ItemsToCombatTab(FabricItemGroupEntries entries) {
        entries.add(EXPERIMENTAL_SWORD);
    }

    private static void ItemsToToolsTab(FabricItemGroupEntries entries) {
        entries.add(EXPERIMENTAL_PICKAXE);
        entries.add(EXPERIMENTAL_SHOVEL);
        entries.add(EXPERIMENTAL_AXE);
        entries.add(EXPERIMENTAL_HOE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AnotherStructuresMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AnotherStructuresMod.LOGGER.info("Registering Mod Items for " + AnotherStructuresMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ItemRegistry::ItemsToIngredientTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ItemRegistry::ItemsToCombatTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ItemRegistry::ItemsToToolsTab);
    }
}

package net.stevem42.runicengineering.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stevem42.runicengineering.RunicEngineering;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RunicEngineering.ID);

    public static final DeferredItem<Item> test = ITEMS.registerItem("example_item", Item::new);

    public static final DeferredItem<Item> BISMUTH = ITEMS.registerItem("bismuth",
            Item::new, properties -> new Item.Properties().rarity(Rarity.EPIC));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

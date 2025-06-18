package com.ss.sombumod.item;

import com.ss.sombumod.SombuMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SombuMod.MODID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",

            () -> new Item(new Item.Properties())); //registered the item

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

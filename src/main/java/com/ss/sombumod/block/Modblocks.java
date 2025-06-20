package com.ss.sombumod.block;

import com.ss.sombumod.SombuMod;
import com.ss.sombumod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Modblocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SombuMod.MODID);

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}
}

package com.XiliDev.IPhoneMod.Events;

import com.XiliDev.IPhoneMod.init.ModBlocks;
import com.XiliDev.IPhoneMod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegisteringEvent
{

    @SubscribeEvent
    public void registerItem(RegistryEvent.Register<Item> e)
    {
        ModItems.INSTANCE.init();
        e.getRegistry().registerAll(ModItems.INSTANCE.getItems().toArray(new Item[0]));
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> e)
    {
        ModBlocks.INSTANCE.init();
        e.getRegistry().registerAll(ModBlocks.INSTANCE.getBlocks().toArray(new Block[0]));
    }
}

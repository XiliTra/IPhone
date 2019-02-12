package com.XiliDev.IPhoneMod.Events;

import com.XiliDev.IPhoneMod.init.ModItems;
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
}

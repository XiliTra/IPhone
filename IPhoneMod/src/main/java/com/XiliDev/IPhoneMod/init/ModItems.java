package com.XiliDev.IPhoneMod.init;

import com.XiliDev.IPhoneMod.item.CSMMItem;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import utils.References;

import java.util.List;

public class ModItems
{

    public static final ModItems INSTANCE = new ModItems();

    public static Item IPhone;

    private List<Item> items;
    private Object Item;

    public void init()
    {

        items = Lists.newArrayList();

        IPhone = new CSMMItem("iphone_7");

    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent e)
    {
        for(Item objet : items);
        {
            registerModel();
        }
    }


    private void registerModel(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }


    public List<Item> getItems()
    {
        return items;
    }
}


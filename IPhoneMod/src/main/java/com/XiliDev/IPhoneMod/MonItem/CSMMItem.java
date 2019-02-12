package com.XiliDev.IPhoneMod.MonItem;

import com.XiliDev.IPhoneMod.init.ModItems;
import net.minecraft.item.Item;

public class CSMMItem extends Item
{

    public CSMMItem(String name)
    {
        setRegistryName(name).setUnlocalizedName(name);

        ModItems.INSTANCE.getItems().add(this);
    }
}

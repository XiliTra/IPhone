package com.XiliDev.IPhoneMod.item;

import com.XiliDev.IPhoneMod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CSMMBlock extends Block
{
    public CSMMBlock(String name, Material materialIn)
    {
        super(materialIn);
        setRegistryName(name).setUnlocalizedName(name);

        ModBlocks.INSTANCE.getBlocks().add(this);
    }

    public CSMMBlock(String name, Material materialIn, float hardness, float resistance)
    {
        this(name, materialIn);

        setHardness(hardness);
        setResistance(resistance);
    }

    public CSMMBlock(String name, Material material, float hardness, float resistance, int harvestLevel, String harvestType)
    {
        this(name, material, hardness, resistance);

        setHarvestLevel(harvestType, harvestLevel);
    }


}

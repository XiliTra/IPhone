package proxy;

import com.XiliDev.IPhoneMod.init.ModBlocks;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{


    @Override
    public void preinit()
    {
        super.preinit();

        MinecraftForge.EVENT_BUS.register(ModBlocks.INSTANCE);
    }

    @Override
    public void init() {super.init(); }

    @Override
    public void postInit(){ super.postInit(); }
}
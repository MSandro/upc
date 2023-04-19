package ooo.foooooooooooo.upc.compat.megane;

import lol.bai.megane.api.MeganeModule;
import lol.bai.megane.api.registry.CommonRegistrar;
import ooo.foooooooooooo.upc.blockentity.UPCBlockEntityLV;
import ooo.foooooooooooo.upc.blockentity.UPCBlockEntityMV;

public class UPCMeganeModule implements MeganeModule {
    @Override
    public void registerCommon(CommonRegistrar registrar) {
        registrar.addEnergy(UPCBlockEntityLV.class, new UPCEnergyProvider<>());
        registrar.addEnergy(UPCBlockEntityMV.class, new UPCEnergyProvider<>());
    }
}

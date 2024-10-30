package net.camiluchis.camimod.Items;

import net.camiluchis.camimod.CamiMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InicializarItems {

    public static final DeferredRegister<Item>ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CamiMod.MODID);

    public static final RegistryObject<Item> COMESTIBLE = ITEMS.register
            ("comestible",()->new Item
                    (new Item.Properties().food
                            (new FoodProperties.Builder().saturationMod(8f).nutrition(3).build())));

    public static void Registrar(IEventBus bus){
        ITEMS.register(bus);
    }
}

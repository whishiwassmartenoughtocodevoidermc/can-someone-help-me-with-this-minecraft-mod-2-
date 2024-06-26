package net.robbie.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.robbie.tutorialmod.TutorialMod;

public class moditem {public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

                      public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
                              () -> new Item(new Item.Properties()));

                      public static void register(IEventBus eventBus) {
                          ITEMS.register(eventBus);

    }

}

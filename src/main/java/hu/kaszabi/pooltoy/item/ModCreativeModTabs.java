package hu.kaszabi.pooltoy.item;

import hu.kaszabi.pooltoy.PoolToyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PoolToyMod.MODID);

    public static final RegistryObject<CreativeModeTab> BLEP = CREATIVE_MODE_TABS.register("blep", 
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TESTITEM.get()))
        .title(Component.translatable("creativetab.blep"))
        .displayItems((pParameters, pOutput) -> { // All the items in this tab goes here
            pOutput.accept(ModItems.TESTITEM.get());
        })
        .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

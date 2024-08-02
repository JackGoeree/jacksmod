package net.crypticdawn.jacksmod.item;

import net.crypticdawn.jacksmod.JacksMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JacksMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JACKS_TAB = CREATIVE_MODE_TABS.register("jacks_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
            .title(Component.translatable("creativetab.jacks_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.SAPPHIRE.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

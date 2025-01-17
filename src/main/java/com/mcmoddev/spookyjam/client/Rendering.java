package com.mcmoddev.spookyjam.client;

import com.mcmoddev.spookyjam.CreepyCreepers;
import com.mcmoddev.spookyjam.client.rendering.RenderGhostlyCreeper;
import com.mcmoddev.spookyjam.common.entities.GhostlyCreeperEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = CreepyCreepers.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Rendering {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(GhostlyCreeperEntity.class, RenderGhostlyCreeper::new);
    }
}

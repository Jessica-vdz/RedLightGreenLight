package nl.jessicavdz.redlightgreenlight;

import nl.jessicavdz.redlightgreenlight.Block.BlockBreakCancel;
import nl.jessicavdz.redlightgreenlight.RedLight.RedLightBehavior;
import org.bukkit.plugin.java.JavaPlugin;

public final class RedLightGreenLight extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        RedLightBehavior redLightBehavior = new RedLightBehavior();

        getServer().getPluginManager().registerEvents(new BlockBreakCancel(),this);
        getServer().getPluginManager().registerEvents(redLightBehavior, this);
        redLightBehavior.light = false;

    }
}


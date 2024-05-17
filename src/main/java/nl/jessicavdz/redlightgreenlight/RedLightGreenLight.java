package nl.jessicavdz.redlightgreenlight;

import nl.jessicavdz.redlightgreenlight.Block.BlockBreakCancel;
import org.bukkit.plugin.java.JavaPlugin;

public final class RedLightGreenLight extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BlockBreakCancel(),this);
    }
}


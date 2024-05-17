package nl.jessicavdz.redlightgreenlight;

import nl.jessicavdz.redlightgreenlight.commands.*;

import nl.jessicavdz.redlightgreenlight.handlers.PlayerHandler;
import nl.jessicavdz.redlightgreenlight.listeners.*;
import nl.jessicavdz.redlightgreenlight.plugin.ScoreboardPlugin;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class RedLightGreenLight extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        new EventListener(this);

        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerHandler(), this);
        getServer().getPluginManager().registerEvents(new ScoreboardPlugin(), this);
        getServer().getPluginManager().registerEvents(new Countdown(this), this);
        getCommand("suicide").setExecutor(new SuicideCommand());
        getCommand("rules").setExecutor(new RulesCommand());
        getCommand("godmode").setExecutor(new GodCommand());
        getCommand("menu").setExecutor(new MenuCommand());


    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package nl.jessicavdz.redlightgreenlight.listeners;

import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EventListener implements Listener {

    public EventListener(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        //this shows a message when a player joins! pretty cool
        event.joinMessage(Component.text("a player has joined the game. bitch"));
    }

}

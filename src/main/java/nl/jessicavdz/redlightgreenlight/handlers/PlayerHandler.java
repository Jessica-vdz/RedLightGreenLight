package nl.jessicavdz.redlightgreenlight.handlers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerHandler implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.hasPlayedBefore()) {
            player.sendMessage(ChatColor.BLUE + "Welcome back " + ChatColor.AQUA + player.getName() + ChatColor.BLUE + " !");
        } else {
            player.sendMessage(ChatColor.BLUE + "Welcome " + ChatColor.AQUA + player.getName() + ChatColor.BLUE + " !");
        }
    }
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        if (player.hasPlayedBefore()) {
            player.sendMessage(player.getName() + " has left the game!" );
        }
    }
}


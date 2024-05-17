package nl.jessicavdz.redlightgreenlight.events;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

public class CountdownEvent extends Event {

    private Plugin plugin;

    public CountdownEvent(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onCountdown(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        BossBar bossBar = Bukkit.createBossBar("EUROPAPA " + player.getDisplayName(), BarColor.BLUE, BarStyle.SOLID);
        bossBar.addPlayer(player);
        bossBar.setVisible(true);

        new BukkitRunnable() {
            int timer = 0;

            public void run() {
                bossBar.setTitle("Timer: " + timer);

                timer++;
            }
        }.runTaskTimer(plugin, 0, 20);
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return null;
    }
}


package nl.jessicavdz.redlightgreenlight.plugin;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

public class ScoreboardPlugin implements Listener {

    @EventHandler
    public void setScoreboard(PlayerJoinEvent event) {
        /* here ill create a new scoreboard */
        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();

        /* this will set the scoreboard to the sidebar */
        Objective obj = board.registerNewObjective("redlightgreenlight", "dummy", "Test Server");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);

        /* here i will create the online players for the scoreboard */
        Score onlineName = obj.getScore(ChatColor.GRAY + ">> Online");
        onlineName.setScore(15);
        onlineName.setScore(Bukkit.getOnlinePlayers().size());
        event.getPlayer().setScoreboard(board);
        Team onlineCounter = board.registerNewTeam("onlineCounter");
        onlineCounter.addEntry(ChatColor.BLACK + " " + ChatColor.WHITE);
        if (Bukkit.getOnlinePlayers().size() == 0) {
            onlineCounter.setPrefix(ChatColor.DARK_RED + "0" + ChatColor.RED + Bukkit.getMaxPlayers());
        } else {
            onlineCounter.setPrefix("" + ChatColor.DARK_RED + Bukkit.getMaxPlayers() + ChatColor.RED + "/" + ChatColor.DARK_RED + Bukkit.getMaxPlayers());
        }

        /* here ill add the playtime to the scoreboard */
        Score playtime = obj.getScore(ChatColor.GRAY + ">> Playtime");
        playtime.setScore(13);

        Score playtime2 = obj.getScore(ChatColor.GRAY + "  ");
        playtime2.setScore(12);

        /* here ill ad the amount of wins of the player in the scoreboard*/
        Score wins = obj.getScore(ChatColor.GRAY + ">> Wins: " + 5);
        wins.setScore(11);

        Score wins2 = obj.getScore(ChatColor.GRAY + " ");
        wins2.setScore(10);

    }
    @EventHandler
    public void join(PlayerJoinEvent event) {
        Player player = event.getPlayer();
    }
}



package nl.jessicavdz.redlightgreenlight.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuicideCommand implements CommandExecutor {

    @Override

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {



        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setHealth(0.0);
            player.sendMessage(ChatColor.YELLOW+ ""+ ChatColor.BOLD+"You have choosen to end your life. "+ ChatColor.RED+ " F.");
        }
        return true;
    }

}
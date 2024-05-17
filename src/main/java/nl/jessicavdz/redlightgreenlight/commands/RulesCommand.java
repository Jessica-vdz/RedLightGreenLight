package nl.jessicavdz.redlightgreenlight.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RulesCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "The rules are simple just follow the next few rules and you're safe!" );
            player.sendMessage(ChatColor.YELLOW + " " + ChatColor.BOLD+ "1* Don't be stupid.");
            player.sendMessage(ChatColor.YELLOW+ " " +ChatColor.BOLD + " And that's it. bye");
        }

        return true;
    }

}

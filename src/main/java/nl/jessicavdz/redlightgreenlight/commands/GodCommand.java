package nl.jessicavdz.redlightgreenlight.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;
            if (player.isOp()){

                if (player.isInvulnerable()){
                    player.setInvulnerable(false);
                    player.sendMessage(ChatColor.RED+ "Godmode has been deactivated.");
                }else{
                    player.setInvulnerable(true);
                    player.sendMessage(ChatColor.GREEN+ "Godmode has been activated.");
                }
            }else{
                player.sendMessage(ChatColor.RED+ " You do not have permission to use this command.");
        }

        }
        return true;
    }
}

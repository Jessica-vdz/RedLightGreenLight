package nl.jessicavdz.redlightgreenlight.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player player) {
            ItemStack flower = new ItemStack(Material.FLOWERING_AZALEA_LEAVES, 2);

            player.getInventory().setItem(1,flower);
        }

        return true;
    }
}

package nl.jessicavdz.redlightgreenlight.listeners;
/* here i made sure that you cant break an block if you're not an op */

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();

        if(p.isOp()) {
            e.setCancelled(false);

        }else{
            e.setCancelled(true);
            p.sendMessage("you cant break the block!");
        }
        }

}

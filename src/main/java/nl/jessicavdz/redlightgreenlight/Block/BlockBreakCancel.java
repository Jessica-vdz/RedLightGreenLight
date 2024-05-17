package nl.jessicavdz.redlightgreenlight.Block;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakCancel implements Listener {

    @EventHandler

    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();

        if (!(player.isOp())){
            event.setCancelled(true);
        }
    }
}

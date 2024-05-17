package nl.jessicavdz.redlightgreenlight.RedLight;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;



public class RedLightBehavior implements Listener {

    public boolean light;

    @EventHandler
    public void onRedLightBehavior(PlayerMoveEvent event) {
        // if you move you will die... :)
        if (light) {
            Player player = event.getPlayer();
            player.setHealth(0);
        }
    }
}

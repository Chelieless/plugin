package razvan.plugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener{

	
	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(this, this);
		getCommand("cmc").setExecutor(new CommandTest());
		getCommand("kickduraxel").setExecutor(new KickDuraxel());
		getCommand("admins").setExecutor(new Admins());
	}
	
	@Override
	public void onDisable() {
		
		
		
	}
	
	@EventHandler
	public void StaffAnnouncer (PlayerJoinEvent e) {
		
		Player on = e.getPlayer();
		if(on.hasPermission("staff.announce")) {
			
			for (Player player : Bukkit.getServer().getOnlinePlayers()) {
				
				if(player.hasPermission("staff.announce")) {
					
					player.sendMessage(ChatColor.RED + "HELLO BOT: " + ChatColor.WHITE + "Staff member " + ChatColor.RED + on.getName() + ChatColor.WHITE + " logged in!");
					
				}
				
			}
			
		}
		
	}
	
	
}

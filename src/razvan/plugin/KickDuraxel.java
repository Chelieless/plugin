package razvan.plugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class KickDuraxel implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			if(player.hasPermission("kick.duraxel")) {
				
				boolean kicked = false;
				
				for(Player p : Bukkit.getServer().getOnlinePlayers()) {
					
					if(p.getName().equals("Duraxel")) {
						
						p.kickPlayer("Eh.");
						kicked = true;
						break;
						
					}
					
				}
				
				if(kicked) {
					
					player.sendMessage(ChatColor.RED + "Duraxel a fost dat afara! (fara loguri)");
					
				} else player.sendMessage(ChatColor.RED + "Duraxel nu-i online!");
				
			} else player.sendMessage(ChatColor.RED + "Nu ii poti da kick lui Duraxel!");
			
		}
		return true;
	}

}

package razvan.plugin;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Admins implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			StaffChecker group = new StaffChecker();
			
			ArrayList<String> helpers = new ArrayList<>();
			ArrayList<String> mods = new ArrayList<>();
			ArrayList<String> admins = new ArrayList<>();
			ArrayList<String> ops = new ArrayList<>();
			
			Player p = (Player) sender;
			int count = 0;
			
			p.sendMessage(ChatColor.RED + "MC.B-ZONE.RO STAFF " + ChatColor.WHITE + "Online: ");
			p.sendMessage(" ");
			for(Player staff : Bukkit.getServer().getOnlinePlayers()) {
				
				if(group.isHelper(staff)) {
					
					helpers.add(staff.getName());
					count++;
					
				}
				if(group.isMod(staff)) {
					
					mods.add(staff.getName());
					count++;
					
				}
				if(group.isAdmin(staff)) {
					
					admins.add(staff.getName());
					
				}
				if(group.isOp(staff)) {
					
					ops.add(staff.getName());
					count++;
					
				}
				
				
			}
			p.sendMessage(ChatColor.DARK_RED + "Operators: ");			
			for(int i = 0; i < ops.size(); i++) {
				
				StringBuilder sb = new StringBuilder();
				sb.append(ops.get(i));
				p.sendMessage(sb.toString());
				
			}
			p.sendMessage(" ");
			
			p.sendMessage(ChatColor.RED + "Admins: ");
			for(int i = 0; i < admins.size(); i++) {
				
				StringBuilder sb = new StringBuilder();
				sb.append(admins.get(i));
				p.sendMessage(sb.toString());
				
			}
			p.sendMessage(" ");
			
			p.sendMessage(ChatColor.BLUE + "Moderators: ");
			for(int i = 0; i < mods.size(); i++) {
				
				StringBuilder sb = new StringBuilder();
				sb.append(mods.get(i));
				p.sendMessage(sb.toString());
				
			}
			p.sendMessage(" ");
			
			p.sendMessage(ChatColor.DARK_GREEN + "Helpers: ");
			for(int i = 0; i < helpers.size(); i++) {
				
				StringBuilder sb = new StringBuilder();
				sb.append(helpers.get(i));
				p.sendMessage(sb.toString());
				
			}
			
			p.sendMessage(" ");
			p.sendMessage("Total online: " + ChatColor.RED + count);
		}
		
		return true;
	}

}

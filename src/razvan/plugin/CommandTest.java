package razvan.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTest implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {

			Player player = (Player) sender;
			if(player.hasPermission("cmc.use")) {
				int count = 0;
				while(count < 101) {

					count++;
					player.sendMessage(" ");
				}
			} else player.sendMessage(ChatColor.RED +  "Nu ai permisiunea necesara pentru a utiliza /cmc!");
		}
		return true;
	}

}

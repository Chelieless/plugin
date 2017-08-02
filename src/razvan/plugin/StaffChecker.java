package razvan.plugin;

import org.bukkit.entity.Player;

public class StaffChecker {
	
	StaffChecker() {
		
		
	}
	
	boolean isHelper(Player p) {
		
		boolean helper = false;
		
		if(p.hasPermission("staff.helper") && !(p.hasPermission("staff.mod") && p.hasPermission("staff.admin"))) helper = true;
		
		return helper;
		
	}
	
	boolean isMod(Player p) {
		
		boolean mod = false;
		
		if(p.hasPermission("staff.mod") && !(p.hasPermission("staff.helper") && p.hasPermission("staff.admin"))) mod = true;
		
		return mod;
		
	}
	
	boolean isAdmin(Player p) {
		
		boolean admin = false;
		
		if(p.hasPermission("staff.admin") && !(p.hasPermission("staff.helper") && p.hasPermission("staff.mod"))) admin = true;
		
		return admin;
		
	}
	
	boolean isOp(Player p) {
		
		boolean op = false;
		
		if(p.hasPermission("*")) op = true;
		
		return op;
		
	}

}

package ie.paradaux.arthorian.admin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import ie.paradaux.arthorian.api.language;
import ie.paradaux.arthorian.api.staffmanager;

public class arthorianadmin extends JavaPlugin implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("arthorianadmin") || cmd.getName().equalsIgnoreCase("admin")
				|| cmd.getName().equalsIgnoreCase("aadmin") || cmd.getName().equalsIgnoreCase("aa")
				|| cmd.getName().equalsIgnoreCase("a")) {
			if (arg3[0] == null) {
				language.aa(sender);
				language.arthorianadmin(sender);
				language.aa(sender);
				return true;
			} else if (arg3[0] == "freeze") {
				language.unavailable(sender);
				return true;
			} else if (arg3[0] == "makestaff") {
				if (sender.hasPermission("arthorian.admin") && sender.hasPermission("arthorian.netman")) {
					if (arg3.length == 2) {
						// Player p = (Player) getServer().getPlayer(arg3[0]);
						// // Turns
						// String arg3[0] into a player
						staffmanager.makeStaff(sender, arg3[1], arg3[2]); // Makes
																			// them
																			// staff
						return true;
					}
				}
			} else if (arg3[0] == "demote") {
				if (sender.hasPermission("arthorian.admin") && sender.hasPermission("arthorian.netman")) {
					if (arg3.length == 1 && getServer().getPlayer(arg3[0]) instanceof Player) {
						staffmanager.demote(sender, arg3[0]);
						return true;
					}
				}
			}
		}
		return false;
	}
}

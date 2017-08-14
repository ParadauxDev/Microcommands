package ie.paradaux.arthorian.admin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class makestaff extends JavaPlugin implements CommandExecutor {
	public static void makeStaff(CommandSender sender, String p, String group) {
		if (sender.hasPermission("admin.netman")) {
			if (group == "Trainee" || group == "Builder" || group == "Mod" || group == "SrMod" || group == "Admin"
					|| group == "SrAdmin" || group == "JrDev" || group == "Dev" || group == "SrvMan"
					|| group == "NetMan")
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
						"pex user " + p + " group add " + group);
		}
	}
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("makestaff") && sender.hasPermission("arthorian.admin") && sender.hasPermission("arthorian.netman")) {
			if (arg3.length >= 0 && arg3.length <= 1) {
				// Player p = (Player) getServer().getPlayer(arg3[0]); // Turns
				// String arg3[0] into a player
				makeStaff(sender, arg3[0], arg3[1]); // Makes them staff
			}
		}
		return false;
	}
}

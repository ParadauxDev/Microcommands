package ie.paradaux.arthorian.admin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import ie.paradaux.arthorian.api.staffmanager;

public class demote extends JavaPlugin implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("demote") && sender.hasPermission("arthorian.admin")
				&& sender.hasPermission("arthorian.netman")) {
			if (arg3.length == 0 && getServer().getPlayer(arg3[0]) instanceof Player) {
				staffmanager.demote(sender, arg3[0]);
			}
		}
		return false;
	}
}

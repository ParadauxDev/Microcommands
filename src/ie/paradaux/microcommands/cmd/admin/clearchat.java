package ie.paradaux.microcommands.cmd.admin;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import ie.paradaux.microcommands.mn.language;

public class clearchat implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("clearchat") && sender.hasPermission("arthorian.admin")) {
			for (int i = 0; i <= 100; i++) {
				Bukkit.broadcastMessage("");
			}
			Bukkit.broadcastMessage(language.prefix + ChatColor.GRAY + "Chat has been cleared by: " + sender.getName());
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("myclearchat") && sender.hasPermission("arthorian.myclearchat")) {
			for (int i = 0; i <= 100; i++) {
				sender.sendMessage("");
			}
			sender.sendMessage(language.prefix + ChatColor.GRAY + "Your Chat has been cleared.");
			return true;
		} else {
			return false;
		}
	}
}

package ie.paradaux.arthorian.admin.commands;



import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import ie.paradaux.arthorian.api.chatmanager;

public class gclearchat implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("gclearchat") && sender.hasPermission("arthorian.admin")) {
			chatmanager.globalclear(sender);
		}
		return false;
	}
}

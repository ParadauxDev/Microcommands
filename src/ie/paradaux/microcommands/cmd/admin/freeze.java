package ie.paradaux.microcommands.cmd.admin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class freeze {
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("freeze") && sender.hasPermission("arthorian.admin")) {

		}
		return false;
	}
}

package ie.paradaux.microcommands.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import ie.paradaux.microcommands.mn.language;

public class arthorianadmin implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("arthorianadmin")) {
			language.aa(sender);
			language.arthorianadmin(sender);
			language.aa(sender);
			return true;
		} else {
			return false;
		}
	}
}

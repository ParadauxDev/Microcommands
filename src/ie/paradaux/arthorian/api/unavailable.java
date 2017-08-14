package ie.paradaux.arthorian.api;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class unavailable implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		language.unavailable(sender);
		return true;
	}
}

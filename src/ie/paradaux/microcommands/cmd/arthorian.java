package ie.paradaux.microcommands.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import ie.paradaux.microcommands.mn.language;

public class arthorian implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("arthorian")) {
			language.an(sender);
			language.paragraph(sender);
			language.an(sender);
			return true;
		} else {
			return false;
		}

	}
}
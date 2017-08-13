package ie.paradaux.microcommands.cmd;

import java.awt.Color;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import ie.paradaux.microcommands.mn.language;

public class arthorian implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("arthorian")) {
			language.an(sender);
			sender.sendMessage(Color.gray + "Welcome to Arthorian Networks! The one, and only, network not in it ");
			sender.sendMessage(Color.gray + "for the money, sure money helps, but we're here for the experience!");
			sender.sendMessage(Color.gray + "Until we're sufficiently happy with our server we won't spend a dime");
			sender.sendMessage(Color.gray + "on our selves, everything will go towards benefiting our community and");
			sender.sendMessage(Color.gray + "improving our selection of gamemodes, whether that be hiring developers");
			sender.sendMessage(Color.gray + "upgrading hardware and more.");
			sender.sendMessage("");
			sender.sendMessage(Color.gray + "I hope you stick along for the ride, because we have no intentions of");
			sender.sendMessage(Color.gray + "Stopping yet!");
			sender.sendMessage(Color.gray + "- Paradaux");
			sender.sendMessage(Color.gray + "--- [[" + Color.cyan + "Arthorian Networks" + Color.gray + "]] ---");
			language.an(sender);
			return true;
		} else {
			return false;
		}

	}
}
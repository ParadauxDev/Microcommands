package ie.paradaux.arthorian.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import ie.paradaux.arthorian.api.chatmanager;
	
public class clearchat extends JavaPlugin {
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("clearchat")) {
			if (arg3.length == 0 && sender.hasPermission("arthorian.admin")
					&& getServer().getPlayer(arg3[0]) instanceof Player) {
				chatmanager.playerClear(getServer().getPlayer(arg3[0]), sender);
			} else if (arg3.length != 0) {
				Player p = (Player) sender;
				chatmanager.playerClear(p, sender);
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
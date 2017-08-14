package ie.paradaux.arthorian.api;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class chatmanager {
	public static void globalclear(CommandSender sender) { // Clears everyone's
															// chat
		for (int i = 0; i <= 100; i++) {
			Bukkit.broadcastMessage("");
		}
		Bukkit.broadcastMessage(language.prefix + ChatColor.GRAY + "Chat has been cleared by: " + sender.getName());
	}

	public static void playerClear(Player p, CommandSender sender) { // Clears specified player's chat  
		for (int i = 0; i <= 100; i++) {
			p.sendMessage("");
		}
		p.sendMessage(language.prefix + ChatColor.GRAY + "Your Chat has been cleared by: " + sender.getName());
	}
}

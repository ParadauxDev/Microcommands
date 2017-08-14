package ie.paradaux.arthorian.api;

import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;

public class language {
	public static String prefix = ChatColor.GRAY + "[" + ChatColor.DARK_AQUA + "Arthorian" + ChatColor.GRAY + "]";

	public static void an(CommandSender sender) {
		sender.sendMessage(
				ChatColor.GRAY + "--- [[" + ChatColor.DARK_AQUA + " Arthorian Networks " + ChatColor.GRAY + "]] ---");
	}

	public static void paragraph(CommandSender sender) {
		sender.sendMessage(ChatColor.GRAY
				+ " Welcome to Arthorian Networks! The one, and only, network not in it for the money, sure money helps, but we're here for the experience! Until we're sufficiently happy with our server we won't spend a dime on ourselves, everything will go towards benefiting our community and improving our selection of gamemodes, whether that be hiring developers, upgrading hardware and such.");
		sender.sendMessage("");
		sender.sendMessage(
				ChatColor.GRAY + " I hope you stick along for the ride, because we have no intentions of Stopping yet!");
		sender.sendMessage(ChatColor.GRAY + " - Paradaux");
	}

	public static void aa(CommandSender sender) {
		sender.sendMessage(ChatColor.GRAY + "--- [[" + ChatColor.DARK_AQUA + " Arthorian Administrator " + ChatColor.GRAY
				+ "]] ---");
	}

	public static void defineCMD(CommandSender sender, String a1, String a2) {
		sender.sendMessage(ChatColor.DARK_AQUA + a1 + ChatColor.GRAY + ": " + a2);
	}

	public static void arthorianadmin(CommandSender sender) {
		defineCMD(sender, "/myclearchat", "Clears YOUR chat");
		defineCMD(sender, "/clearchat", "Clears chat, globally.");
		defineCMD(sender, "/freeze", "Keeps a player @ y: 4096");
		sender.sendMessage(ChatColor.GRAY + "More coming soon.... I hope..");
	}
	public static void unavailable(CommandSender sender) {
		sender.sendMessage(language.prefix + " This command is currently unavailable.");
	}
}

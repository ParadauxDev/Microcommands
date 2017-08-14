package ie.paradaux.arthorian.api;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class staffmanager extends JavaPlugin {
	public static void demote(CommandSender sender, String p) {
		if (sender.hasPermission("admin.netman")) {
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group remove " + "Trainee");
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group remove " + "Builder");
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group remove " + "Mod");
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group remove " + "SrMod");
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group remove " + "Admin");
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group remove " + "SrAdmin");
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group remove " + "JrDev");
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group remove " + "Dev");
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group remove " + "SrvMan");
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group remove " + "NetMan");
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
					"pex user " + p + " group add " + "Player");
		}
	}
	public static void makeStaff(CommandSender sender, String p, String group) {
		if (sender.hasPermission("admin.netman")) {
			if (group == "Trainee" || group == "Builder" || group == "Mod" || group == "SrMod" || group == "Admin"
					|| group == "SrAdmin" || group == "JrDev" || group == "Dev" || group == "SrvMan"
					|| group == "NetMan")
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),
						"pex user " + p + " group add " + group);
		}
	}
}

package ie.paradaux.arthorian.admin.commands;
/*package ie.paradaux.microcommands.cmd.admin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import ie.paradaux.microcommands.mn.language;
import net.md_5.bungee.api.ChatColor;
public class freeze extends JavaPlugin implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String arg3[]) {
		if (cmd.getName().equalsIgnoreCase("freeze") && sender.hasPermission("arthorian.admin")) {
			Location location = ((Player) sender).getLocation();
			location.setWorld(Bukkit.getWorld("world"));
			location.setX(4096);
			location.setY(4096);
			location.setZ(4096);
			if (!(getServer().getPlayer(arg3[0]) instanceof Player)) {
				sender.sendMessage(language.prefix + ChatColor.GRAY + "Argument is not a player");
				return false;
			} else {
				Player p = (Player) getServer().getPlayer(arg3[0]);
				int i = Integer.parseInt(arg3[1]);
				while (i >= 1) {
					p.teleport(location);
					i = i - 1;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
				return true;
			}
		}
		return true;
	}
}
*/
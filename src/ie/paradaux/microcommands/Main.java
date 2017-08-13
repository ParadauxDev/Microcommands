package ie.paradaux.microcommands;

import org.bukkit.plugin.java.JavaPlugin;

import ie.paradaux.microcommands.cmd.arthorian;
import ie.paradaux.microcommands.cmd.arthorianadmin;

public class Main extends JavaPlugin {
	public void onEnable() {
		this.getCommand("arthorian").setExecutor(new arthorian());
		this.getCommand("arthorianadmin").setExecutor(new arthorianadmin());
	}
	public void onDisable() {
		// Who Ever uses this? Lmao
	}
}

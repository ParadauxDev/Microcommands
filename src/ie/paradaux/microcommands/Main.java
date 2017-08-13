package ie.paradaux.microcommands;

import org.bukkit.plugin.java.JavaPlugin;

import ie.paradaux.microcommands.cmd.arthorian;
import ie.paradaux.microcommands.cmd.arthorianadmin;
import ie.paradaux.microcommands.cmd.admin.clearchat;

public class Main extends JavaPlugin {
	public void onEnable() {
		this.getCommand("arthorian").setExecutor(new arthorian());
		this.getCommand("arthorianadmin").setExecutor(new arthorianadmin());
		this.getCommand("clearchat").setExecutor(new clearchat());
		this.getCommand("myclearchat").setExecutor(new clearchat());
		//this.getCommand("").setExecutor(new );
	}
	public void onDisable() {
		// Who Ever uses this? Lmao
	}
}

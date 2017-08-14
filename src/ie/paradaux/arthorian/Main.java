package ie.paradaux.arthorian;

import org.bukkit.plugin.java.JavaPlugin;

import ie.paradaux.arthorian.admin.commands.arthorianadmin;
import ie.paradaux.arthorian.admin.commands.demote;
import ie.paradaux.arthorian.admin.commands.gclearchat;
import ie.paradaux.arthorian.admin.commands.makestaff;
import ie.paradaux.arthorian.api.unavailable;
import ie.paradaux.arthorian.commands.arthorian;
import ie.paradaux.arthorian.commands.clearchat;

public class Main extends JavaPlugin {
	public void onEnable() {
		// Arthorian command, Displays post
		this.getCommand("arthorian").setExecutor(new arthorian());
		this.getCommand("clearchat").setExecutor(new clearchat());
		
		//Administrator Help commands / Base commands.
		this.getCommand("arthorianadmin").setExecutor(new arthorianadmin());
		this.getCommand("admin").setExecutor(new arthorianadmin());
		this.getCommand("aadmin").setExecutor(new arthorianadmin());
		this.getCommand("aa").setExecutor(new arthorianadmin());
		this.getCommand("a").setExecutor(new arthorianadmin());
		
		// Admin Features
		this.getCommand("gclearchat").setExecutor(new gclearchat());
		
		// Arthorian Staff Manager
		this.getCommand("makestaff").setExecutor(new makestaff());
		this.getCommand("demote").setExecutor(new demote());
		
		// Coming Soon Section
		this.getCommand("freeze").setExecutor(new unavailable());
		
		
		//this.getCommand("").setExecutor(new );
	}
	public void onDisable() {
		// Who Ever uses this? Lmao
	}
}
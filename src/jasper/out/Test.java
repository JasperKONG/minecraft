package jasper.out;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin{
	private static TestCom command;
	public void onEnable(){
		initCommand();
		PluginDescriptionFile pdFile = this.getDescription();
		System.out.println(pdFile.getName() + ", ver." + pdFile.getVersion() + " has dnabled ");
	}
	
	public void onDisable(){
		PluginDescriptionFile pdFile = this.getDescription();
		System.out.println(pdFile.getName() + ", ver." + pdFile.getVersion() + " has dnabled ");
	
	}
	
	public void initCommand(){
		command = new TestCom(this);
		getCommand("test").setExecutor(command);
		
	}
}

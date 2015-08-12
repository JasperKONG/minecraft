package jasper.out;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCom implements CommandExecutor {
	private final Test plugin;
	public TestCom(Test instance) {
		plugin = instance;
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	{
		if (!(sender instanceof Player)) {
			System.out.println("cannot use this command in this bukkit.");
		}
		Player py = (Player) sender;
		if(0 < args.length){
			if (args[0].equalsIgnoreCase("start")) {
				py.sendMessage(ChatColor.AQUA + " START!!!");
			}else if (args[0].equalsIgnoreCase("stop")) {
				py.sendMessage(ChatColor.AQUA + " STOP!!!");
			}
			return true;
			}
		
		py.sendMessage(ChatColor.YELLOW + "Test!!");
		return true;
		
	}
}

package mmcpets.mmcpets.commands;

import mmcpets.mmcpets.handlers.IC;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;


public class Pets implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCPets" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Opening " + ChatColor.GOLD + "" + ChatColor.BOLD + "Pets Menu" + ChatColor.GRAY + "!");
            Inventory pets = IC.createPets(player);
            player.openInventory(pets);
        }

        return true;
    }
}

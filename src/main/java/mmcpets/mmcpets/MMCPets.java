package mmcpets.mmcpets;

import mmcpets.mmcpets.commands.Pets;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import mmcpets.mmcpets.listeners.InventoryClick;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.HashMap;

public final class MMCPets extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("pets").setExecutor(new Pets());
        getServer().getPluginManager().registerEvents(new InventoryClick(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[MMCPets]: Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[MMCPets]: Plugin is disabled!");
    }

    public static MMCPets getInstance() {
        return getPlugin(MMCPets.class);
    }


    public static JavaPlugin getPlugin(){
        return getPlugin();
    }
}

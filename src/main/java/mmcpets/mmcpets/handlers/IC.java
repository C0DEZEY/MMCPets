package mmcpets.mmcpets.handlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import java.util.Base64;


public class IC {

    public static Inventory createPets(Player player){
        Inventory Petss = Bukkit.createInventory(player, 54, createString("&2&lPets"));


        Petss.setItem(10, ISC.createItem(Material.BLUE_WOOL, createString("&a R2-D2"),  createString("&A Aww How cute")));

        Petss.setItem(12, ISC.createItem(Material.GREEN_GLAZED_TERRACOTTA, createString("&a Baby Yoda"),  createString("&A Best one by far")));

        Petss.setItem(14, ISC.createItem(Material.GOLD_BLOCK, createString("&a C-3PO"),  createString("&A Hunk of metal")));

        Petss.setItem(16, ISC.createItem(Material.ORANGE_WOOL, createString("&a BB8"),  createString("&A R2D2 V2 ")));


        for (int i=0; i<54;i++) {
            ItemStack item = Petss.getItem(i);if (item == null || item.getType() == Material.AIR) {

                Petss.setItem(i, ISC.createItem(Material.BLACK_STAINED_GLASS_PANE, createString("&a"),  createString("&a")));

            }
        }

        return Petss;
    }


    public static String createString(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }

}

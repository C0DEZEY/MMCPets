package mmcpets.mmcpets.handlers;


import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemFlag;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;
import java.util.UUID;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

public class ISC {


    public static ItemStack createItem(Material material){ //just a minecraft item
        ItemStack i = new ItemStack(material);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName){ //just a minecraft item + new name
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, int customModelData){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setCustomModelData(customModelData);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, int customModelData, String l1){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, int customModelData, String l1, String l2){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, int customModelData, String l1, String l2, String l3){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, int customModelData, String l1, String l2, String l3, String l4){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, int customModelData, String l1, String l2, String l3, String l4, String l5){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        lore.add(l5);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, int customModelData, String l1, String l2, String l3, String l4, String l5, String l6){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        lore.add(l5);
        lore.add(l6);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, int customModelData, String l1, String l2, String l3, String l4, String l5, String l6, String l7){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        lore.add(l5);
        lore.add(l6);
        lore.add(l7);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, int customModelData, String l1, String l2, String l3, String l4, String l5, String l6, String l7, String l8){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        lore.add(l5);
        lore.add(l6);
        lore.add(l7);
        lore.add(l8);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, int customModelData, String l1, String l2, String l3, String l4, String l5, String l6, String l7, String l8, String l9){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        lore.add(l5);
        lore.add(l6);
        lore.add(l7);
        lore.add(l8);
        lore.add(l9);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, String l1){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, String l1, String l2){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, String l1, String l2, String l3){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, String l1, String l2, String l3, String l4){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, String l1, String l2, String l3, String l4, String l5){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        lore.add(l5);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, String l1, String l2, String l3, String l4, String l5, String l6){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        lore.add(l5);
        lore.add(l6);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, String l1, String l2, String l3, String l4, String l5, String l6, String l7){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        lore.add(l5);
        lore.add(l6);
        lore.add(l7);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, String l1, String l2, String l3, String l4, String l5, String l6, String l7, String l8){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        lore.add(l5);
        lore.add(l6);
        lore.add(l7);
        lore.add(l8);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }

    public static ItemStack createItem(Material material, String displayName, String l1, String l2, String l3, String l4, String l5, String l6, String l7, String l8, String l9){
        ItemStack i = new ItemStack(material);

        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(displayName);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(l1);
        lore.add(l2);
        lore.add(l3);
        lore.add(l4);
        lore.add(l5);
        lore.add(l6);
        lore.add(l7);
        lore.add(l8);
        lore.add(l9);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        i.setItemMeta(meta);

        return i;
    }



}

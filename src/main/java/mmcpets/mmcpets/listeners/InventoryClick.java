package mmcpets.mmcpets.listeners;

import mmcpets.mmcpets.MMCPets;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import org.bukkit.inventory.ItemStack;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InventoryClick implements Listener {

    private static final double TELEPORT_DELAY = 0.05; // Delay between pet teleports (in seconds)
    private static final double FOLLOW_DISTANCE = 1.75; // Maximum distance for following the player
    private static final double MAX_DISTANCE = 10.0; // Maximum distance between pet and player for teleportation

    private Map<UUID, ArmorStand> pets = new HashMap<>();
    private Map<UUID, String> equippedPets = new HashMap<>();

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        if (event.getCurrentItem() == null) {
            return;
        }

        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Pets")) {
            event.setCancelled(true);
            switch (event.getSlot()) {
                case 10:
                    createOrRemovePet(player, "R2D2", 10);
                    break;
                case 12:
                    createOrRemovePet(player, "Baby Yoda", 11);
                    break;
                case 14:
                    createOrRemovePet(player, "C-3PO", 12);
                    break;
                case 16:
                    createOrRemovePet(player, "BB8", 13);
                    break;
            }
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        removePet(player);
    }

    private void createOrRemovePet(Player player, String petName, int customModelData) {
        if (equippedPets.containsKey(player.getUniqueId()) && equippedPets.get(player.getUniqueId()).equals(petName)) {
            removePet(player);
            return;
        }

        removePet(player);

        // Summon armor stand as pet
        Location petLocation = player.getLocation().clone().add(0, -0.5, 0); // Spawn pet slightly below the player
        ArmorStand pet = (ArmorStand) player.getWorld().spawnEntity(petLocation, EntityType.ARMOR_STAND);
        pet.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + petName);
        pet.setCustomNameVisible(true);
        pet.setGravity(true);
        pet.setInvulnerable(true);
        pet.setVisible(false);
        pet.setSmall(false);
        pet.setBasePlate(false);
        pets.put(player.getUniqueId(), pet);
        equippedPets.put(player.getUniqueId(), petName);

        ItemStack item = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.RED + "");
        itemMeta.setCustomModelData(10);
        item.setItemMeta(itemMeta);
        pet.setHelmet(item);

        player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCPets" + ChatColor.DARK_GRAY + " | " + ChatColor.GRAY + "Spawned " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + pet.getCustomName());

        // Schedule task to update the pet's position
        new BukkitRunnable() {
            @Override
            public void run() {
                if (!player.isOnline() || player.isDead() || !equippedPets.containsKey(player.getUniqueId()) || !equippedPets.get(player.getUniqueId()).equals(petName)) {
                    removePet(player);
                    cancel();
                    return;
                }

                Location playerLocation = player.getLocation();
                Vector direction = new Vector(playerLocation.getDirection().getX(), 0, playerLocation.getDirection().getZ()).normalize();

                Location targetLocation = playerLocation.clone().subtract(direction.multiply(FOLLOW_DISTANCE));
                Block targetBlock = targetLocation.getBlock();
                Block blockBelow = targetBlock.getLocation().subtract(0, 1, 0).getBlock();

                if (targetLocation.distance(playerLocation) > MAX_DISTANCE || targetLocation.getBlock().getType() != Material.AIR) {
                    // Slow teleportation when the player turns around
                    pet.teleport(playerLocation.clone().subtract(direction.multiply(0.1)));


                } else {
                    if (targetLocation.getBlock().getType() == Material.AIR && !blockBelow.getType().equals(Material.AIR)) {
                        pet.teleport(targetBlock.getLocation().subtract(0,1,0));
                    }
                    pet.teleport(targetLocation);
                }

                // Swaying movement when the player is idle (not moving)
                if (playerLocation.getDirection().lengthSquared() == 0) {
                    double angle = (System.currentTimeMillis() / 1000.0) * Math.PI; // Calculate the angle based on time
                    double xOffset = Math.cos(angle) * 0.1; // Adjust the sway offset
                    pet.teleport(pet.getLocation().clone().add(xOffset, 0, 0));
                }
            }
        }.runTaskTimer(MMCPets.getInstance(), (long) (TELEPORT_DELAY * 20), (long) (TELEPORT_DELAY * 20));
    }

    private void removePet(Player player) {
        ArmorStand pet = pets.remove(player.getUniqueId());
        if (pet != null) {
            pet.remove();
            equippedPets.remove(player.getUniqueId());
            player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCPets" + ChatColor.DARK_GRAY + " | " + ChatColor.GRAY + "Despawned " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + pet.getCustomName() + ChatColor.GRAY + "!");
        }
    }
}

package me.barny1094875.shulkerstackingog.Listeners;

import me.barny1094875.shulkerstackingog.ShulkerStacking;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class ShulkerDragDupePrevention implements Listener
{

    @EventHandler(priority = EventPriority.LOWEST)
    public void shulkerDragDupePrevent(InventoryCloseEvent event)
    {
        ShulkerStacking.isInventoryClosed.put(event.getPlayer().getUniqueId(), true);
        Bukkit.getScheduler().runTaskLater(ShulkerStacking.getPlugin(),
                () -> ShulkerStacking.isInventoryClosed.put(event.getPlayer().getUniqueId(), false), 2);
    }
}

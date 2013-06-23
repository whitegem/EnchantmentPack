package com.sucy.active.enchants;

import com.sucy.active.ConfigurableEnchantment;
import com.sucy.active.data.EnchantDefaults;
import org.bukkit.Material;
import org.bukkit.plugin.Plugin;

public class Angler extends ConfigurableEnchantment {

    public Angler(Plugin plugin) {
        super(plugin, EnchantDefaults.ANGLER, new Material[] { Material.FISHING_ROD }, 5);
        description = "钓起更多的鱼";
    }
}

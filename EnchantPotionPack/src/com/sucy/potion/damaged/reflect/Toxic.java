package com.sucy.potion.damaged.reflect;

import com.sucy.potion.data.EnchantDefaults;
import com.sucy.potion.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Poisons enemies when they hit you
 */
public class Toxic extends PotionReflect {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Toxic(Plugin plugin) {
        super(plugin, EnchantDefaults.TOXIC, ItemSets.CHESTPLATES.getItems());
        description = "击中敌人时使其中毒";
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.POISON;
    }
}

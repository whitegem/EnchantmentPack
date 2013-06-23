package com.sucy.potion.hit.steal;

import com.sucy.potion.data.EnchantDefaults;
import com.sucy.potion.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Gains movement speed on attack
 */
public class Fervor extends PotionSteal {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Fervor(Plugin plugin) {
        super(plugin, EnchantDefaults.FERVOR, ItemSets.SWORDS.getItems());
        description = "击中敌人时获得额外速度";
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.SPEED;
    }
}

package com.sucy.potion.hit.inflict;

import com.sucy.potion.data.EnchantDefaults;
import com.sucy.potion.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Applies wither on hit
 */
public class Wither extends PotionInflict {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Wither(Plugin plugin) {
        super(plugin, EnchantDefaults.WITHER, ItemSets.HOES.getItems());
        description = "击中敌人时附加凋零效果";
    }

    /**
     * @return potion type applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.WITHER;
    }
}

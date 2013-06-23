package com.sucy.potion.damaged.absorb;

import com.sucy.potion.data.EnchantDefaults;
import com.sucy.potion.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Gains movement speed when hit
 */
public class Lively extends PotionAbsorb {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Lively(Plugin plugin) {
        super(plugin, EnchantDefaults.LIVELY, ItemSets.BOOTS.getItems());
        description = "被造成伤害之后增加额外速度";
    }

    /**
     * @return potion type applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.SPEED;
    }
}

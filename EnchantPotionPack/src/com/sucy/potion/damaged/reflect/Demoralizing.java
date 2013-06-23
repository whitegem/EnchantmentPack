package com.sucy.potion.damaged.reflect;

import com.sucy.potion.data.EnchantDefaults;
import com.sucy.potion.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Applies weakness when hit by an enemy
 */
public class Demoralizing extends PotionReflect {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Demoralizing(Plugin plugin) {
        super(plugin, EnchantDefaults.DEMORALIZING, ItemSets.CHESTPLATES.getItems());
        description = "���ٵ��˶��Լ���ɵ��˺�";
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.WEAKNESS;
    }
}

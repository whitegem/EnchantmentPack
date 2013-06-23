package com.sucy.potion.damaged.reflect;

import com.sucy.potion.data.EnchantDefaults;
import com.sucy.potion.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Applies wither when hit
 */
public class Cursed extends PotionReflect {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Cursed(Plugin plugin) {
        super(plugin, EnchantDefaults.CURSED, ItemSets.CHESTPLATES.getItems());
        description = "�Ե�������˺�ʱ�ɶ������ӵ���Ч��";
    }

    /**
     * @return potion type applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.WITHER;
    }
}

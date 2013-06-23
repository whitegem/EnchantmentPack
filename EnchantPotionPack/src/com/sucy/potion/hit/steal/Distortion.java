package com.sucy.potion.hit.steal;

import com.sucy.potion.data.EnchantDefaults;
import com.sucy.potion.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

public class Distortion extends PotionSteal {

    public Distortion(Plugin plugin) {
        super(plugin, EnchantDefaults.DISTORTION, ItemSets.HOES.getItems());
        description = "击中敌人时获得隐身能力";
    }

    public PotionEffectType type() {
        return PotionEffectType.INVISIBILITY;
    }
}

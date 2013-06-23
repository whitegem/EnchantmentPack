package com.sucy.trap.enchant;

import com.sucy.trap.data.EnchantDefaults;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

public class SlowTrap extends PotionTrap {

    public SlowTrap(Plugin plugin) {
        super(plugin, EnchantDefaults.SLOW_TRAP, 4, PotionEffectType.SLOW);
        description = "����һ�����������ٶȵ�����";
        layout = new boolean[][]{
                { false,  true, false,  true },
                {  true, false,  true, false,  true },
                { false,  true,  true,  true, false },
                {  true, false,  true, false,  true },
                { false,  true, false,  true }};
    }
}

package com.sucy.trap.enchant;

import com.sucy.trap.data.EnchantDefaults;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

public class SlowTrap extends PotionTrap {

    public SlowTrap(Plugin plugin) {
        super(plugin, EnchantDefaults.SLOW_TRAP, 4, PotionEffectType.SLOW);
        description = "放置一个减缓敌人速度的陷阱";
        layout = new boolean[][]{
                { false,  true, false,  true },
                {  true, false,  true, false,  true },
                { false,  true,  true,  true, false },
                {  true, false,  true, false,  true },
                { false,  true, false,  true }};
    }
}

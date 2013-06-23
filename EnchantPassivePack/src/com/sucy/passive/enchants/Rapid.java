package com.sucy.passive.enchants;

import com.sucy.passive.ConfigurableEnchantment;
import com.sucy.passive.data.EnchantDefaults;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.plugin.Plugin;

public class Rapid extends ConfigurableEnchantment {

    public Rapid(Plugin plugin) {
        super(plugin, EnchantDefaults.RAPID, new Material[] { Material.BOW }, 10);
        description = "以更快的速度射箭";
    }

    @Override
    public void applyProjectileEffect(LivingEntity user, int level, ProjectileLaunchEvent event) {
        event.getEntity().setVelocity(event.getEntity().getVelocity().multiply(speed(level)));
    }
}

package com.sucy.passive.enchants;

import com.sucy.passive.ConfigurableEnchantment;
import com.sucy.passive.data.EnchantDefaults;
import com.sucy.passive.data.ItemSets;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;

/**
 * Gain health on striking an enemy
 */
public class Lifesteal extends ConfigurableEnchantment {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Lifesteal(Plugin plugin) {
        super(plugin, EnchantDefaults.LIFESTEAL, ItemSets.HOES.getItems());
        description = "攻击时从对方身上吸取生命值";
    }

    /**
     * Gains health on hit
     *
     * @param user   player with the enchantment
     * @param target enemy that was hit
     * @param level  enchantment level
     * @param event  event details
     */
    @Override
    public void applyEffect(LivingEntity user, LivingEntity target, int level, EntityDamageByEntityEvent event) {

        // Check for a valid target
        if (!works(target, user)) return;

        // Get a name to use with the cooldown timers
        String name = user instanceof Player ? ((Player)user).getName() : "mob";

        // Make sure the timer isn't null
        if (timers.get(name) == null) timers.put(name, 0l);

        // Check the cooldown
        if (System.currentTimeMillis() - timers.get(name) < cooldown(level)) return;

        // Check the probability
        if (!roll(level)) return;

        // Gain health depending on enchantment level
        int health = user.getHealth() + health(level);
        if (health > user.getMaxHealth()) health = user.getMaxHealth();
        user.setHealth(health);

        // Update the cooldown timer
        timers.put(name, System.currentTimeMillis());
    }
}

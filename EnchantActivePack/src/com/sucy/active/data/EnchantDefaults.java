package com.sucy.active.data;

import com.sucy.active.EnchantActivePack;
import com.sucy.active.data.ConfigValues;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Default data for enchantments
 *
 * EnchantName, Attributes<name, value>
 */
public enum EnchantDefaults {

    ANGLER ("职业钓者", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.key, 4);
    }}),

    DASH ("冲锋", new Hashtable<String, Object>() {{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CD_BASE.getKey(), 5);
        put(ConfigValues.CD_BONUS.getKey(), 0);
        put(ConfigValues.DMG_BASE.getKey(), 1);
        put(ConfigValues.DMG_BONUS.getKey(), 1);
        put(ConfigValues.SPD_BASE.getKey(), 3);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),

    FIREBALL ("火♂球术", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.key, 10);
        put(ConfigValues.CD_BASE.key, 20);
        put(ConfigValues.CD_BONUS.key, 1.6);
    }}),

    FRIED ("炙热鱼钩", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.key, 1);
    }}),

    GRAPPLE ("飞索", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.key, 5);
        put(ConfigValues.RANGE_BASE.key, 10);
        put(ConfigValues.RANGE_BONUS.key, 2);
        put(ConfigValues.SPD_BASE.key, 0.4);
        put(ConfigValues.SPD_BONUS.key, 0);
    }}),

    HEAL ("治疗", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.key, 5);
        put(ConfigValues.CD_BASE.key, 15);
        put(ConfigValues.CD_BONUS.key, 0);
        put(ConfigValues.HP_BASE.key, 2);
        put(ConfigValues.HP_BONUS.key, 2);
    }}),

    PULL ("拖拽", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CD_BASE.getKey(), 10);
        put(ConfigValues.CD_BONUS.getKey(), 1);
        put(ConfigValues.SPD_BASE.getKey(), 0.3);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),

    REJUVENATING ("额外营养", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.key, 5);
        put(ConfigValues.HP_BASE.key, 1);
        put(ConfigValues.HP_BONUS.key, 1);
    }}),

    REPULSE ("击退", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CD_BASE.getKey(), 10);
        put(ConfigValues.CD_BONUS.getKey(), 1);
        put(ConfigValues.RANGE_BASE.getKey(), 10);
        put(ConfigValues.RANGE_BONUS.getKey(), 0);
        put(ConfigValues.SPD_BASE.getKey(), 8);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),

    TOSS ("投掷术", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CD_BASE.getKey(), 15);
        put(ConfigValues.CD_BONUS.getKey(), 0);
        put(ConfigValues.SPD_BASE.getKey(), 1);
        put(ConfigValues.SPD_BONUS.getKey(), 0.5);
        put(ConfigValues.DUR_BASE.getKey(), 5);
        put(ConfigValues.DUR_BONUS.getKey(), 0);
    }}),

    VORTEX ("黑洞", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CD_BASE.getKey(), 10);
        put(ConfigValues.CD_BONUS.getKey(), 1);
        put(ConfigValues.RANGE_BASE.getKey(), 10);
        put(ConfigValues.RANGE_BONUS.getKey(), 0);
        put(ConfigValues.SPD_BASE.getKey(), 0.3);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }});

    /**
     * Enchantment name
     */
    private final String name;

    /**
     * Enchantment attributes
     */
    private final Hashtable<String, Object> values;

    /**
     * Constructor
     *
     * @param name   enchantment name
     * @param values enchantment attributes
     */
    private EnchantDefaults(String name, Hashtable<String, Object> values) {
        this.name = name;
        this.values = values;

        // Make sure the config has at least the default values
        EnchantActivePack.put(getPath() + ConfigValues.PVP.getKey(), true);
        EnchantActivePack.put(getPath() + ConfigValues.PVE.getKey(), true);
        String[] names = values.keySet().toArray(new String[values.size()]);
        Arrays.sort(names);
        for (String key : names) {
            EnchantActivePack.put(getPath() + key, values.get(key));
        }
    }

    /**
     * @return enchantment name
     */
    public String getName() {
        return name;
    }

    /**
     * @return enchantment config path
     */
    public String getPath() {
        return name.replace(" ", "") + ".";
    }

    /**
     * @return enchantment attributes
     */
    public Hashtable<String, Object> getValues() {
        return values;
    }
}

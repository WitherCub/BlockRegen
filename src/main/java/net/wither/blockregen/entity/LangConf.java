package net.wither.blockregen.entity;

import com.massivecraft.massivecore.store.Entity;

public class LangConf extends Entity<LangConf> {
    private static LangConf i = new LangConf();
    public static LangConf get() {
        return i;
    }
    public static void set(LangConf conf) {i = conf;}

    public String msgAddedBlock = "&c&lBlockRegen &7// &aAdded block.";
    public String msgRemovedBlock = "&c&lBlockRegen &7// &cRemoved block.";
    public String msgAddedPermission = "&c&lBlockRegen &7// &aAdded permission to &e{player}&a.";
    public String msgRemovedPermission = "&c&lBlockRegen &7// &cRemoved permission from &e{player}&c.";
    public String msgUnknownPlayer = "&c&lBlockRegen &7// &cUnknown player.";
    public String msgUnknownBlock = "&c&lBlockRegen &7// &cUnknown block";
    public String msgErrorBoolean = "&c&lBlockRegen &7// &cPlease enter a boolean value (true/false)";
    public String msgErrorMaterial = "&c&lBlockRegen &7// &cPlease enter a material value &e(https://helpch.at/docs/1.8/org/bukkit/Material.html)";
    public String msgErrorInteger = "&c&lBlockRegen &7// &cPlease enter a whole number.";
    public String msgAlreadyHasPerm = "&c&lBlockRegen &7// &cPlayer already has perm.";
    public String msgNoPermFound = "&c&lBlockRegen &7// &cPlayer doesn't have perm.";
}

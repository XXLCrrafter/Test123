package de.lunaarix.test123;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test123 extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Moin");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

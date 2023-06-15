package net.evolium.pluginname;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    /**
     * Plugin disabled entry point.
     */
    @Override
    public void onDisable() {
        getLogger().info(String.format(
                "%s %s is now disabled.",
                getDescription().getName(),
                getDescription().getVersion()
        ));
    }

    /**
     * Plugin enabled entry point.
     */
    @Override
    public void onEnable() {
        saveDefaultConfig();
    }

    /**
     * Listeners should be initialized here. If an instance of 'Main' is needed, please
     * pass "this" into the constructor of what listener instance needs it. Avoid Singleton
     * unless it's necessary to use it.
     */
    private void registerListeners() {

    }

    /**
     * Commands and tab completion should be set here. If an instance of 'Main' is needed, please
     * pass "this" into the constructor of what command instance needs it. Avoid Singleton
     * unless it's necessary to use it.
     */
    private void registerCommands() {

    }
}

package de.test.main;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    public static boolean ExistsPlayer(Player p){
        return (p.isBanned() ? true : false);
    }

}

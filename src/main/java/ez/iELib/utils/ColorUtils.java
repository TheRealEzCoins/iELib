package ez.iELib.utils;

import org.bukkit.ChatColor;

public class ColorUtils {
    public static String color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
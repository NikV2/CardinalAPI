package me.nik.cardinal.api;

import org.bukkit.entity.Player;

public interface CardinalAPI {

    /**
     * Gets a player's Ping
     *
     * @param player The player
     * @return The player's ping
     */
    int getPing(Player player);

    /**
     * Gets the Server's last TPS
     *
     * @return The server's last TPS
     */
    double getTPS();

    /**
     * Get if a player is able to bypass the Anticheat (Has the Bypass permission)
     *
     * @param player The player
     * @return Whether or not he can Bypass
     */
    boolean canBypassAnticheat(Player player);
}
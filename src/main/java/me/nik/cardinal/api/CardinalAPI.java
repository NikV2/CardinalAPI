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
     * Check if a player is an admin
     *
     * @param player The player to check
     * @return Whether or not that player is an Admin
     */
    boolean isAdmin(Player player);
}
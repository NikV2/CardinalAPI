package me.nik.cardinal.api;

import org.bukkit.entity.Player;

public interface CardinalAPI {
    double getTPS();

    int getPing(Player player);
}
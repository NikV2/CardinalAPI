package me.nik.cardinal.api;

import org.bukkit.entity.Player;

public interface CardinalAPI {

    int getPing(Player player);

    double getTPS();

    boolean isAdmin(Player player);
}
package me.nik.cardinal.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerPunishEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final String check;

    public PlayerPunishEvent(Player player, String check) {
        this.player = player;
        this.check = check;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getPlayer() {
        return player;
    }

    public String getCheck() {
        return check;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
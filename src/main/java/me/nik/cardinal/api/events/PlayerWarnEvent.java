package me.nik.cardinal.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerWarnEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final String from;
    private final Player player;
    private final String reason;

    public PlayerWarnEvent(String from, Player player, String reason) {
        this.from = from;
        this.player = player;
        this.reason = reason;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public String getFrom() {
        return from;
    }

    public Player getPlayer() {
        return player;
    }

    public String getReason() {
        return reason;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
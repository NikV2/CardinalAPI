package me.nik.cardinal.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BotAttackEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final int connectionsPerSecond;

    public BotAttackEvent(int connectionsPerSecond) {
        super(true);
        this.connectionsPerSecond = connectionsPerSecond;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public int getConnectionsPerSecond() {
        return connectionsPerSecond;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
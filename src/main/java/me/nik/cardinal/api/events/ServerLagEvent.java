package me.nik.cardinal.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ServerLagEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final double tps;

    public ServerLagEvent(double tps) {
        this.tps = tps;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public double getTPS() {
        return tps;
    }
}
package me.nik.cardinal.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerProxyEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final String address;

    public PlayerProxyEvent(String address) {
        this.address = address;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public String getAddress() {
        return address;
    }
}
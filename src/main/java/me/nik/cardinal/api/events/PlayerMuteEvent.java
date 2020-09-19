package me.nik.cardinal.api.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerMuteEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final String player;
    private final String reason;
    private final String muter;
    private final String duration;
    private boolean cancel = false;

    public PlayerMuteEvent(String player, String reason, String muter, String duration) {
        this.player = player;
        this.reason = reason;
        this.muter = muter;
        this.duration = duration;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public String getPlayer() {
        return player;
    }

    public String getReason() {
        return reason;
    }

    public String getMuter() {
        return muter;
    }

    public String getDuration() {
        return duration;
    }

    public boolean isCancelled() {
        return this.cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
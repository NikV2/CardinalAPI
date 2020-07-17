package me.nik.cardinal.api.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerBanEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final String player;
    private final String reason;
    private final String duration;
    private final String banner;
    private boolean cancel = false;

    public PlayerBanEvent(String player, String reason, String duration, String banner) {
        this.player = player;
        this.reason = reason;
        this.duration = duration;
        this.banner = banner;
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

    public String getDuration() {
        return duration;
    }

    public String getBanner() {
        return banner;
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

package me.nik.cardinal.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerReportEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player reporter;
    private final Player reported;
    private final String reason;

    public PlayerReportEvent(Player reporter, Player reported, String reason) {
        this.reporter = reporter;
        this.reported = reported;
        this.reason = reason;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getReporter() {
        return reporter;
    }

    public Player getReported() {
        return reported;
    }

    public String getReason() {
        return reason;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
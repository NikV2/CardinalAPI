package me.nik.cardinal.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerReportEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player reporter;
    private final String reported;
    private final String reason;
    private final String information;

    public PlayerReportEvent(Player reporter, String reported, String reason, String information) {
        this.reporter = reporter;
        this.reported = reported;
        this.reason = reason;
        this.information = information;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getReporter() {
        return reporter;
    }

    public String getReported() {
        return reported;
    }

    public String getReason() {
        return reason;
    }

    public String getInformation() {
        return information;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
package me.nik.cardinal.api.events;

import me.nik.cardinal.api.enums.CheckType;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerViolationEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final CheckType CheckType;
    private final int violations;
    private final String information;
    private boolean cancel = false;

    public PlayerViolationEvent(Player player, CheckType CheckType, int violations, String information) {
        this.player = player;
        this.CheckType = CheckType;
        this.violations = violations;
        this.information = information;
    }

    public static HandlerList getHandlerList() {
        return handlers;
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

    public Player getPlayer() {
        return this.player;
    }

    public int getViolations() {
        return this.violations;
    }

    public String getInformation() {
        return this.information;
    }

    public CheckType getCheckType() {
        return this.CheckType;
    }
}
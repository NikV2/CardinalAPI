package me.nik.cardinal.api.events;

import me.nik.cardinal.api.enums.CheckType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerPunishEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final CheckType checkType;

    public PlayerPunishEvent(Player player, CheckType checkType) {
        this.player = player;
        this.checkType = checkType;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getPlayer() {
        return player;
    }

    public CheckType getCheckType() {
        return checkType;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
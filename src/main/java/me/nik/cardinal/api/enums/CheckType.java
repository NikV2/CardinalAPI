package me.nik.cardinal.api.enums;

public enum CheckType {
    KILLAURA("KillAura"),
    VELOCITY("Velocity"),
    AUTOCLICKER("AutoClicker"),
    AUTOFISH("AutoFish"),
    SPEED("Speed"),
    FLY("Fly"),
    BADPACKETS("BadPackets"),
    FREECAM("Freecam"),
    REACH("Reach"),
    FASTREGEN("FastRegen"),
    FASTBOW("FastBow"),
    FASTEAT("FastEat"),
    CRITICALS("Criticals"),
    AIMBOT("Aimbot"),
    SCAFFOLD("Scaffold");

    private final String name;

    CheckType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
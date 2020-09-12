package me.nik.cardinal.api.enums;

public enum CheckType {
    KILLAURA("KillAura"),
    VELOCITY("Velocity"),
    AUTOCLICKER("AutoClicker"),
    TIMER("Timer"),
    AUTOFISH("AutoFish"),
    SPEED("Speed"),
    FLY("Fly"),
    BADPACKETS("BadPackets"),
    FREECAM("Freecam"),
    NOSWING("NoSwing"),
    FASTREGEN("FastRegen"),
    FASTBOW("FastBow"),
    FASTEAT("FastEat"),
    CRITICALS("Criticals"),
    NOFALL("NoFall"),
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
package me.nik.cardinal.api.enums;

public enum CheckType {
    SPEED_A("Speed (A)"),
    FLY_A("Fly (A)"),
    NOSWING_A("NoSwing (A)"),
    FASTREGEN("FastRegen"),
    FASTBOW("FastBow"),
    FASTEAT("FastEat"),
    CRITICALS_A("Criticals (A)"),
    CRITICALS_B("Criticals (B)"),
    NOFALL_A("NoFall (A)"),
    AIMBOT_A("Aimbot (A)"),
    AIMBOT_B("Aimbot (B)"),
    AIMBOT_C("Aimbot (C)"),
    SCAFFOLD_A("Scaffold (A)"),
    SCAFFOLD_B("Scaffold (B)");

    private final String name;

    CheckType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
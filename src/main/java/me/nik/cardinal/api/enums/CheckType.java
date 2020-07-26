package me.nik.cardinal.api.enums;

public enum CheckType {
    KILLAURA_ANGLE("KillAura (Angle)"),
    KILLAURA_IMPOSSIBLE("KillAura (Impossible)"),
    KILLAURA_DIRECTION("KillAura (Direction)"),
    KILLAURA_ACCURACY("KillAura (Accuracy)"),
    KILLAURA_YAW("KillAura (Yaw)"),
    KILLAURA_WALLHIT("KillAura (WallHit)"),
    KILLAURA_PATTERN("KillAura (Pattern)"),
    KILLAURA_INVALID_ANGLE("KillAura (Invalid Angle)"),
    VELOCITY("Velocity"),
    TIMER("Timer"),
    SPEED_A("Speed (A)"),
    FLY_A("Fly (A)"),
    NOSWING("NoSwing"),
    FASTREGEN("FastRegen"),
    FASTBOW("FastBow"),
    FASTEAT("FastEat"),
    CRITICALS_A("Criticals (A)"),
    CRITICALS_B("Criticals (B)"),
    NOFALL_A("NoFall (A)"),
    AIMBOT_A("Aimbot (A)"),
    AIMBOT_B("Aimbot (B)"),
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
package hydraulic.valves;

public enum ModularFurnaceMainPowerLevel {
    OFF_POWER_LEVEL(0),
    MID_POWER_LEVEL(500),
    MAX_POWER_LEVEL(1000);

    private final int powerLevel;

    private ModularFurnaceMainPowerLevel(final int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return this.powerLevel;
    }
}

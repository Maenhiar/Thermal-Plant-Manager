package hydraulic.valves;

import hydraulic.AbstractPlumbingComponent;

public final class ValveImpl extends AbstractPlumbingComponent implements Valve {
    private int regulationValue = 0;

    /**
     * @param manufacturer the manufacturer of this plumbing component.
     * @param productId    the product ID of this plumbing component.
     */
    public ValveImpl(final String manufacturer, final String productId) {
        super(manufacturer, productId);
    }

    @Override
    public int getRegulationValue() {
        return this.regulationValue;
    }

    @Override
    public boolean regulate(final int regulationValue) {
        if (this.regulationValue >= ModularFurnaceMainPowerLevel.OFF_POWER_LEVEL.getPowerLevel() &&
                this.regulationValue <= ModularFurnaceMainPowerLevel.MAX_POWER_LEVEL.getPowerLevel()) {
            this.regulationValue = regulationValue;
            return true;
        }

        return false;

    }

}

package model.hydraulic.furnaces;

import model.hydraulic.PlumbingComponent;

/**
 * This interface represents a furnace with modular power.
 * These types of furnaces can be regulated with different power values.
 * A power value of 0 means that this furnace must be turned off.
 * A power value of 100 means that this furnace must be turned on at its maximum power.
 */
public interface ModularFurnace extends PlumbingComponent {

    /**
     * Sets this furnace power at the specified power level.
     * A power value of 0 means that this furnace must be turned off.
     * A power value of 100 means that this furnace must be turned on at its maximum power.
     *
     * @param powerValue the desired power level.
     */
    void regulatePower(final int powerValue);
}

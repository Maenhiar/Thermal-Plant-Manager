package hydraulic.furnaces;

import hydraulic.PlumbingComponent;

/**
 * This interface represents a ON/OFF furnace.
 * These types of furnaces can just be switched off or on.
 */
public interface OnOffFurnace extends PlumbingComponent {

    /**
     * Switches this furnace on.
     */
    void switchOn();

    /**
     * Switches this furnace off.
     */
    void switchOff();
}

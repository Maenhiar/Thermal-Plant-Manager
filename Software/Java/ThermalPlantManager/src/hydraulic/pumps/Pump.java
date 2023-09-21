package hydraulic.pumps;

import hydraulic.PlumbingComponent;

/**
 * This interface represents a pump, a device that is needed to move the water
 * across the plumbing system of a condominium.
 */
public interface Pump extends PlumbingComponent {

    /**
     *
     * @return true if the pump safety is switched on, returns false otherwise.
     */
    boolean isSafetyTurnedOn();

    /**
     *
     * @return true if the pump is switched on, returns false otherwise.
     */
    boolean isSwitchedOn();

    /**
     * Switches this pump on if it is possible.
     * Note that a pump can be switched on if its safety is turned on.
     *
     * @return true if the pump has been switched on, returns false otherwise.
     */
    boolean switchOn();

    /**
     * Switches this pump off.
     */
    void switchOff();

}

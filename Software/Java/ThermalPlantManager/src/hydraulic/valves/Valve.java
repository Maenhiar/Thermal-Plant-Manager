package hydraulic.valves;

import hydraulic.PlumbingComponent;

/**
 * This interface represents a valve, a device that is needed to regulate the water
 * passage inside the plumbing system of the condominium.
 * A valve is always turned on, it needs only to be regulated.
 */
public interface Valve extends PlumbingComponent {

    /**
     * Gets the current valve regulation value.
     * @return the current valve regulation value.
     */
    int getRegulationValue();

    /**
     * Regulate the opening and the closure of this valve.
     * Note that a valve can't be opened or closed out of its minimum and
     * maximum regulation range.
     *
     * @param regulationValue the value to which the valve must be regulated.
     *
     * @return true if the regulation has occurred, returns false otherwise.
     */
    boolean regulate(final int regulationValue);

}

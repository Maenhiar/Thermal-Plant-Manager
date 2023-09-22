package model.hydraulic.probes;

import model.hydraulic.PlumbingComponent;

/**
 * This interface represents a probe, a device that is needed to measure
 * temperature.
 */
public interface Probe extends PlumbingComponent {

    /**
     * Returns the temperature measured by this probe.
     */
    int getTemperature();

}

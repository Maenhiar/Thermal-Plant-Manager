package condominium;

import hydraulic.PlumbingComponent;

import java.util.Set;

/**
 * This interface represents a condominium thermal plant and provides its basic information.
 */
public interface ThermalPlant {

    /**
     *
     * @return the condominium thermal plant address.
     */
    String getAddress();

    /**
     *
     * @return the plumbing components installed in this thermal plant.
     */
    Set<PlumbingComponent> getPlumbingComponents();

    /**
     * Sets the thermal plant address.
     *
     * @param address the thermal plant address.
     */
    void setAddress(final String address);

    /**
     * Sets the thermal plant plumbing components.
     *
     * @param plumbingComponents the thermal plant plumbing components.
     */
    void setPlumbingComponents(final Set<PlumbingComponent> plumbingComponents);

}

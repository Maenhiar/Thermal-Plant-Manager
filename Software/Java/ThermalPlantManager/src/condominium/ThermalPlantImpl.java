package condominium;

import hydraulic.PlumbingComponent;

import java.util.Collections;
import java.util.Set;

/**
 * This class implements a condominium thermal plant and provides its basic information.
 */
public final class ThermalPlantImpl implements ThermalPlant {
    private String address;
    private Set<PlumbingComponent> plumbingComponents;

    public ThermalPlantImpl(final String address, final Set<PlumbingComponent> plumbingComponents) {
        this.address = address;
        this.plumbingComponents = plumbingComponents;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public Set<PlumbingComponent> getPlumbingComponents() {
        return Collections.unmodifiableSet(this.plumbingComponents);
    }

    @Override
    public void setAddress(final String address) {
        this.address = address;
    }

    @Override
    public void setPlumbingComponents(final Set<PlumbingComponent> plumbingComponents) {
        this.plumbingComponents = plumbingComponents;
    }

}

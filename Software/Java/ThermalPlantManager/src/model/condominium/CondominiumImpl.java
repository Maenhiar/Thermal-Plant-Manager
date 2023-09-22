package model.condominium;

import model.condominiummanager.CondominiumManager;
import model.condominiummanager.CondominiumManagerImpl;
import model.thermalplant.ThermalPlant;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

/**
 * This class implements a condominium and provides its basic information.
 */
public final class CondominiumImpl implements Condominium {
    private String address;
    private Optional<String> name;
    private int apartmentsNumber;
    private CondominiumManager condominiumManager;
    private Set<ThermalPlant> thermalPlants;

    public CondominiumImpl(final String address, final Optional<String> name,
                            final int apartmentsNumber,
                                final CondominiumManager condominiumManager,
                                    final Set<ThermalPlant> condominiumThermalPlants) {
        this.address = address;
        this.name = name;
        this.apartmentsNumber = apartmentsNumber;
        this.condominiumManager = condominiumManager;
        this.thermalPlants = condominiumThermalPlants;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getName() {
        return this.name.orElse(this.address);
    }

    @Override
    public int getApartmentsNumber() {
        return this.apartmentsNumber;
    }

    @Override
    public CondominiumManager getCondominiumManager() {
        // Defensive copy
        return new CondominiumManagerImpl(this.condominiumManager.getName(),
                this.condominiumManager.getSurname(),
                    this.condominiumManager.getPhoneNumber(),
                        this.condominiumManager.getEmailAddress());
    }

    @Override
    public Set<ThermalPlant> getThermalPlants() {
        return Collections.unmodifiableSet(this.thermalPlants);
    }

    @Override
    public void setAddress(final String address) {
        this.address = address;
    }

    @Override
    public void setName(final Optional<String> name) {
        this.name = name;
    }

    @Override
    public void setApartmentsNumber(final int apartmentsNumber) {
        this.apartmentsNumber = apartmentsNumber;
    }

    @Override
    public void setCondominiumManager(final CondominiumManager condominiumManager) {
        this.condominiumManager = condominiumManager;
    }

    @Override
    public void setThermalPlants(final Set<ThermalPlant> thermalPlants) {
        this.thermalPlants = thermalPlants;
    }

}

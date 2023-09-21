package condominium;

import java.util.Optional;
import java.util.Set;

/**
 * This interface represents a condominium and provides its basic information.
 */
public interface Condominium {

    /**
     *
     * @return the condominium address.
     */
    String getAddress();

    /**
     *
     * @return the condominium name if it has one, returns "No name" otherwise.
     */
    String getName();

    /**
     *
     * @return the number of apartments of this condominium.
     */
    int getApartmentsNumber();

    /**
     *
     * @return the manager of this condominium.
     */
    CondominiumManager getCondominiumManager();

    /**
     *
     * @return the thermal plants of this condominium.
     */
    Set<ThermalPlant> getThermalPlants();

    /**
     * Sets the condominium address.
     * @param address the condominium address.
     */
    void setAddress(final String address);

    /**
     * Sets the condominium name.
     * @param name the condominium name.
     */
    void setName(final Optional<String> name);

    /**
     * Sets the apartments number.
     * @param apartmentsNumber the apartments number.
     */
    void setApartmentsNumber(final int apartmentsNumber);

    /**
     * Sets the condominium manager.
     * @param condominiumManager the new condominium manager.
     */
    void setCondominiumManager(final CondominiumManager condominiumManager);

    /**
     * Sets the condominium thermal plants.
     * @param thermalPlants the condominium thermal plants.
     */
    void setThermalPlants(final Set<ThermalPlant> thermalPlants);

}

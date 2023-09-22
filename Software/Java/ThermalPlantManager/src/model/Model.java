package model;

/**
 * This interface represents the model of the MVC design of the application.
 */
public interface Model {

    /**
     * Creates a new condominium.
     */
    void addCondominium();

    /**
     * Creates a new thermal plant for a condominium.
     */
    void addThermalPlant();

    /**
     * Creates a new plumbing component for a condominium.
     */
    void addPlumbingComponent();

    /**
     * Creates a new timer for a condominium.
     */
    void addTimer();

    /**
     * Removes a condominium.
     */
    void removeCondominium();

    /**
     * Removes a thermal plant from a condominium.
     */
    void removeThermalPlant();

    /**
     * Removes a plumbing component from a thermal plant.
     */
    void removePlumbingComponent();

    /**
     * Removes a timer from a condominium.
     */
    void removeTimer();


}

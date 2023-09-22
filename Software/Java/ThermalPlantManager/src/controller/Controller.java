package controller;

/**
 * This interface represents the controller of the MVC design of the application.
 */
public interface Controller {

    /**
     * Starts the application.
     */
    void launchApplication();

    /**
     * Processes the inputs and calls the corresponding model methods.
     */
    void processInput();

}

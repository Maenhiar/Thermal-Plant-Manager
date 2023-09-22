package controller;

/**
 * This interface represents the controller of the MVC design of the application.
 */
public interface Controller {

    /**
     * Starts the view of the MVC pattern.
     */
    void startView();

    /**
     * Processes the inputs and calls the corresponding model methods.
     */
    void processInput();

    /**
     * Tells the view to render the current information.
     */
    void updateView();

    /**
     * Stops the view of the MVC pattern.
     */
    void stopView();
}

package view;

/**
 * This interface represents the view of the MVC design of the application.
 */
public interface View {

    /**
     * Starts the view.
     */
    void start();

    /**
     * Performs a rendering (i.e. performs an update of the view elements).
     */
    void update();

    /**
     * Stops the view.
     */
    void stop();
}

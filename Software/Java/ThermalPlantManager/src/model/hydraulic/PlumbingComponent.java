package model.hydraulic;

/**
 * This interface represents a generic plumbing component.
 */
public interface PlumbingComponent {
    /**
     * Gets the manufacturer's name of this plumbing component.
     * @return the manufacturer's name of this plumbing component.
     */
    String getManufacturer();

    /**
     * Gets the product ID of this plumbing component.
     * @return the product ID of this plumbing component.
     */
    String getProductId();

    /**
     * Sets the manufacturer's name of this plumbing component.
     * @param manufacturer the manufacturer's name that must be associated
     *                     to this plumbing component.
     */
    void setManufacturer(final String manufacturer);

    /**
     * Sets the product ID of this plumbing component.
     * @param productId the product ID that must be associated
     *                     to this plumbing component.
     */
    void setProductId(final String productId);
}

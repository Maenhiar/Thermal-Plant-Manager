package hydraulic;

/**
 * This class represents an abstract plumbing component.
 */
public class AbstractPlumbingComponent implements PlumbingComponent {
    private String manufacturer;
    private String productId;

    /**
     *
     * @param manufacturer the manufacturer of this plumbing component.
     * @param productId the product ID of this plumbing component.
     */
    public AbstractPlumbingComponent(final String manufacturer, final String productId) {
        this.manufacturer = manufacturer;
        this.productId = productId;
    }

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public String getProductId() {
        return this.productId;
    }

    @Override
    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setProductId(final String productId) {
        this.productId = productId;
    }

}

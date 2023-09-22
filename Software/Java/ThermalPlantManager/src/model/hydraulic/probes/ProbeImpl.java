package model.hydraulic.probes;

import model.hydraulic.AbstractPlumbingComponent;

/**
 * This class implements a probe, a device that is needed to measure
 * temperature.
 */
public final class ProbeImpl extends AbstractPlumbingComponent implements Probe {

    /**
     *
     * @param manufacturer the manufacturer of this plumbing component.
     * @param productId the product ID of this plumbing component.
     */
    public ProbeImpl(final String manufacturer, final String productId) {
        super(manufacturer, productId);
    }

    @Override
    public int getTemperature() {
        // TO-DO: This implementation is just a placeholder.
        final int scaleValue = 100;
        return (int) (Math.random() * scaleValue);
    }
}

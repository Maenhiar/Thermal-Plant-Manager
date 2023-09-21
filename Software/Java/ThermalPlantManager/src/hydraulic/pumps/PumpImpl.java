package hydraulic.pumps;

import hydraulic.AbstractPlumbingComponent;

/**
 * This class implements a pump, a device that is needed to move the water
 * across the plumbing system of the condominium.
 */
public final class PumpImpl extends AbstractPlumbingComponent implements Pump {
    private volatile boolean safety = false;
    private volatile boolean isSwitchedOn = false;

    public PumpImpl (final String manufacturer, final String productId,
                     final boolean safety) {
        super(manufacturer, productId);
        this.safety = safety;
        this.new PumpManager().start();
    }

    @Override
    public synchronized boolean isSafetyTurnedOn() {
        return this.safety;
    }

    @Override
    public synchronized boolean isSwitchedOn() {
        return this.isSwitchedOn;
    }

    @Override
    public synchronized boolean switchOn() {
        if (this.safety) {
            this.isSwitchedOn = true;
        }

        return this.isSwitchedOn;

    }

    @Override
    public synchronized void switchOff() {
        this.isSwitchedOn = false;
    }

    private final class PumpManager extends Thread {
        private static final int WAITING_TIME = 800;

        public void run() {

            while (true) {

                if (this.getSafetyStatus() == false) {
                    PumpImpl.this.switchOff();
                }

                try {
                    Thread.sleep(WAITING_TIME);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }

        private synchronized boolean getSafetyStatus() {
            // TO-DO: This implementation is just a placeholder.
            PumpImpl.this.safety = true;

            return PumpImpl.this.safety;
        }

    }

}

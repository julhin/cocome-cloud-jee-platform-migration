package org.cocome.tradingsystem.inventory.application.plant.ppu.doub;

/**
 * This class is merely used as double for the Pick and Place Unit.
 *
 * @author Rudolf Biczok, rudolf.biczok@student.kit.edu
 */
public class XPPUDouble extends PUDouble {

    public XPPUDouble(final long timingFactor) {
        super(XPPU.values(), timingFactor);
    }

}

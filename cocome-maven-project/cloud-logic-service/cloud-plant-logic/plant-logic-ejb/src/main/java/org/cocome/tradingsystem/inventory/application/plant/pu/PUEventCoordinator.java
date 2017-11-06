package org.cocome.tradingsystem.inventory.application.plant.pu;

import org.cocome.tradingsystem.inventory.application.plant.iface.HistoryEntry;
import org.cocome.tradingsystem.inventory.application.plant.pu.events.PUJobFinishedEvent;
import org.cocome.tradingsystem.inventory.application.plant.pu.events.PUJobProgressEvent;
import org.cocome.tradingsystem.inventory.application.plant.pu.events.PUJobStartedEvent;
import org.cocome.tradingsystem.inventory.data.plant.productionunit.IProductionUnit;

import javax.ejb.Singleton;
import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * This class is used to generate CDI-based events out of incoming production unit callback calls
 *
 * @author Rudolf Biczok
 */
@Singleton
public class PUEventCoordinator implements IPUCallback<PlantJob> {

    @Inject
    private Event<PUJobStartedEvent> jobStartedEvent;

    @Inject
    private Event<PUJobProgressEvent> jobProgressEvent;

    @Inject
    private Event<PUJobFinishedEvent> jobFinishedEvent;

    @Override
    public void onStart(IProductionUnit unit, PlantJob job, HistoryEntry historyEntry) {
        jobStartedEvent.fire(new PUJobStartedEvent(unit, job, historyEntry));
    }

    @Override
    public void onProgress(IProductionUnit unit, PlantJob job, HistoryEntry historyEntry) {
        jobProgressEvent.fire(new PUJobProgressEvent(unit, job, historyEntry));
    }

    @Override
    public void onFinish(IProductionUnit unit, PlantJob job, HistoryEntry historyEntry) {
        jobFinishedEvent.fire(new PUJobFinishedEvent(unit, job, historyEntry));
    }
}

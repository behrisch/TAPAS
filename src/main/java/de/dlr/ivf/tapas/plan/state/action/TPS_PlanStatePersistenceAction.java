package de.dlr.ivf.tapas.plan.state.action;

import de.dlr.ivf.tapas.persistence.db.TPS_TripToDbWriter;
import de.dlr.ivf.tapas.plan.TPS_Plan;
import de.dlr.ivf.tapas.plan.state.TPS_StateMachineWorker;
import de.dlr.ivf.tapas.scheme.TPS_Stay;
import de.dlr.ivf.tapas.scheme.TPS_TourPart;
import de.dlr.ivf.tapas.scheme.TPS_Trip;

public class TPS_PlanStatePersistenceAction implements TPS_PlanStateAction {

    private TPS_TripToDbWriter writer;
    private TPS_Plan plan;
    private TPS_TourPart tp;
    private TPS_Stay stay;

    public TPS_PlanStatePersistenceAction(TPS_TripToDbWriter writer, TPS_Plan plan, TPS_TourPart tp, TPS_Stay stay){
        this.writer = writer;
        this.plan = plan;
        this.tp = tp;
        this.stay = stay;
    }

    @Override
    public void run() {
        writer.writeTrip(this.plan,this.tp, tp.getPreviousTrip(stay));
    }
}
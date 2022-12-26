package o;

import java.util.concurrent.ScheduledExecutorService;
import o.RecyclerView;
import o.setRecycledViewPool;
/* loaded from: classes5.dex */
public final /* synthetic */ class processDisappeared implements setRecycledViewPool {
    private final processAppeared ah$a;
    private final ScheduledExecutorService values;

    private processDisappeared(processAppeared processappeared, ScheduledExecutorService scheduledExecutorService) {
        this.ah$a = processappeared;
        this.values = scheduledExecutorService;
    }

    public static setRecycledViewPool ah$a(processAppeared processappeared, ScheduledExecutorService scheduledExecutorService) {
        return new processDisappeared(processappeared, scheduledExecutorService);
    }

    @Override // o.setRecycledViewPool
    public void ah$a(boolean z, setRecycledViewPool.toString tostring) {
        RecyclerView.AnonymousClass2.valueOf(this.ah$a, this.values, z, tostring);
    }
}

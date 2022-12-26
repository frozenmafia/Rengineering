package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.scheduling.CoroutineScheduler;
/* loaded from: classes5.dex */
public final /* synthetic */ class CoroutineScheduler$ag$a {
    public static final /* synthetic */ int[] ah$a;

    static {
        int[] iArr = new int[CoroutineScheduler.WorkerState.values().length];
        iArr[CoroutineScheduler.WorkerState.PARKING.ordinal()] = 1;
        iArr[CoroutineScheduler.WorkerState.BLOCKING.ordinal()] = 2;
        iArr[CoroutineScheduler.WorkerState.CPU_ACQUIRED.ordinal()] = 3;
        iArr[CoroutineScheduler.WorkerState.DORMANT.ordinal()] = 4;
        iArr[CoroutineScheduler.WorkerState.TERMINATED.ordinal()] = 5;
        ah$a = iArr;
    }
}

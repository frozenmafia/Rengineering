package o;

import io.reactivex.rxjava3.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import o.getLoopers;
/* loaded from: classes5.dex */
public final class addSdkAdded extends getLoopers {
    private static final RxThreadFactory ag$a = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())));
    final ThreadFactory valueOf;

    public addSdkAdded() {
        this(ag$a);
    }

    public addSdkAdded(ThreadFactory threadFactory) {
        this.valueOf = threadFactory;
    }

    @Override // o.getLoopers
    public getLoopers.toString ag$a() {
        return new addWidth(this.valueOf);
    }
}

package o;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import o.appendColumns;
/* loaded from: classes5.dex */
public final class ensureTarget extends appendColumns {
    private static final RxThreadFactory ah$a = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory ag$a;

    public ensureTarget() {
        this(ah$a);
    }

    public ensureTarget(ThreadFactory threadFactory) {
        this.ag$a = threadFactory;
    }

    @Override // o.appendColumns
    public appendColumns.values ah$a() {
        return new animateOffsetToStartPosition(this.ag$a);
    }
}

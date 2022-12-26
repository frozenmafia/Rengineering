package o;

import java.util.concurrent.ScheduledFuture;
import o.InputContentInfoCompat;
/* loaded from: classes4.dex */
public class setRelativeEdges implements InputContentInfoCompat.InputContentInfoCompatImpl {
    private ScheduledFuture<?> valueOf;

    public setRelativeEdges(ScheduledFuture<?> scheduledFuture) {
        this.valueOf = null;
        this.valueOf = scheduledFuture;
    }

    @Override // o.InputContentInfoCompat.InputContentInfoCompatImpl
    public boolean values() {
        this.valueOf.cancel(true);
        return true;
    }
}

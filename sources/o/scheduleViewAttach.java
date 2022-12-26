package o;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class scheduleViewAttach extends getCurrentItem<scheduleViewAttach> {
    /* synthetic */ AtomicReferenceArray valueOf;

    public scheduleViewAttach(long j, scheduleViewAttach scheduleviewattach, int i) {
        super(j, scheduleviewattach, i);
        int i2;
        i2 = createKey.values;
        this.valueOf = new AtomicReferenceArray(i2);
    }

    @Override // o.getCurrentItem
    public int HaptikSDK$a() {
        int i;
        i = createKey.values;
        return i;
    }

    public final void values(int i) {
        fakeDragBy fakedragby;
        fakedragby = createKey.valueOf;
        this.valueOf.set(i, fakedragby);
        getInitSettings();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + HaptikSDK$c() + ", hashCode=" + hashCode() + ']';
    }
}

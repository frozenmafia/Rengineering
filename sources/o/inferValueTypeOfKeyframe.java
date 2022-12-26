package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes5.dex */
public final class inferValueTypeOfKeyframe extends loadValues {
    private static final /* synthetic */ AtomicIntegerFieldUpdater ah$a = AtomicIntegerFieldUpdater.newUpdater(inferValueTypeOfKeyframe.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public inferValueTypeOfKeyframe(o.setPatternPath<?> r2, java.lang.Throwable r3, boolean r4) {
        /*
            r1 = this;
            if (r3 != 0) goto L20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Continuation "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = " was cancelled normally"
            r3.append(r2)
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
        L20:
            r1.<init>(r3, r4)
            r2 = 0
            r1._resumed = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.inferValueTypeOfKeyframe.<init>(o.setPatternPath, java.lang.Throwable, boolean):void");
    }

    public final boolean values() {
        return ah$a.compareAndSet(this, 0, 1);
    }
}

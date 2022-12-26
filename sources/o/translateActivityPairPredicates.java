package o;

import java.io.IOException;
/* loaded from: classes5.dex */
public abstract class translateActivityPairPredicates {
    private long ah$a;
    private final boolean toString;
    private translateActivityPredicates valueOf;
    private final String values;

    /* renamed from: o.translateActivityPairPredicates$lambda-1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public interface lambda1 {
        void abort();

        safeInsetBottom body() throws IOException;
    }

    public abstract long ah$a();

    public translateActivityPairPredicates(String str, boolean z) {
        runAnimators.ag$a(str, "name");
        this.values = str;
        this.toString = z;
        this.ah$a = -1L;
    }

    public final String values() {
        return this.values;
    }

    public /* synthetic */ translateActivityPairPredicates(String str, boolean z, int i, getTargetTypes gettargettypes) {
        this(str, (i & 2) != 0 ? true : z);
    }

    public final boolean ag$a() {
        return this.toString;
    }

    public final translateActivityPredicates HaptikSDK$b() {
        return this.valueOf;
    }

    public final void ah$a(long j) {
        this.ah$a = j;
    }

    public final long valueOf() {
        return this.ah$a;
    }

    public final void ah$a(translateActivityPredicates translateactivitypredicates) {
        runAnimators.ag$a(translateactivitypredicates, "queue");
        translateActivityPredicates translateactivitypredicates2 = this.valueOf;
        if (translateactivitypredicates2 == translateactivitypredicates) {
            return;
        }
        if (!(translateactivitypredicates2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.valueOf = translateactivitypredicates;
    }

    public String toString() {
        return this.values;
    }
}

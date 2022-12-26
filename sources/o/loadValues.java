package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes5.dex */
public class loadValues {
    private static final /* synthetic */ AtomicIntegerFieldUpdater valueOf = AtomicIntegerFieldUpdater.newUpdater(loadValues.class, "_handled");
    private volatile /* synthetic */ int _handled;
    public final Throwable ag$a;

    public loadValues(Throwable th, boolean z) {
        this.ag$a = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ loadValues(Throwable th, boolean z, int i, getTargetTypes gettargettypes) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean ag$a() {
        return this._handled;
    }

    public final boolean ah$a() {
        return valueOf.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return invalidateSelf.values(this) + '[' + this.ag$a + ']';
    }
}

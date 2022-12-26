package okhttp3;

import java.util.concurrent.TimeUnit;
import o.runAnimators;
import o.setSplitRules;
import o.translateIntentPredicates;
/* loaded from: classes5.dex */
public final class ConnectionPool {
    private final setSplitRules delegate;

    public ConnectionPool(setSplitRules setsplitrules) {
        runAnimators.ag$a(setsplitrules, "delegate");
        this.delegate = setsplitrules;
    }

    public final setSplitRules getDelegate$okhttp() {
        return this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        this(new setSplitRules(translateIntentPredicates.toString, i, j, timeUnit));
        runAnimators.ag$a(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public final int idleConnectionCount() {
        return this.delegate.values();
    }

    public final int connectionCount() {
        return this.delegate.ah$a();
    }

    public final void evictAll() {
        this.delegate.ag$a();
    }
}

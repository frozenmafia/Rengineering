package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes5.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    public RxThreadFactory(String str, int i) {
        this(str, i, false);
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.prefix + Soundex.SILENT_MARKER + incrementAndGet();
        Thread rxThreadFactory$ag$a = this.nonBlocking ? new RxThreadFactory$ag$a(runnable, str) : new Thread(runnable, str);
        rxThreadFactory$ag$a.setPriority(this.priority);
        rxThreadFactory$ag$a.setDaemon(true);
        return rxThreadFactory$ag$a;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.prefix + "]";
    }
}

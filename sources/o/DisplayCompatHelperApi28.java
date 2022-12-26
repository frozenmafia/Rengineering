package o;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes5.dex */
public final class DisplayCompatHelperApi28 {
    private static final int ag$a;
    private static final AtomicReference<safeInsetLeft>[] valueOf;
    public static final DisplayCompatHelperApi28 ah$a = new DisplayCompatHelperApi28();
    private static final int values = 65536;
    private static final safeInsetLeft toString = new safeInsetLeft(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        ag$a = highestOneBit;
        AtomicReference<safeInsetLeft>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        valueOf = atomicReferenceArr;
    }

    private DisplayCompatHelperApi28() {
    }

    public static final safeInsetLeft values() {
        AtomicReference<safeInsetLeft> valueOf2 = ah$a.valueOf();
        safeInsetLeft safeinsetleft = toString;
        safeInsetLeft andSet = valueOf2.getAndSet(safeinsetleft);
        if (andSet == safeinsetleft) {
            return new safeInsetLeft();
        }
        if (andSet == null) {
            valueOf2.set(null);
            return new safeInsetLeft();
        }
        valueOf2.set(andSet.ah$a);
        andSet.ah$a = null;
        andSet.toString = 0;
        return andSet;
    }

    public static final void valueOf(safeInsetLeft safeinsetleft) {
        AtomicReference<safeInsetLeft> valueOf2;
        safeInsetLeft safeinsetleft2;
        runAnimators.ag$a(safeinsetleft, "segment");
        if (!(safeinsetleft.ah$a == null && safeinsetleft.ah$b == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (safeinsetleft.HaptikSDK$c || (safeinsetleft2 = (valueOf2 = ah$a.valueOf()).get()) == toString) {
            return;
        }
        int i = safeinsetleft2 != null ? safeinsetleft2.toString : 0;
        if (i >= values) {
            return;
        }
        safeinsetleft.ah$a = safeinsetleft2;
        safeinsetleft.HaptikSDK$a = 0;
        safeinsetleft.toString = i + 8192;
        if (valueOf2.compareAndSet(safeinsetleft2, safeinsetleft)) {
            return;
        }
        safeinsetleft.ah$a = null;
    }

    private final AtomicReference<safeInsetLeft> valueOf() {
        Thread currentThread = Thread.currentThread();
        runAnimators.ah$a(currentThread, "Thread.currentThread()");
        return valueOf[(int) (currentThread.getId() & (ag$a - 1))];
    }
}

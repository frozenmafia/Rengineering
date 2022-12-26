package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.axm;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes4.dex */
class axw extends axm.i {

    /* renamed from: b  reason: collision with root package name */
    private static final axt f760b;
    private static final Logger c = Logger.getLogger(axw.class.getName());
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        axt axvVar;
        Throwable th;
        try {
            AtomicReferenceFieldUpdater.newUpdater(axw.class, Set.class, "seenExceptions");
            axvVar = new axu(AtomicIntegerFieldUpdater.newUpdater(axw.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            axvVar = new axv(null);
            th = e;
        }
        f760b = axvVar;
        if (th != null) {
            c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public axw(int i) {
        this.remaining = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int t(axw axwVar) {
        int i = axwVar.remaining - 1;
        axwVar.remaining = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int u() {
        return f760b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        this.seenExceptions = null;
    }
}

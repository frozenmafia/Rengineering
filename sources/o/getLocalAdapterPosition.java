package o;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
/* loaded from: classes7.dex */
public abstract class getLocalAdapterPosition<OutputT> extends countItemsBefore$ah$b<OutputT> {
    private static final java.util.logging.Logger ah$a = java.util.logging.Logger.getLogger(getLocalAdapterPosition.class.getName());
    private static final values valueOf;
    private volatile int ag$a;
    private volatile Set<Throwable> values;

    static {
        values getlocaladapterposition_ag_a;
        Throwable th = null;
        try {
            getlocaladapterposition_ag_a = new toString(AtomicReferenceFieldUpdater.newUpdater(getLocalAdapterPosition.class, Set.class, "values"), AtomicIntegerFieldUpdater.newUpdater(getLocalAdapterPosition.class, "ag$a"));
        } catch (Throwable th2) {
            getlocaladapterposition_ag_a = new getLocalAdapterPosition$ag$a();
            th = th2;
        }
        valueOf = getlocaladapterposition_ag_a;
        if (th != null) {
            ah$a.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static abstract class values {
        private values() {
        }
    }

    /* loaded from: classes7.dex */
    static final class toString extends values {
        final AtomicReferenceFieldUpdater<getLocalAdapterPosition<?>, Set<Throwable>> ag$a;
        final AtomicIntegerFieldUpdater<getLocalAdapterPosition<?>> toString;

        toString(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.ag$a = atomicReferenceFieldUpdater;
            this.toString = atomicIntegerFieldUpdater;
        }
    }
}

package com.google.common.collect;

import java.io.Serializable;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.recycleUpdateOp;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final hasPendingUpdates<F, ? extends T> function;
    final Ordering<T> ordering;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByFunctionOrdering(hasPendingUpdates<F, ? extends T> haspendingupdates, Ordering<T> ordering) {
        this.function = (hasPendingUpdates) markViewHoldersUpdated.toString(haspendingupdates);
        this.ordering = (Ordering) markViewHoldersUpdated.toString(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(F f, F f2) {
        return this.ordering.compare(this.function.apply(f), this.function.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByFunctionOrdering) {
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            return this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering);
        }
        return false;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(this.function, this.ordering);
    }

    public String toString() {
        String valueOf = String.valueOf(this.ordering);
        String valueOf2 = String.valueOf(this.function);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}

package com.google.common.graph;

import java.util.Comparator;
import o.hasUpdates;
import o.recycleUpdateOp;
/* loaded from: classes7.dex */
public final class ElementOrder<T> {
    private final Type ah$a;
    private final Comparator<T> valueOf;

    /* loaded from: classes7.dex */
    public enum Type {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ElementOrder) {
            ElementOrder elementOrder = (ElementOrder) obj;
            return this.ah$a == elementOrder.ah$a && recycleUpdateOp.values(this.valueOf, elementOrder.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(this.ah$a, this.valueOf);
    }

    public String toString() {
        hasUpdates.toString tostring = hasUpdates.valueOf(this).toString("type", this.ah$a);
        Comparator<T> comparator = this.valueOf;
        if (comparator != null) {
            tostring.toString("comparator", comparator);
        }
        return tostring.toString();
    }
}

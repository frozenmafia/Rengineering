package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public final class findLastVisibleItemPositions extends invalidateSpanAssignments implements Iterable<invalidateSpanAssignments> {
    private final List<invalidateSpanAssignments> toString = new ArrayList();

    public void valueOf(invalidateSpanAssignments invalidatespanassignments) {
        if (invalidatespanassignments == null) {
            invalidatespanassignments = setGapStrategy.values;
        }
        this.toString.add(invalidatespanassignments);
    }

    @Override // java.lang.Iterable
    public Iterator<invalidateSpanAssignments> iterator() {
        return this.toString.iterator();
    }

    @Override // o.invalidateSpanAssignments
    public Number invoke() {
        if (this.toString.size() == 1) {
            return this.toString.get(0).invoke();
        }
        throw new IllegalStateException();
    }

    @Override // o.invalidateSpanAssignments
    public String HaptikSDK$a() {
        if (this.toString.size() == 1) {
            return this.toString.get(0).HaptikSDK$a();
        }
        throw new IllegalStateException();
    }

    @Override // o.invalidateSpanAssignments
    public double ag$a() {
        if (this.toString.size() == 1) {
            return this.toString.get(0).ag$a();
        }
        throw new IllegalStateException();
    }

    @Override // o.invalidateSpanAssignments
    public long valueOf() {
        if (this.toString.size() == 1) {
            return this.toString.get(0).valueOf();
        }
        throw new IllegalStateException();
    }

    @Override // o.invalidateSpanAssignments
    public int ah$a() {
        if (this.toString.size() == 1) {
            return this.toString.get(0).ah$a();
        }
        throw new IllegalStateException();
    }

    @Override // o.invalidateSpanAssignments
    public boolean values() {
        if (this.toString.size() == 1) {
            return this.toString.get(0).values();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof findLastVisibleItemPositions) && ((findLastVisibleItemPositions) obj).toString.equals(this.toString));
    }

    public int hashCode() {
        return this.toString.hashCode();
    }
}

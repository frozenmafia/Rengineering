package o;

import com.google.common.collect.Range;
import java.lang.Comparable;
/* loaded from: classes7.dex */
public abstract class setMainThreadExecutor<C extends Comparable> implements BatchingListUpdateCallback<C> {
    @Override // o.BatchingListUpdateCallback
    public abstract boolean encloses(Range<C> range);

    public abstract Range<C> rangeContaining(C c);

    public boolean contains(C c) {
        return rangeContaining(c) != null;
    }

    @Override // o.BatchingListUpdateCallback
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        remove(Range.all());
    }

    public boolean enclosesAll(BatchingListUpdateCallback<C> batchingListUpdateCallback) {
        return enclosesAll(batchingListUpdateCallback.asRanges());
    }

    public boolean enclosesAll(Iterable<Range<C>> iterable) {
        for (Range<C> range : iterable) {
            if (!encloses(range)) {
                return false;
            }
        }
        return true;
    }

    public void addAll(BatchingListUpdateCallback<C> batchingListUpdateCallback) {
        addAll(batchingListUpdateCallback.asRanges());
    }

    public void addAll(Iterable<Range<C>> iterable) {
        for (Range<C> range : iterable) {
            add(range);
        }
    }

    @Override // o.BatchingListUpdateCallback
    public void removeAll(BatchingListUpdateCallback<C> batchingListUpdateCallback) {
        removeAll(batchingListUpdateCallback.asRanges());
    }

    public void removeAll(Iterable<Range<C>> iterable) {
        for (Range<C> range : iterable) {
            remove(range);
        }
    }

    public boolean intersects(Range<C> range) {
        return !subRangeSet(range).isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchingListUpdateCallback) {
            return asRanges().equals(((BatchingListUpdateCallback) obj).asRanges());
        }
        return false;
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public final String toString() {
        return asRanges().toString();
    }
}

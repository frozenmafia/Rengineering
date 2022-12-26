package o;

import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.Set;
/* loaded from: classes7.dex */
public interface BatchingListUpdateCallback<C extends Comparable> {
    Set<Range<C>> asRanges();

    BatchingListUpdateCallback<C> complement();

    boolean encloses(Range<C> range);

    boolean isEmpty();

    void removeAll(BatchingListUpdateCallback<C> batchingListUpdateCallback);

    BatchingListUpdateCallback<C> subRangeSet(Range<C> range);
}

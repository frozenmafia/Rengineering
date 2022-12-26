package o;

import com.google.common.collect.Range;
import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import java.lang.Comparable;
import java.util.ListIterator;
import java.util.Map;
/* loaded from: classes7.dex */
public interface ChildHelper<K extends Comparable, V> {

    /* loaded from: classes7.dex */
    public interface Callback {
        <T> HashCode hashObject(T t, Funnel<? super T> funnel);

        ConcatAdapter newHasher();
    }

    Map<Range<K>, V> asMapOfRanges();

    /* loaded from: classes5.dex */
    public abstract class Bucket<E> extends removeViewIfHidden<E> implements ListIterator<E> {
        @Override // java.util.ListIterator
        @Deprecated
        public final void add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        @Deprecated
        public final void set(E e) {
            throw new UnsupportedOperationException();
        }
    }
}

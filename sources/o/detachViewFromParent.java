package o;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
/* loaded from: classes7.dex */
public interface detachViewFromParent<E> extends getChildAt<E>, hideViewInternal<E> {
    Comparator<? super E> comparator();

    detachViewFromParent<E> descendingMultiset();

    @Override // o.refreshData
    NavigableSet<E> elementSet();

    @Override // o.refreshData
    Set<refreshData$ag$a<E>> entrySet();

    refreshData$ag$a<E> firstEntry();

    detachViewFromParent<E> headMultiset(E e, BoundType boundType);

    refreshData$ag$a<E> lastEntry();

    refreshData$ag$a<E> pollFirstEntry();

    refreshData$ag$a<E> pollLastEntry();

    detachViewFromParent<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2);

    detachViewFromParent<E> tailMultiset(E e, BoundType boundType);
}

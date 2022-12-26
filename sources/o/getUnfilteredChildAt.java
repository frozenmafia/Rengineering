package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes7.dex */
public interface getUnfilteredChildAt<R, C, V> {

    /* loaded from: classes7.dex */
    public interface valueOf<R, C, V> {
        C getColumnKey();

        R getRowKey();

        V getValue();
    }

    Set<valueOf<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(C c);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(Object obj, Object obj2);

    boolean containsColumn(Object obj);

    boolean containsRow(Object obj);

    boolean containsValue(Object obj);

    boolean equals(Object obj);

    V get(Object obj, Object obj2);

    int hashCode();

    boolean isEmpty();

    V put(R r, C c, V v);

    void putAll(getUnfilteredChildAt<? extends R, ? extends C, ? extends V> getunfilteredchildat);

    V remove(Object obj, Object obj2);

    Map<C, V> row(R r);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}

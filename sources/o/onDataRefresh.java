package o;

import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
/* loaded from: classes7.dex */
public interface onDataRefresh<R, C, V> extends getUnfilteredChildAt<R, C, V> {
    @Override // o.getUnfilteredChildAt
    SortedSet<R> rowKeySet();

    @Override // o.getUnfilteredChildAt
    SortedMap<R, Map<C, V>> rowMap();
}

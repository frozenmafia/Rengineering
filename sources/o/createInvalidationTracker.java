package o;

import java.util.Map;
import java.util.concurrent.ExecutionException;
/* loaded from: classes7.dex */
public interface createInvalidationTracker<K, V> extends projection<K, V>, unwrapOpenHelper<K, V> {
    @Deprecated
    V apply(K k);

    V get(K k) throws ExecutionException;

    Map<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException;

    V getUnchecked(K k);

    void refresh(K k);
}

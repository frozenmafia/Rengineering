package o;

import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutionException;
/* loaded from: classes7.dex */
public interface onInserted<K, V> extends cmdToString<K, V>, hasPendingUpdates<K, V> {
    @Deprecated
    V apply(K k);

    V get(K k) throws ExecutionException;

    ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException;

    V getUnchecked(K k);

    void refresh(K k);
}

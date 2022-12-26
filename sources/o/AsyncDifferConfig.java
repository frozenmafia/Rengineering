package o;

import com.google.common.cache.RemovalNotification;
/* loaded from: classes7.dex */
public interface AsyncDifferConfig<K, V> {

    /* loaded from: classes7.dex */
    public interface Builder<K, V> {
        int weigh(K k, V v);
    }

    void onRemoval(RemovalNotification<K, V> removalNotification);
}

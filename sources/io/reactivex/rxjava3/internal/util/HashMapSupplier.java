package io.reactivex.rxjava3.internal.util;

import java.util.HashMap;
import java.util.Map;
import o.createByteVector;
/* loaded from: classes7.dex */
public enum HashMapSupplier implements createByteVector<Map<Object, Object>> {
    INSTANCE;

    public static <K, V> createByteVector<Map<K, V>> asSupplier() {
        return INSTANCE;
    }

    @Override // o.createByteVector
    public Map<Object, Object> get() {
        return new HashMap();
    }
}

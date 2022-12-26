package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import o.AsyncListUtil;
import o.markViewHoldersUpdated;
import o.removeViewIfHidden;
/* loaded from: classes7.dex */
final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
    private final transient EnumMap<K, V> delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    static <K extends Enum<K>, V> ImmutableMap<K, V> asImmutable(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size != 0) {
            if (size == 1) {
                Map.Entry entry = (Map.Entry) AsyncListUtil.DataCallback.ah$a(enumMap.entrySet());
                return ImmutableMap.of((Enum) entry.getKey(), entry.getValue());
            }
            return new ImmutableEnumMap(enumMap);
        }
        return ImmutableMap.of();
    }

    private ImmutableEnumMap(EnumMap<K, V> enumMap) {
        this.delegate = enumMap;
        markViewHoldersUpdated.values(!enumMap.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    public removeViewIfHidden<K> keyIterator() {
        return Iterators.ah$b(this.delegate.keySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.delegate.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.delegate.containsKey(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        return this.delegate.get(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            obj = ((ImmutableEnumMap) obj).delegate;
        }
        return this.delegate.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    removeViewIfHidden<Map.Entry<K, V>> entryIterator() {
        return Maps.toString(this.delegate.entrySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableMap
    Object writeReplace() {
        return new EnumSerializedForm(this.delegate);
    }

    /* loaded from: classes7.dex */
    static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final EnumMap<K, V> delegate;

        EnumSerializedForm(EnumMap<K, V> enumMap) {
            this.delegate = enumMap;
        }

        Object readResolve() {
            return new ImmutableEnumMap(this.delegate);
        }
    }
}

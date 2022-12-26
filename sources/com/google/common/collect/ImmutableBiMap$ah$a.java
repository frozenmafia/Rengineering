package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
/* loaded from: classes7.dex */
public final class ImmutableBiMap$ah$a<K, V> extends ImmutableMap.valueOf<K, V> {
    public ImmutableBiMap$ah$a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmutableBiMap$ah$a(int i) {
        super(i);
    }

    @Override // com.google.common.collect.ImmutableMap.valueOf
    /* renamed from: values */
    public ImmutableBiMap$ah$a<K, V> toString(K k, V v) {
        super.toString(k, v);
        return this;
    }

    @Override // com.google.common.collect.ImmutableMap.valueOf
    /* renamed from: ah$a */
    public ImmutableBiMap$ah$a<K, V> toString(Map.Entry<? extends K, ? extends V> entry) {
        super.toString(entry);
        return this;
    }

    @Override // com.google.common.collect.ImmutableMap.valueOf
    /* renamed from: valueOf */
    public ImmutableBiMap$ah$a<K, V> ah$a(Map<? extends K, ? extends V> map) {
        super.ah$a(map);
        return this;
    }

    @Override // com.google.common.collect.ImmutableMap.valueOf
    /* renamed from: valueOf */
    public ImmutableBiMap$ah$a<K, V> toString(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        super.toString(iterable);
        return this;
    }

    @Override // com.google.common.collect.ImmutableMap.valueOf
    /* renamed from: valueOf */
    public ImmutableBiMap<K, V> ag$a() {
        return ah$a();
    }

    @Override // com.google.common.collect.ImmutableMap.valueOf
    /* renamed from: values */
    public ImmutableBiMap<K, V> ah$a() {
        if (this.toString == 0) {
            return ImmutableBiMap.of();
        }
        HaptikSDK$c();
        this.valueOf = true;
        return new RegularImmutableBiMap(this.ah$a, this.toString);
    }
}

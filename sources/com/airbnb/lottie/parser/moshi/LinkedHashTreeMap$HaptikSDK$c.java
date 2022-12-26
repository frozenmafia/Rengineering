package com.airbnb.lottie.parser.moshi;

import java.util.Map;
/* loaded from: classes6.dex */
final class LinkedHashTreeMap$HaptikSDK$c<K, V> implements Map.Entry<K, V> {
    LinkedHashTreeMap$HaptikSDK$c<K, V> HaptikSDK$a;
    LinkedHashTreeMap$HaptikSDK$c<K, V> HaptikSDK$b;
    LinkedHashTreeMap$HaptikSDK$c<K, V> HaptikSDK$c;
    final int ag$a;
    int ah$a;
    V invoke;
    final K toString;
    LinkedHashTreeMap$HaptikSDK$c<K, V> valueOf;
    LinkedHashTreeMap$HaptikSDK$c<K, V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedHashTreeMap$HaptikSDK$c() {
        this.toString = null;
        this.ag$a = -1;
        this.HaptikSDK$b = this;
        this.values = this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedHashTreeMap$HaptikSDK$c(LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c, K k, int i, LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2, LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c3) {
        this.HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c;
        this.toString = k;
        this.ag$a = i;
        this.ah$a = 1;
        this.values = linkedHashTreeMap$HaptikSDK$c2;
        this.HaptikSDK$b = linkedHashTreeMap$HaptikSDK$c3;
        linkedHashTreeMap$HaptikSDK$c3.values = this;
        linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$b = this;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.toString;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.invoke;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        V v2 = this.invoke;
        this.invoke = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            K k = this.toString;
            if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                V v = this.invoke;
                if (v != null ? v.equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K k = this.toString;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.invoke;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    public String toString() {
        return this.toString + "=" + this.invoke;
    }

    public LinkedHashTreeMap$HaptikSDK$c<K, V> ag$a() {
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c = this;
        for (LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = this.valueOf; linkedHashTreeMap$HaptikSDK$c2 != null; linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c2.valueOf) {
            linkedHashTreeMap$HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c2;
        }
        return linkedHashTreeMap$HaptikSDK$c;
    }

    public LinkedHashTreeMap$HaptikSDK$c<K, V> valueOf() {
        LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c = this;
        for (LinkedHashTreeMap$HaptikSDK$c<K, V> linkedHashTreeMap$HaptikSDK$c2 = this.HaptikSDK$a; linkedHashTreeMap$HaptikSDK$c2 != null; linkedHashTreeMap$HaptikSDK$c2 = linkedHashTreeMap$HaptikSDK$c2.HaptikSDK$a) {
            linkedHashTreeMap$HaptikSDK$c = linkedHashTreeMap$HaptikSDK$c2;
        }
        return linkedHashTreeMap$HaptikSDK$c;
    }
}

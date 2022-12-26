package com.google.gson.internal;

import java.util.Map;
/* loaded from: classes5.dex */
final class LinkedHashTreeMap$ah$b<K, V> implements Map.Entry<K, V> {
    LinkedHashTreeMap$ah$b<K, V> HaptikSDK$a;
    LinkedHashTreeMap$ah$b<K, V> HaptikSDK$b;
    V HaptikSDK$c;
    final K ag$a;
    LinkedHashTreeMap$ah$b<K, V> ah$a;
    LinkedHashTreeMap$ah$b<K, V> ah$b;
    final int toString;
    LinkedHashTreeMap$ah$b<K, V> valueOf;
    int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedHashTreeMap$ah$b() {
        this.ag$a = null;
        this.toString = -1;
        this.HaptikSDK$b = this;
        this.ah$a = this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedHashTreeMap$ah$b(LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b, K k, int i, LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2, LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b3) {
        this.ah$b = linkedHashTreeMap$ah$b;
        this.ag$a = k;
        this.toString = i;
        this.values = 1;
        this.ah$a = linkedHashTreeMap$ah$b2;
        this.HaptikSDK$b = linkedHashTreeMap$ah$b3;
        linkedHashTreeMap$ah$b3.ah$a = this;
        linkedHashTreeMap$ah$b2.HaptikSDK$b = this;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.ag$a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.HaptikSDK$c;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        V v2 = this.HaptikSDK$c;
        this.HaptikSDK$c = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            K k = this.ag$a;
            if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                V v = this.HaptikSDK$c;
                if (v != null ? v.equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K k = this.ag$a;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.HaptikSDK$c;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    public String toString() {
        return this.ag$a + "=" + this.HaptikSDK$c;
    }

    public LinkedHashTreeMap$ah$b<K, V> valueOf() {
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b = this;
        for (LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2 = this.valueOf; linkedHashTreeMap$ah$b2 != null; linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b2.valueOf) {
            linkedHashTreeMap$ah$b = linkedHashTreeMap$ah$b2;
        }
        return linkedHashTreeMap$ah$b;
    }

    public LinkedHashTreeMap$ah$b<K, V> values() {
        LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b = this;
        for (LinkedHashTreeMap$ah$b<K, V> linkedHashTreeMap$ah$b2 = this.HaptikSDK$a; linkedHashTreeMap$ah$b2 != null; linkedHashTreeMap$ah$b2 = linkedHashTreeMap$ah$b2.HaptikSDK$a) {
            linkedHashTreeMap$ah$b = linkedHashTreeMap$ah$b2;
        }
        return linkedHashTreeMap$ah$b;
    }
}

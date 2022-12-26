package com.google.gson.internal;

import java.util.Map;
/* loaded from: classes5.dex */
final class LinkedTreeMap$ag$a<K, V> implements Map.Entry<K, V> {
    LinkedTreeMap$ag$a<K, V> HaptikSDK$c;
    LinkedTreeMap$ag$a<K, V> ag$a;
    final K ah$a;
    LinkedTreeMap$ag$a<K, V> ah$b;
    V invoke;
    int toString;
    LinkedTreeMap$ag$a<K, V> valueOf;
    LinkedTreeMap$ag$a<K, V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedTreeMap$ag$a() {
        this.ah$a = null;
        this.HaptikSDK$c = this;
        this.ag$a = this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedTreeMap$ag$a(LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a, K k, LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a2, LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a3) {
        this.values = linkedTreeMap$ag$a;
        this.ah$a = k;
        this.toString = 1;
        this.ag$a = linkedTreeMap$ag$a2;
        this.HaptikSDK$c = linkedTreeMap$ag$a3;
        linkedTreeMap$ag$a3.ag$a = this;
        linkedTreeMap$ag$a2.HaptikSDK$c = this;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.ah$a;
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
            K k = this.ah$a;
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
        K k = this.ah$a;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.invoke;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    public String toString() {
        return this.ah$a + "=" + this.invoke;
    }

    public LinkedTreeMap$ag$a<K, V> ah$a() {
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a = this;
        for (LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a2 = this.valueOf; linkedTreeMap$ag$a2 != null; linkedTreeMap$ag$a2 = linkedTreeMap$ag$a2.valueOf) {
            linkedTreeMap$ag$a = linkedTreeMap$ag$a2;
        }
        return linkedTreeMap$ag$a;
    }

    public LinkedTreeMap$ag$a<K, V> values() {
        LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a = this;
        for (LinkedTreeMap$ag$a<K, V> linkedTreeMap$ag$a2 = this.ah$b; linkedTreeMap$ag$a2 != null; linkedTreeMap$ag$a2 = linkedTreeMap$ag$a2.ah$b) {
            linkedTreeMap$ag$a = linkedTreeMap$ag$a2;
        }
        return linkedTreeMap$ag$a;
    }
}

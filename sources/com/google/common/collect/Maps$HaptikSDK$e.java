package com.google.common.collect;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class Maps$HaptikSDK$e<K, V> extends Maps$HaptikSDK$c<K, V> implements Set<Map.Entry<K, V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Maps$HaptikSDK$e(Set<Map.Entry<K, V>> set) {
        super(set);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return Sets.ag$a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.toString(this);
    }
}

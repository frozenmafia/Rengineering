package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.AsyncListUtil;
import o.markViewHoldersUpdated;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class Maps$ah$b<K, V1, V2> extends Maps.valueOf<K, V2> {
    final Map<K, V1> ag$a;
    final Maps$ag$a<? super K, ? super V1, V2> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Maps$ah$b(Map<K, V1> map, Maps$ag$a<? super K, ? super V1, V2> maps$ag$a) {
        this.ag$a = (Map) markViewHoldersUpdated.toString(map);
        this.valueOf = (Maps$ag$a) markViewHoldersUpdated.toString(maps$ag$a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.ag$a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.ag$a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V2 get(Object obj) {
        V1 v1 = this.ag$a.get(obj);
        if (v1 != null || this.ag$a.containsKey(obj)) {
            return this.valueOf.values(obj, (Object) AsyncListUtil.ViewCallback.ag$a(v1));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V2 remove(Object obj) {
        if (this.ag$a.containsKey(obj)) {
            return this.valueOf.values(obj, (Object) AsyncListUtil.ViewCallback.ag$a(this.ag$a.remove(obj)));
        }
        return null;
    }

    @Override // com.google.common.collect.Maps.valueOf, java.util.AbstractMap, java.util.Map
    public void clear() {
        this.ag$a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        return this.ag$a.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Maps.valueOf
    public Iterator<Map.Entry<K, V2>> ag$a() {
        this.ag$a.entrySet().iterator();
        return markViewHoldersUpdated.toString(Maps.valueOf(this.valueOf));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V2> values() {
        return new Maps.getSignupData(this);
    }
}

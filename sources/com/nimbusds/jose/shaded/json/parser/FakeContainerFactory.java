package com.nimbusds.jose.shaded.json.parser;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.QueryInterceptorDatabase$$ExternalSyntheticLambda2;
/* loaded from: classes7.dex */
public class FakeContainerFactory implements QueryInterceptorDatabase$$ExternalSyntheticLambda2 {
    public FakeContainerFactory$ag$a toString;
    public FackList valueOf;

    @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda2
    public List<Object> values() {
        if (this.valueOf == null) {
            this.valueOf = new FackList();
        }
        return this.valueOf;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.nimbusds.jose.shaded.json.parser.FakeContainerFactory$ag$a] */
    @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda2
    public Map<String, Object> valueOf() {
        if (this.toString == null) {
            this.toString = new AbstractMap<String, Object>() { // from class: com.nimbusds.jose.shaded.json.parser.FakeContainerFactory$ag$a
                @Override // java.util.AbstractMap, java.util.Map
                /* renamed from: ah$a */
                public Object put(String str, Object obj) {
                    return null;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public Set<Map.Entry<String, Object>> entrySet() {
                    return null;
                }
            };
        }
        return this.toString;
    }

    /* loaded from: classes7.dex */
    static class FackList extends ArrayList<Object> {
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public Object get(int i) {
            return null;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return 0;
        }

        FackList() {
        }
    }
}

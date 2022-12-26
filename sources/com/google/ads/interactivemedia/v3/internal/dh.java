package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes4.dex */
final class dh extends auh {
    private final Map a;

    public dh(Map map) {
        this.a = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auh, com.google.ads.interactivemedia.v3.internal.aui
    protected final /* synthetic */ Object a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.auh
    public final Map b() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auh, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auh, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.d(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auh, java.util.Map
    public final Set entrySet() {
        return axb.e(b().entrySet(), dg.f1013b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auh, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.e(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auh, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) b().get(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auh, java.util.Map
    public final int hashCode() {
        return super.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auh, java.util.Map
    public final boolean isEmpty() {
        if (b().isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auh, java.util.Map
    public final Set keySet() {
        return axb.e(b().keySet(), dg.a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auh, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}

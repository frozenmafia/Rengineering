package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class atq extends atj implements SortedMap {
    SortedSet d;
    final /* synthetic */ atw e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atq(atw atwVar, SortedMap sortedMap) {
        super(atwVar, sortedMap);
        this.e = atwVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return h().firstKey();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SortedMap h() {
        return (SortedMap) this.a;
    }

    public SortedMap headMap(Object obj) {
        return new atq(this.e, h().headMap(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.awc
    /* renamed from: i */
    public SortedSet g() {
        return new atr(this.e, h());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atj, com.google.ads.interactivemedia.v3.internal.awc, java.util.AbstractMap, java.util.Map
    /* renamed from: j */
    public SortedSet keySet() {
        SortedSet sortedSet = this.d;
        if (sortedSet == null) {
            SortedSet g = g();
            this.d = g;
            return g;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return h().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new atq(this.e, h().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new atq(this.e, h().tailMap(obj));
    }
}

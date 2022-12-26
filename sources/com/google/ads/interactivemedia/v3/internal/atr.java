package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class atr extends atm implements SortedSet {
    final /* synthetic */ atw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atr(atw atwVar, SortedMap sortedMap) {
        super(atwVar, sortedMap);
        this.c = atwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SortedMap b() {
        return (SortedMap) this.d;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new atr(this.c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new atr(this.c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new atr(this.c, b().tailMap(obj));
    }
}

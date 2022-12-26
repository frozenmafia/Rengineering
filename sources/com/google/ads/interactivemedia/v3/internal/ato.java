package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ato extends atr implements NavigableSet {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ atw f715b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ato(atw atwVar, NavigableMap navigableMap) {
        super(atwVar, navigableMap);
        this.f715b = atwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.atr
    /* renamed from: a */
    public final NavigableMap b() {
        return (NavigableMap) super.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new ato(this.f715b, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atr, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return axb.w(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return axb.w(descendingIterator());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atr, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atr, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new ato(this.f715b, b().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new ato(this.f715b, b().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new ato(this.f715b, b().tailMap(obj, z));
    }
}

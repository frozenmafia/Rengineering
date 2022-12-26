package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class awx extends aww implements SortedSet {
    /* JADX INFO: Access modifiers changed from: package-private */
    public awx(SortedSet sortedSet, asz aszVar) {
        super(sortedSet, aszVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.a.iterator();
        asz aszVar = this.f722b;
        atc.k(it);
        atc.k(aszVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (aszVar.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new awx(((SortedSet) this.a).headSet(obj), this.f722b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f722b.a(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new awx(((SortedSet) this.a).subSet(obj, obj2), this.f722b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new awx(((SortedSet) this.a).tailSet(obj), this.f722b);
    }
}

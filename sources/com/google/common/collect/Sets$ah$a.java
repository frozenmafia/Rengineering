package com.google.common.collect;

import com.google.common.collect.Sets;
import java.util.Comparator;
import java.util.SortedSet;
import o.findViewHolder;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class Sets$ah$a<E> extends Sets.toString<E> implements SortedSet<E> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Sets$ah$a(SortedSet<E> sortedSet, findViewHolder<? super E> findviewholder) {
        super(sortedSet, findviewholder);
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return ((SortedSet) this.values).comparator();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e, E e2) {
        return new Sets$ah$a(((SortedSet) this.values).subSet(e, e2), this.toString);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e) {
        return new Sets$ah$a(((SortedSet) this.values).headSet(e), this.toString);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e) {
        return new Sets$ah$a(((SortedSet) this.values).tailSet(e), this.toString);
    }

    @Override // java.util.SortedSet
    public E first() {
        return (E) Iterators.toString(this.values.iterator(), this.toString);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    @Override // java.util.SortedSet
    public E last() {
        SortedSet sortedSet = (SortedSet) this.values;
        while (true) {
            ?? r1 = (Object) sortedSet.last();
            if (this.toString.apply(r1)) {
                return r1;
            }
            sortedSet = sortedSet.headSet(r1);
        }
    }
}

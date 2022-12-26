package com.google.common.collect;

import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.NavigableSet;
import o.detachViewFromParent;
import o.refreshData$ag$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements detachViewFromParent<E> {
    private static final long serialVersionUID = 0;
    private transient UnmodifiableSortedMultiset<E> descendingMultiset;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnmodifiableSortedMultiset(detachViewFromParent<E> detachviewfromparent) {
        super(detachviewfromparent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, o.addTile, o.updateRange, o.removeTile
    public detachViewFromParent<E> delegate() {
        return (detachViewFromParent) super.delegate();
    }

    @Override // o.detachViewFromParent, o.hideViewInternal
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    public NavigableSet<E> createElementSet() {
        return Sets.valueOf(delegate().elementSet());
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, o.addTile, o.refreshData
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }

    @Override // o.detachViewFromParent
    public detachViewFromParent<E> descendingMultiset() {
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset = this.descendingMultiset;
        if (unmodifiableSortedMultiset == null) {
            UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset<>(delegate().descendingMultiset());
            unmodifiableSortedMultiset2.descendingMultiset = this;
            this.descendingMultiset = unmodifiableSortedMultiset2;
            return unmodifiableSortedMultiset2;
        }
        return unmodifiableSortedMultiset;
    }

    @Override // o.detachViewFromParent
    public refreshData$ag$a<E> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // o.detachViewFromParent
    public refreshData$ag$a<E> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // o.detachViewFromParent
    public refreshData$ag$a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // o.detachViewFromParent
    public refreshData$ag$a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // o.detachViewFromParent
    public detachViewFromParent<E> headMultiset(E e, BoundType boundType) {
        return Multisets.ag$a((detachViewFromParent) delegate().headMultiset(e, boundType));
    }

    @Override // o.detachViewFromParent
    public detachViewFromParent<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return Multisets.ag$a((detachViewFromParent) delegate().subMultiset(e, boundType, e2, boundType2));
    }

    @Override // o.detachViewFromParent
    public detachViewFromParent<E> tailMultiset(E e, BoundType boundType) {
        return Multisets.ag$a((detachViewFromParent) delegate().tailMultiset(e, boundType));
    }
}

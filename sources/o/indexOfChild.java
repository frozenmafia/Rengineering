package o;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets;
import com.google.common.collect.Multisets$ah$a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* loaded from: classes7.dex */
final class indexOfChild {

    /* loaded from: classes7.dex */
    static class toString<E> extends Multisets$ah$a<E> implements SortedSet<E> {
        private final detachViewFromParent<E> ah$a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString(detachViewFromParent<E> detachviewfromparent) {
            this.ah$a = detachviewfromparent;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multisets$ah$a
        /* renamed from: valueOf */
        public final detachViewFromParent<E> ag$a() {
            return this.ah$a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.toString(ag$a().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ag$a().comparator();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return ag$a().subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return ag$a().headMultiset(e, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return ag$a().tailMultiset(e, BoundType.CLOSED).elementSet();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) indexOfChild.toString(ag$a().firstEntry());
        }

        @Override // java.util.SortedSet
        public E last() {
            return (E) indexOfChild.toString(ag$a().lastEntry());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E toString(refreshData$ag$a<E> refreshdata_ag_a) {
        if (refreshdata_ag_a == null) {
            throw new NoSuchElementException();
        }
        return refreshdata_ag_a.getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E ah$a(refreshData$ag$a<E> refreshdata_ag_a) {
        if (refreshdata_ag_a == null) {
            return null;
        }
        return refreshdata_ag_a.getElement();
    }
}

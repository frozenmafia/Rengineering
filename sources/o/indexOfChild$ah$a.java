package o;

import com.google.common.collect.BoundType;
import java.util.Iterator;
import java.util.NavigableSet;
import o.indexOfChild;
/* loaded from: classes7.dex */
class indexOfChild$ah$a<E> extends indexOfChild.toString<E> implements NavigableSet<E> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public indexOfChild$ah$a(detachViewFromParent<E> detachviewfromparent) {
        super(detachviewfromparent);
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        Object ah$a;
        ah$a = indexOfChild.ah$a(ag$a().headMultiset(e, BoundType.OPEN).lastEntry());
        return (E) ah$a;
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        Object ah$a;
        ah$a = indexOfChild.ah$a(ag$a().headMultiset(e, BoundType.CLOSED).lastEntry());
        return (E) ah$a;
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        Object ah$a;
        ah$a = indexOfChild.ah$a(ag$a().tailMultiset(e, BoundType.CLOSED).firstEntry());
        return (E) ah$a;
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        Object ah$a;
        ah$a = indexOfChild.ah$a(ag$a().tailMultiset(e, BoundType.OPEN).firstEntry());
        return (E) ah$a;
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return new indexOfChild$ah$a(ag$a().descendingMultiset());
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        Object ah$a;
        ah$a = indexOfChild.ah$a(ag$a().pollFirstEntry());
        return (E) ah$a;
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        Object ah$a;
        ah$a = indexOfChild.ah$a(ag$a().pollLastEntry());
        return (E) ah$a;
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        return new indexOfChild$ah$a(ag$a().subMultiset(e, BoundType.forBoolean(z), e2, BoundType.forBoolean(z2)));
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e, boolean z) {
        return new indexOfChild$ah$a(ag$a().headMultiset(e, BoundType.forBoolean(z)));
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e, boolean z) {
        return new indexOfChild$ah$a(ag$a().tailMultiset(e, BoundType.forBoolean(z)));
    }
}

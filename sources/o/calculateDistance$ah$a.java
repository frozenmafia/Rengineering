package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;
/* loaded from: classes5.dex */
class calculateDistance$ah$a extends calculateDistance$ag$a implements ListIterator {
    final /* synthetic */ calculateDistance<E> ah$a;

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public calculateDistance$ah$a(calculateDistance calculatedistance, int i) {
        super(calculatedistance);
        this.ah$a = calculatedistance;
        calculateDistance.ag$a.valueOf(i, calculatedistance.size());
        valueOf(i);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return ah$a() > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return ah$a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        calculateDistance<E> calculatedistance = this.ah$a;
        valueOf(ah$a() - 1);
        return calculatedistance.get(ah$a());
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return ah$a() - 1;
    }
}

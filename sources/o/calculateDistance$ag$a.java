package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.Transition;
/* loaded from: classes5.dex */
class calculateDistance$ag$a implements Iterator<E>, Transition.ArrayListManager {
    private int ag$a;
    final /* synthetic */ calculateDistance<E> values;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public calculateDistance$ag$a(calculateDistance calculatedistance) {
        this.values = calculatedistance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int ah$a() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void valueOf(int i) {
        this.ag$a = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ag$a < this.values.size();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        calculateDistance<E> calculatedistance = this.values;
        int i = this.ag$a;
        this.ag$a = i + 1;
        return calculatedistance.get(i);
    }
}

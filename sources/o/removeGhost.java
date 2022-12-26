package o;

import java.util.Iterator;
import o.Transition;
/* loaded from: classes7.dex */
public abstract class removeGhost implements Iterator<Double>, Transition.ArrayListManager {
    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract double values();

    @Override // java.util.Iterator
    public /* synthetic */ Double next() {
        return Double.valueOf(values());
    }
}

package o;

import java.util.Iterator;
import o.Transition;
/* loaded from: classes7.dex */
public abstract class fetchRemoveGhostMethod implements Iterator<Float>, Transition.ArrayListManager {
    public abstract float ah$a();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Float next() {
        return Float.valueOf(ah$a());
    }
}

package o;

import java.util.Iterator;
import o.Transition;
/* loaded from: classes7.dex */
public abstract class GhostView implements Iterator<Byte>, Transition.ArrayListManager {
    public abstract byte ah$a();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Byte next() {
        return Byte.valueOf(ah$a());
    }
}

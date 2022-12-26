package o;

import java.util.Iterator;
import o.Transition;
/* loaded from: classes5.dex */
public abstract class copySize implements Iterator<Integer>, Transition.ArrayListManager {
    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }
}

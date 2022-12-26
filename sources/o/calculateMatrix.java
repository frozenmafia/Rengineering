package o;

import java.util.Iterator;
import o.Transition;
/* loaded from: classes7.dex */
public abstract class calculateMatrix implements Iterator<Long>, Transition.ArrayListManager {
    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }
}

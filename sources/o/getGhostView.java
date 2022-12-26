package o;

import java.util.Iterator;
import o.Transition;
/* loaded from: classes5.dex */
public final class getGhostView<T> implements Iterator<GhostViewPort<? extends T>>, Transition.ArrayListManager {
    private int toString;
    private final Iterator<T> valueOf;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getGhostView(Iterator<? extends T> it) {
        runAnimators.ag$a(it, "iterator");
        this.valueOf = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.valueOf.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: values */
    public final GhostViewPort<T> next() {
        int i = this.toString;
        this.toString = i + 1;
        if (i < 0) {
            reserveEndViewTransition.ag$a();
        }
        return new GhostViewPort<>(i, this.valueOf.next());
    }
}

package o;

import java.util.Iterator;
import o.Styleable;
import o.Transition;
/* loaded from: classes5.dex */
public final class setMatrix<T> implements Iterable<GhostViewPort<? extends T>>, Transition.ArrayListManager {
    private final Styleable.ArcMotion<Iterator<T>> valueOf;

    /* JADX WARN: Multi-variable type inference failed */
    public setMatrix(Styleable.ArcMotion<? extends Iterator<? extends T>> arcMotion) {
        runAnimators.ag$a(arcMotion, "iteratorFactory");
        this.valueOf = arcMotion;
    }

    @Override // java.lang.Iterable
    public Iterator<GhostViewPort<T>> iterator() {
        return new getGhostView(this.valueOf.invoke());
    }
}

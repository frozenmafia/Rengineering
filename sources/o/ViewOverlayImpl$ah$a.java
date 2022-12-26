package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.Styleable;
import o.Transition;
/* loaded from: classes7.dex */
public final class ViewOverlayImpl$ah$a implements Iterator<T>, Transition.ArrayListManager {
    private int ag$a = -2;
    final /* synthetic */ ViewOverlayImpl<T> ah$a;
    private T values;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOverlayImpl$ah$a(ViewOverlayImpl<T> viewOverlayImpl) {
        this.ah$a = viewOverlayImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        Styleable.ChangeBounds changeBounds;
        T t;
        Styleable.ArcMotion arcMotion;
        if (this.ag$a == -2) {
            arcMotion = ((ViewOverlayImpl) this.ah$a).toString;
            t = arcMotion.invoke();
        } else {
            changeBounds = ((ViewOverlayImpl) this.ah$a).valueOf;
            T t2 = this.values;
            runAnimators.toString(t2);
            t = changeBounds.invoke(t2);
        }
        this.values = t;
        this.ag$a = t == 0 ? 0 : 1;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.ag$a < 0) {
            values();
        }
        if (this.ag$a == 0) {
            throw new NoSuchElementException();
        }
        T t = this.values;
        runAnimators.values((Object) t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.ag$a = -1;
        return t;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.ag$a < 0) {
            values();
        }
        return this.ag$a == 1;
    }
}

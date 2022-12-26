package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.Transition;
/* loaded from: classes5.dex */
public abstract class calculateOut<T> implements Iterator<T>, Transition.ArrayListManager {
    private kotlin.collections.State ag$a = kotlin.collections.State.NotReady;
    private T values;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class valueOf {
        public static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[kotlin.collections.State.values().length];
            try {
                iArr[kotlin.collections.State.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.collections.State.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            ah$a = iArr;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected abstract void valueOf();

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.ag$a != kotlin.collections.State.Failed) {
            int i = valueOf.ah$a[this.ag$a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return values();
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.ag$a = kotlin.collections.State.NotReady;
        return this.values;
    }

    private final boolean values() {
        this.ag$a = kotlin.collections.State.Failed;
        valueOf();
        return this.ag$a == kotlin.collections.State.Ready;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ag$a(T t) {
        this.values = t;
        this.ag$a = kotlin.collections.State.Ready;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ag$a() {
        this.ag$a = kotlin.collections.State.Done;
    }
}

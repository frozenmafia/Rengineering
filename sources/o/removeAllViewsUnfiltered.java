package o;

import com.google.common.collect.Iterators;
import java.util.ListIterator;
/* loaded from: classes7.dex */
public abstract class removeAllViewsUnfiltered<F, T> extends unhide<F, T> implements ListIterator<T> {
    public removeAllViewsUnfiltered(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> values() {
        return Iterators.toString(this.HaptikSDK$a);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return values().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return toString(values().previous());
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return values().nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return values().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }
}

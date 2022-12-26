package o;

import java.util.Iterator;
/* loaded from: classes5.dex */
public abstract class unhide<F, T> implements Iterator<T> {
    final Iterator<? extends F> HaptikSDK$a;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T toString(F f);

    public unhide(Iterator<? extends F> it) {
        this.HaptikSDK$a = (Iterator) markViewHoldersUpdated.toString(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.HaptikSDK$a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return toString(this.HaptikSDK$a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.HaptikSDK$a.remove();
    }
}

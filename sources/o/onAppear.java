package o;

import java.util.AbstractCollection;
import java.util.Collection;
import o.Transition;
/* loaded from: classes5.dex */
public abstract class onAppear<E> extends AbstractCollection<E> implements Collection<E>, Transition.AnonymousClass1 {
    public abstract int ag$a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ag$a();
    }
}

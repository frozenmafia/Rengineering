package o;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
/* loaded from: classes7.dex */
public abstract class isTileLoaded<E> extends updateRange<E> implements Set<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.updateRange, o.removeTile
    public abstract Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.updateRange
    public boolean standardRemoveAll(Collection<?> collection) {
        return Sets.toString(this, (Collection) markViewHoldersUpdated.toString(collection));
    }

    protected boolean standardEquals(Object obj) {
        return Sets.ag$a(this, obj);
    }

    protected int standardHashCode() {
        return Sets.toString(this);
    }
}

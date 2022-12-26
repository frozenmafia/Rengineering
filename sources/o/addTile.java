package o;

import com.google.common.collect.Iterators;
import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes7.dex */
public abstract class addTile<E> extends updateRange<E> implements refreshData<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.updateRange, o.removeTile
    public abstract refreshData<E> delegate();

    @Override // o.refreshData
    public int count(Object obj) {
        return delegate().count(obj);
    }

    public int add(E e, int i) {
        return delegate().add(e, i);
    }

    public int remove(Object obj, int i) {
        return delegate().remove(obj, i);
    }

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<refreshData$ag$a<E>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, o.refreshData
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, o.refreshData
    public int hashCode() {
        return delegate().hashCode();
    }

    public int setCount(E e, int i) {
        return delegate().setCount(e, i);
    }

    public boolean setCount(E e, int i, int i2) {
        return delegate().setCount(e, i, i2);
    }

    @Override // o.updateRange
    protected boolean standardContains(Object obj) {
        return count(obj) > 0;
    }

    @Override // o.updateRange
    protected void standardClear() {
        Iterators.values(entrySet().iterator());
    }

    protected int standardCount(Object obj) {
        for (refreshData$ag$a<E> refreshdata_ag_a : entrySet()) {
            if (recycleUpdateOp.values(refreshdata_ag_a.getElement(), obj)) {
                return refreshdata_ag_a.getCount();
            }
        }
        return 0;
    }

    protected boolean standardAdd(E e) {
        add(e, 1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.updateRange
    public boolean standardAddAll(Collection<? extends E> collection) {
        return Multisets.values(this, collection);
    }

    @Override // o.updateRange
    protected boolean standardRemove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // o.updateRange
    protected boolean standardRemoveAll(Collection<?> collection) {
        return Multisets.ag$a(this, collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.updateRange
    public boolean standardRetainAll(Collection<?> collection) {
        return Multisets.valueOf(this, collection);
    }

    protected int standardSetCount(E e, int i) {
        return Multisets.valueOf(this, e, i);
    }

    protected boolean standardSetCount(E e, int i, int i2) {
        return Multisets.ag$a(this, e, i, i2);
    }

    protected Iterator<E> standardIterator() {
        return Multisets.toString(this);
    }

    protected int standardSize() {
        return Multisets.ag$a(this);
    }

    protected boolean standardEquals(Object obj) {
        return Multisets.ah$a(this, obj);
    }

    protected int standardHashCode() {
        return entrySet().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.updateRange
    public String standardToString() {
        return entrySet().toString();
    }
}

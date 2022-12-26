package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes5.dex */
public interface refreshData<E> extends Collection<E> {
    int add(E e, int i);

    @Override // java.util.Collection, o.refreshData
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<E> elementSet();

    Set<refreshData$ag$a<E>> entrySet();

    @Override // o.refreshData
    boolean equals(Object obj);

    @Override // o.refreshData
    int hashCode();

    @Override // java.util.Collection, java.lang.Iterable, o.refreshData
    Iterator<E> iterator();

    int remove(Object obj, int i);

    @Override // java.util.Collection, o.refreshData
    boolean remove(Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    @Override // java.util.Collection, o.refreshData
    int size();
}

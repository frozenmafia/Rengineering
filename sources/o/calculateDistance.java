package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes5.dex */
public abstract class calculateDistance<E> extends restore<E> implements List<E> {
    public static final toString ag$a = new toString(null);

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int i);

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new calculateDistance$ag$a(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (runAnimators.values(e2, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        calculateDistance<E> calculatedistance = this;
        ListIterator<E> listIterator = calculatedistance.listIterator(calculatedistance.size());
        while (listIterator.hasPrevious()) {
            if (runAnimators.values(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new calculateDistance$ah$a(this, 0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new calculateDistance$ah$a(this, i);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new values(this, i, i2);
    }

    /* loaded from: classes5.dex */
    static final class values<E> extends calculateDistance<E> implements RandomAccess {
        private final int toString;
        private final calculateDistance<E> valueOf;
        private int values;

        /* JADX WARN: Multi-variable type inference failed */
        public values(calculateDistance<? extends E> calculatedistance, int i, int i2) {
            runAnimators.ag$a(calculatedistance, "list");
            this.valueOf = calculatedistance;
            this.toString = i;
            calculateDistance.ag$a.ag$a(i, i2, calculatedistance.size());
            this.values = i2 - i;
        }

        @Override // o.calculateDistance, java.util.List
        public E get(int i) {
            calculateDistance.ag$a.ah$a(i, this.values);
            return this.valueOf.get(this.toString + i);
        }

        @Override // o.restore
        public int values() {
            return this.values;
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return ag$a.values(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return ag$a.ah$a(this);
    }

    /* loaded from: classes5.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        public final void ah$a(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void valueOf(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void ag$a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i <= i2) {
            } else {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        public final int ah$a(Collection<?> collection) {
            runAnimators.ag$a(collection, "c");
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        public final boolean values(Collection<?> collection, Collection<?> collection2) {
            runAnimators.ag$a(collection, "c");
            runAnimators.ag$a(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!runAnimators.values(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }
    }
}

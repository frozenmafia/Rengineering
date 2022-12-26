package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import o.getChangePayload;
import o.getItemRangeInto;
import o.markViewHoldersUpdated;
import o.recycleData;
import o.removeViewIfHidden;
/* loaded from: classes5.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] internalArray() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract removeViewIfHidden<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        markViewHoldersUpdated.toString(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return (T[]) getItemRangeInto.toString(internalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) recycleData.valueOf(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        return isEmpty() ? ImmutableList.of() : ImmutableList.asImmutableList(toArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int copyIntoArray(Object[] objArr, int i) {
        removeViewIfHidden<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    /* loaded from: classes5.dex */
    public static abstract class toString<E> {
        public abstract toString<E> valueOf(E e);

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int valueOf(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        public toString<E> values(E... eArr) {
            for (E e : eArr) {
                valueOf((toString<E>) e);
            }
            return this;
        }

        public toString<E> toString(Iterable<? extends E> iterable) {
            for (E e : iterable) {
                valueOf((toString<E>) e);
            }
            return this;
        }

        public toString<E> valueOf(Iterator<? extends E> it) {
            while (it.hasNext()) {
                valueOf((toString<E>) it.next());
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static abstract class valueOf<E> extends toString<E> {
        int ag$a;
        Object[] ah$a;
        boolean values;

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf(int i) {
            getChangePayload.values(i, "initialCapacity");
            this.ah$a = new Object[i];
            this.ag$a = 0;
        }

        private void valueOf(int i) {
            Object[] objArr = this.ah$a;
            if (objArr.length < i) {
                this.ah$a = Arrays.copyOf(objArr, valueOf(objArr.length, i));
                this.values = false;
            } else if (this.values) {
                this.ah$a = (Object[]) objArr.clone();
                this.values = false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.toString
        /* renamed from: ag$a */
        public valueOf<E> valueOf(E e) {
            markViewHoldersUpdated.toString(e);
            valueOf(this.ag$a + 1);
            Object[] objArr = this.ah$a;
            int i = this.ag$a;
            this.ag$a = i + 1;
            objArr[i] = e;
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.toString
        public toString<E> values(E... eArr) {
            toString(eArr, eArr.length);
            return this;
        }

        final void toString(Object[] objArr, int i) {
            recycleData.toString(objArr, i);
            valueOf(this.ag$a + i);
            System.arraycopy(objArr, 0, this.ah$a, this.ag$a, i);
            this.ag$a += i;
        }

        @Override // com.google.common.collect.ImmutableCollection.toString
        public toString<E> toString(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                valueOf(this.ag$a + collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.ag$a = ((ImmutableCollection) collection).copyIntoArray(this.ah$a, this.ag$a);
                    return this;
                }
            }
            super.toString(iterable);
            return this;
        }
    }
}

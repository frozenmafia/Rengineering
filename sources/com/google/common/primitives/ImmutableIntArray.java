package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import o.markViewHoldersUpdated;
import okhttp3.HttpUrl;
/* loaded from: classes7.dex */
public final class ImmutableIntArray implements Serializable {
    private static final ImmutableIntArray EMPTY = new ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;
    private final transient int start;

    public static ImmutableIntArray of() {
        return EMPTY;
    }

    public static ImmutableIntArray of(int i) {
        return new ImmutableIntArray(new int[]{i});
    }

    public static ImmutableIntArray of(int i, int i2) {
        return new ImmutableIntArray(new int[]{i, i2});
    }

    public static ImmutableIntArray of(int i, int i2, int i3) {
        return new ImmutableIntArray(new int[]{i, i2, i3});
    }

    public static ImmutableIntArray of(int i, int i2, int i3, int i4) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4});
    }

    public static ImmutableIntArray of(int i, int i2, int i3, int i4, int i5) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5});
    }

    public static ImmutableIntArray of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5, i6});
    }

    public static ImmutableIntArray of(int i, int... iArr) {
        markViewHoldersUpdated.toString(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? EMPTY : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableIntArray(Ints.ag$a(collection));
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Integer>) iterable);
        }
        return builder().toString(iterable).ag$a();
    }

    public static values builder(int i) {
        markViewHoldersUpdated.values(i >= 0, "Invalid initialCapacity: %s", i);
        return new values(i);
    }

    public static values builder() {
        return new values(10);
    }

    /* loaded from: classes7.dex */
    public static final class values {
        private int[] toString;
        private int values = 0;

        values(int i) {
            this.toString = new int[i];
        }

        public values valueOf(int i) {
            ah$a(1);
            int[] iArr = this.toString;
            int i2 = this.values;
            iArr[i2] = i;
            this.values = i2 + 1;
            return this;
        }

        public values toString(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return valueOf((Collection) iterable);
            }
            for (Integer num : iterable) {
                valueOf(num.intValue());
            }
            return this;
        }

        public values valueOf(Collection<Integer> collection) {
            ah$a(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.toString;
                int i = this.values;
                this.values = i + 1;
                iArr[i] = num.intValue();
            }
            return this;
        }

        private void ah$a(int i) {
            int i2 = this.values + i;
            int[] iArr = this.toString;
            if (i2 > iArr.length) {
                this.toString = Arrays.copyOf(iArr, values(iArr.length, i2));
            }
        }

        private static int values(int i, int i2) {
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

        public ImmutableIntArray ag$a() {
            return this.values == 0 ? ImmutableIntArray.EMPTY : new ImmutableIntArray(this.toString, 0, this.values);
        }
    }

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    private ImmutableIntArray(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.start = i;
        this.end = i2;
    }

    public int length() {
        return this.end - this.start;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int get(int i) {
        markViewHoldersUpdated.toString(i, length());
        return this.array[this.start + i];
    }

    public int indexOf(int i) {
        for (int i2 = this.start; i2 < this.end; i2++) {
            if (this.array[i2] == i) {
                return i2 - this.start;
            }
        }
        return -1;
    }

    public int lastIndexOf(int i) {
        int i2 = this.end;
        while (true) {
            i2--;
            int i3 = this.start;
            if (i2 < i3) {
                return -1;
            }
            if (this.array[i2] == i) {
                return i2 - i3;
            }
        }
    }

    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public ImmutableIntArray subArray(int i, int i2) {
        markViewHoldersUpdated.ag$a(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        int[] iArr = this.array;
        int i3 = this.start;
        return new ImmutableIntArray(iArr, i + i3, i3 + i2);
    }

    public List<Integer> asList() {
        return new AsList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private final ImmutableIntArray parent;

        private AsList(ImmutableIntArray immutableIntArray) {
            this.parent = immutableIntArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i) {
            return Integer.valueOf(this.parent.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            return this.parent.subArray(i, i2).asList();
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.parent.equals(((AsList) obj).parent);
            }
            if (obj instanceof List) {
                List list = (List) obj;
                if (size() != list.size()) {
                    return false;
                }
                int i = this.parent.start;
                for (Object obj2 : list) {
                    if (!(obj2 instanceof Integer) || this.parent.array[i] != ((Integer) obj2).intValue()) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableIntArray) {
            ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
            if (length() != immutableIntArray.length()) {
                return false;
            }
            for (int i = 0; i < length(); i++) {
                if (get(i) != immutableIntArray.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + Ints.values(this.array[i2]);
        }
        return i;
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        sb.append(this.array[this.start]);
        int i = this.start;
        while (true) {
            i++;
            if (i < this.end) {
                sb.append(", ");
                sb.append(this.array[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public ImmutableIntArray trimmed() {
        return isPartialView() ? new ImmutableIntArray(toArray()) : this;
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    Object writeReplace() {
        return trimmed();
    }

    Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }
}

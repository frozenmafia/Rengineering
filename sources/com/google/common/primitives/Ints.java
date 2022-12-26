package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import o.ConcatAdapterController;
import o.markViewHoldersUpdated;
/* loaded from: classes5.dex */
public final class Ints extends ConcatAdapterController {
    public static int toString(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static int toString(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int valueOf(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int values(int i) {
        return i;
    }

    public static int ah$a(long j) {
        int i = (int) j;
        markViewHoldersUpdated.ag$a(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int values(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int valueOf(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    public static int valueOf(int... iArr) {
        markViewHoldersUpdated.values(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] < i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    public static int values(int i, int i2, int i3) {
        markViewHoldersUpdated.ag$a(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    /* loaded from: classes7.dex */
    static final class IntConverter extends Converter<String, Integer> implements Serializable {
        static final IntConverter INSTANCE = new IntConverter();
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Ints.stringConverter()";
        }

        private IntConverter() {
        }

        @Override // com.google.common.base.Converter
        public Integer doForward(String str) {
            return Integer.decode(str);
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Integer num) {
            return num.toString();
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }

    /* loaded from: classes7.dex */
    enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                int valueOf = Ints.valueOf(iArr[i], iArr2[i]);
                if (valueOf != 0) {
                    return valueOf;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    public static int[] ag$a(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            return ((IntArrayAsList) collection).toIntArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) markViewHoldersUpdated.toString(array[i])).intValue();
        }
        return iArr;
    }

    public static List<Integer> ag$a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new IntArrayAsList(iArr);
    }

    /* loaded from: classes5.dex */
    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        IntArrayAsList(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        IntArrayAsList(int[] iArr, int i, int i2) {
            this.array = iArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i) {
            markViewHoldersUpdated.toString(i, size());
            return Integer.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && Ints.values(this.array, ((Integer) obj).intValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int values;
            if (!(obj instanceof Integer) || (values = Ints.values(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return values - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int valueOf;
            if (!(obj instanceof Integer) || (valueOf = Ints.valueOf(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return valueOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i, Integer num) {
            markViewHoldersUpdated.toString(i, size());
            int[] iArr = this.array;
            int i2 = this.start + i;
            int i3 = iArr[i2];
            iArr[i2] = ((Integer) markViewHoldersUpdated.toString(num)).intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            markViewHoldersUpdated.ag$a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.array;
            int i3 = this.start;
            return new IntArrayAsList(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof IntArrayAsList) {
                IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
                int size = size();
                if (intArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != intArrayAsList.array[intArrayAsList.start + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Ints.values(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
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

        int[] toIntArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}

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
import o.markViewHoldersUpdated;
/* loaded from: classes5.dex */
public final class Longs {
    public static long ag$a(byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9) {
        return ((b3 & 255) << 48) | ((b2 & 255) << 56) | ((b4 & 255) << 40) | ((b5 & 255) << 32) | ((b6 & 255) << 24) | ((b7 & 255) << 16) | ((b8 & 255) << 8) | (b9 & 255);
    }

    public static int ah$a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int ah$a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public static int values(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int ah$a(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    public static long toString(long... jArr) {
        markViewHoldersUpdated.values(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] < j) {
                j = jArr[i];
            }
        }
        return j;
    }

    public static long ah$a(long... jArr) {
        markViewHoldersUpdated.values(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] > j) {
                j = jArr[i];
            }
        }
        return j;
    }

    /* loaded from: classes7.dex */
    static final class LongConverter extends Converter<String, Long> implements Serializable {
        static final LongConverter INSTANCE = new LongConverter();
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Longs.stringConverter()";
        }

        private LongConverter() {
        }

        @Override // com.google.common.base.Converter
        public Long doForward(String str) {
            return Long.decode(str);
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Long l) {
            return l.toString();
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }

    /* loaded from: classes7.dex */
    enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                int ah$a = Longs.ah$a(jArr[i], jArr2[i]);
                if (ah$a != 0) {
                    return ah$a;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    public static long[] ah$a(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).toLongArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) markViewHoldersUpdated.toString(array[i])).longValue();
        }
        return jArr;
    }

    /* loaded from: classes7.dex */
    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        LongArrayAsList(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        LongArrayAsList(long[] jArr, int i, int i2) {
            this.array = jArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i) {
            markViewHoldersUpdated.toString(i, size());
            return Long.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Long) && Longs.values(this.array, ((Long) obj).longValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int values;
            if (!(obj instanceof Long) || (values = Longs.values(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return values - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int ah$a;
            if (!(obj instanceof Long) || (ah$a = Longs.ah$a(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return ah$a - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i, Long l) {
            markViewHoldersUpdated.toString(i, size());
            long[] jArr = this.array;
            int i2 = this.start + i;
            long j = jArr[i2];
            jArr[i2] = ((Long) markViewHoldersUpdated.toString(l)).longValue();
            return Long.valueOf(j);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            markViewHoldersUpdated.ag$a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            long[] jArr = this.array;
            int i3 = this.start;
            return new LongArrayAsList(jArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof LongArrayAsList) {
                LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
                int size = size();
                if (longArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != longArrayAsList.array[longArrayAsList.start + i]) {
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
                i = (i * 31) + Longs.ah$a(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
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

        long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}

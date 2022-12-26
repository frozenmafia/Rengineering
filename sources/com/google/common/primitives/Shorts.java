package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import o.calculateAndUpdateStateRestorationPolicy;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class Shorts extends calculateAndUpdateStateRestorationPolicy {
    public static int ah$a(short s) {
        return s;
    }

    public static int values(short s, short s2) {
        return s - s2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ah$a(short[] sArr, short s, int i, int i2) {
        while (i < i2) {
            if (sArr[i] == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int valueOf(short[] sArr, short s, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (sArr[i3] == s) {
                return i3;
            }
        }
        return -1;
    }

    /* loaded from: classes7.dex */
    static final class ShortConverter extends Converter<String, Short> implements Serializable {
        static final ShortConverter INSTANCE = new ShortConverter();
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Shorts.stringConverter()";
        }

        private ShortConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public Short doForward(String str) {
            return Short.decode(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(Short sh) {
            return sh.toString();
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }

    /* loaded from: classes7.dex */
    enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int min = Math.min(sArr.length, sArr2.length);
            for (int i = 0; i < min; i++) {
                int values = Shorts.values(sArr[i], sArr2[i]);
                if (values != 0) {
                    return values;
                }
            }
            return sArr.length - sArr2.length;
        }
    }

    /* loaded from: classes7.dex */
    static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        ShortArrayAsList(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        ShortArrayAsList(short[] sArr, int i, int i2) {
            this.array = sArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int i) {
            markViewHoldersUpdated.toString(i, size());
            return Short.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Short) && Shorts.ah$a(this.array, ((Short) obj).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int ah$a;
            if (!(obj instanceof Short) || (ah$a = Shorts.ah$a(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return ah$a - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int valueOf;
            if (!(obj instanceof Short) || (valueOf = Shorts.valueOf(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return valueOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int i, Short sh) {
            markViewHoldersUpdated.toString(i, size());
            short[] sArr = this.array;
            int i2 = this.start + i;
            short s = sArr[i2];
            sArr[i2] = ((Short) markViewHoldersUpdated.toString(sh)).shortValue();
            return Short.valueOf(s);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i, int i2) {
            markViewHoldersUpdated.ag$a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            short[] sArr = this.array;
            int i3 = this.start;
            return new ShortArrayAsList(sArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ShortArrayAsList) {
                ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
                int size = size();
                if (shortArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != shortArrayAsList.array[shortArrayAsList.start + i]) {
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
                i = (i * 31) + Shorts.ah$a(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append('[');
            sb.append((int) this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ");
                    sb.append((int) this.array[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        short[] toShortArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}

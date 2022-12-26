package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import o.markViewHoldersUpdated;
/* loaded from: classes5.dex */
public final class Booleans {
    public static int ah$a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int toString(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    /* loaded from: classes7.dex */
    enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");
        
        private final String toString;
        private final int trueValue;

        BooleanComparator(int i, String str) {
            this.trueValue = i;
            this.toString = str;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.trueValue : 0) - (bool.booleanValue() ? this.trueValue : 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }
    }

    public static boolean ag$a(boolean[] zArr, boolean z) {
        for (boolean z2 : zArr) {
            if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toString(boolean[] zArr, boolean z, int i, int i2) {
        while (i < i2) {
            if (zArr[i] == z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ag$a(boolean[] zArr, boolean z, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (zArr[i3] == z) {
                return i3;
            }
        }
        return -1;
    }

    /* loaded from: classes7.dex */
    enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int min = Math.min(zArr.length, zArr2.length);
            for (int i = 0; i < min; i++) {
                int booleans = Booleans.toString(zArr[i], zArr2[i]);
                if (booleans != 0) {
                    return booleans;
                }
            }
            return zArr.length - zArr2.length;
        }
    }

    /* loaded from: classes7.dex */
    static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        BooleanArrayAsList(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        BooleanArrayAsList(boolean[] zArr, int i, int i2) {
            this.array = zArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i) {
            markViewHoldersUpdated.toString(i, size());
            return Boolean.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && Booleans.toString(this.array, ((Boolean) obj).booleanValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int booleans;
            if (!(obj instanceof Boolean) || (booleans = Booleans.toString(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return booleans - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int ag$a;
            if (!(obj instanceof Boolean) || (ag$a = Booleans.ag$a(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return ag$a - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i, Boolean bool) {
            markViewHoldersUpdated.toString(i, size());
            boolean[] zArr = this.array;
            int i2 = this.start + i;
            boolean z = zArr[i2];
            zArr[i2] = ((Boolean) markViewHoldersUpdated.toString(bool)).booleanValue();
            return Boolean.valueOf(z);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i, int i2) {
            markViewHoldersUpdated.ag$a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.array;
            int i3 = this.start;
            return new BooleanArrayAsList(zArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof BooleanArrayAsList) {
                BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
                int size = size();
                if (booleanArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != booleanArrayAsList.array[booleanArrayAsList.start + i]) {
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
                i = (i * 31) + Booleans.ah$a(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.array[this.start] ? "[true" : "[false");
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(this.array[i] ? ", true" : ", false");
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        boolean[] toBooleanArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}

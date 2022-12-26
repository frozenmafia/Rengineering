package com.google.common.primitives;

import java.util.Comparator;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class UnsignedInts {
    public static long toString(int i) {
        return i & 4294967295L;
    }

    static int valueOf(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    public static int valueOf(int i, int i2) {
        return Ints.valueOf(valueOf(i), valueOf(i2));
    }

    /* loaded from: classes7.dex */
    enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                if (iArr[i] != iArr2[i]) {
                    return UnsignedInts.valueOf(iArr[i], iArr2[i]);
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    public static int toString(int i, int i2) {
        return (int) (toString(i) / toString(i2));
    }

    public static int values(int i, int i2) {
        return (int) (toString(i) % toString(i2));
    }

    public static int toString(String str, int i) {
        markViewHoldersUpdated.toString(str);
        long parseLong = Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69);
        sb.append("Input ");
        sb.append(str);
        sb.append(" in base ");
        sb.append(i);
        sb.append(" is not in the range of an unsigned integer");
        throw new NumberFormatException(sb.toString());
    }
}

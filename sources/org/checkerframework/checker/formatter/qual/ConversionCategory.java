package org.checkerframework.checker.formatter.qual;

import com.dreampay.commons.constants.Constants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import org.checkerframework.dataflow.qual.Pure;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum GENERAL uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class ConversionCategory {
    private static final /* synthetic */ ConversionCategory[] $VALUES;
    public static final ConversionCategory CHAR;
    public static final ConversionCategory CHAR_AND_INT;
    public static final ConversionCategory FLOAT;
    public static final ConversionCategory GENERAL;
    public static final ConversionCategory INT;
    public static final ConversionCategory INT_AND_TIME;
    public static final ConversionCategory NULL;
    public static final ConversionCategory TIME;
    public static final ConversionCategory UNUSED;
    public final String chars;
    public final Class<?>[] types;

    public static ConversionCategory valueOf(String str) {
        return (ConversionCategory) Enum.valueOf(ConversionCategory.class, str);
    }

    public static ConversionCategory[] values() {
        return (ConversionCategory[]) $VALUES.clone();
    }

    static {
        Class[] clsArr = null;
        ConversionCategory conversionCategory = new ConversionCategory("GENERAL", 0, "bBhHsS", clsArr);
        GENERAL = conversionCategory;
        ConversionCategory conversionCategory2 = new ConversionCategory("CHAR", 1, "cC", Character.class, Byte.class, Short.class, Integer.class);
        CHAR = conversionCategory2;
        ConversionCategory conversionCategory3 = new ConversionCategory("INT", 2, "doxX", Byte.class, Short.class, Integer.class, Long.class, BigInteger.class);
        INT = conversionCategory3;
        ConversionCategory conversionCategory4 = new ConversionCategory("FLOAT", 3, "eEfgGaA", Float.class, Double.class, BigDecimal.class);
        FLOAT = conversionCategory4;
        ConversionCategory conversionCategory5 = new ConversionCategory("TIME", 4, "tT", Long.class, Calendar.class, Date.class);
        TIME = conversionCategory5;
        ConversionCategory conversionCategory6 = new ConversionCategory("CHAR_AND_INT", 5, null, Byte.class, Short.class, Integer.class);
        CHAR_AND_INT = conversionCategory6;
        ConversionCategory conversionCategory7 = new ConversionCategory("INT_AND_TIME", 6, null, Long.class);
        INT_AND_TIME = conversionCategory7;
        ConversionCategory conversionCategory8 = new ConversionCategory("NULL", 7, null, new Class[0]);
        NULL = conversionCategory8;
        ConversionCategory conversionCategory9 = new ConversionCategory("UNUSED", 8, null, clsArr);
        UNUSED = conversionCategory9;
        $VALUES = new ConversionCategory[]{conversionCategory, conversionCategory2, conversionCategory3, conversionCategory4, conversionCategory5, conversionCategory6, conversionCategory7, conversionCategory8, conversionCategory9};
    }

    private ConversionCategory(String str, int i, String str2, Class... clsArr) {
        this.chars = str2;
        if (clsArr == null) {
            this.types = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(cls);
            Class<? extends Object> unwrapPrimitive = unwrapPrimitive(cls);
            if (unwrapPrimitive != null) {
                arrayList.add(unwrapPrimitive);
            }
        }
        this.types = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    private static Class<? extends Object> unwrapPrimitive(Class<?> cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        return null;
    }

    public static ConversionCategory fromConversionChar(char c) {
        ConversionCategory[] conversionCategoryArr = {GENERAL, CHAR, INT, FLOAT, TIME};
        for (int i = 0; i < 5; i++) {
            ConversionCategory conversionCategory = conversionCategoryArr[i];
            if (conversionCategory.chars.contains(String.valueOf(c))) {
                return conversionCategory;
            }
        }
        throw new IllegalArgumentException("Bad conversion character " + c);
    }

    private static <E> Set<E> arrayToSet(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static boolean isSubsetOf(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
        return intersect(conversionCategory, conversionCategory2) == conversionCategory;
    }

    public static ConversionCategory intersect(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
        ConversionCategory conversionCategory3 = UNUSED;
        if (conversionCategory == conversionCategory3) {
            return conversionCategory2;
        }
        if (conversionCategory2 == conversionCategory3) {
            return conversionCategory;
        }
        ConversionCategory conversionCategory4 = GENERAL;
        if (conversionCategory == conversionCategory4) {
            return conversionCategory2;
        }
        if (conversionCategory2 == conversionCategory4) {
            return conversionCategory;
        }
        Set arrayToSet = arrayToSet(conversionCategory.types);
        arrayToSet.retainAll(arrayToSet(conversionCategory2.types));
        ConversionCategory[] conversionCategoryArr = {CHAR, INT, FLOAT, TIME, CHAR_AND_INT, INT_AND_TIME, NULL};
        for (int i = 0; i < 7; i++) {
            ConversionCategory conversionCategory5 = conversionCategoryArr[i];
            if (arrayToSet(conversionCategory5.types).equals(arrayToSet)) {
                return conversionCategory5;
            }
        }
        throw new RuntimeException();
    }

    public static ConversionCategory union(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
        ConversionCategory conversionCategory3;
        ConversionCategory conversionCategory4 = UNUSED;
        if (conversionCategory == conversionCategory4 || conversionCategory2 == conversionCategory4 || conversionCategory == (conversionCategory4 = GENERAL) || conversionCategory2 == conversionCategory4) {
            return conversionCategory4;
        }
        ConversionCategory conversionCategory5 = CHAR_AND_INT;
        if ((conversionCategory == conversionCategory5 && conversionCategory2 == INT_AND_TIME) || (conversionCategory == (conversionCategory3 = INT_AND_TIME) && conversionCategory2 == conversionCategory5)) {
            return INT;
        }
        Set arrayToSet = arrayToSet(conversionCategory.types);
        arrayToSet.addAll(arrayToSet(conversionCategory2.types));
        ConversionCategory[] conversionCategoryArr = {NULL, conversionCategory5, conversionCategory3, CHAR, INT, FLOAT, TIME};
        for (int i = 0; i < 7; i++) {
            ConversionCategory conversionCategory6 = conversionCategoryArr[i];
            if (arrayToSet(conversionCategory6.types).equals(arrayToSet)) {
                return conversionCategory6;
            }
        }
        return GENERAL;
    }

    public boolean isAssignableFrom(Class<?> cls) {
        if (this.types == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : this.types) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    @Pure
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(" conversion category");
        Class<?>[] clsArr = this.types;
        if (clsArr == null || clsArr.length == 0) {
            return sb.toString();
        }
        StringJoiner stringJoiner = new StringJoiner(", ", "(one of: ", ")");
        for (Class<?> cls : this.types) {
            stringJoiner.add(cls.getSimpleName());
        }
        sb.append(Constants.WHITE_SPACE);
        sb.append(stringJoiner);
        return sb.toString();
    }
}

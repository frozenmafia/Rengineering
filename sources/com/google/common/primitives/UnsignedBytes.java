package com.google.common.primitives;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import sun.misc.Unsafe;
/* loaded from: classes7.dex */
public final class UnsignedBytes {
    public static int toString(byte b2) {
        return b2 & 255;
    }

    public static int valueOf(byte b2, byte b3) {
        return toString(b2) - toString(b3);
    }

    /* loaded from: classes7.dex */
    static class LexicographicalComparatorHolder {
        static final String toString = String.valueOf(LexicographicalComparatorHolder.class.getName()).concat("$UnsafeComparator");
        static final Comparator<byte[]> ah$a = valueOf();

        LexicographicalComparatorHolder() {
        }

        /* loaded from: classes7.dex */
        enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;
            
            static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final Unsafe theUnsafe;

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }

            static {
                Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int arrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || arrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe getUnsafe() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e) {
                        throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.3
                        @Override // java.security.PrivilegedExceptionAction
                        /* renamed from: valueOf */
                        public Unsafe run() throws Exception {
                            Field[] declaredFields;
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                int i = 0;
                while (i < (min & (-8))) {
                    Unsafe unsafe = theUnsafe;
                    long j = BYTE_ARRAY_BASE_OFFSET + i;
                    long j2 = unsafe.getLong(bArr, j);
                    long j3 = unsafe.getLong(bArr2, j);
                    if (j2 != j3) {
                        if (BIG_ENDIAN) {
                            return UnsignedLongs.valueOf(j2, j3);
                        }
                        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                        return ((int) ((j2 >>> numberOfTrailingZeros) & 255)) - ((int) ((j3 >>> numberOfTrailingZeros) & 255));
                    }
                    i += 8;
                }
                while (i < min) {
                    int valueOf = UnsignedBytes.valueOf(bArr[i], bArr2[i]);
                    if (valueOf != 0) {
                        return valueOf;
                    }
                    i++;
                }
                return bArr.length - bArr2.length;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes7.dex */
        public enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < min; i++) {
                    int valueOf = UnsignedBytes.valueOf(bArr[i], bArr2[i]);
                    if (valueOf != 0) {
                        return valueOf;
                    }
                }
                return bArr.length - bArr2.length;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static Comparator<byte[]> valueOf() {
            try {
                Object[] enumConstants = Class.forName(toString).getEnumConstants();
                enumConstants.getClass();
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return PureJavaComparator.INSTANCE;
            }
        }
    }
}

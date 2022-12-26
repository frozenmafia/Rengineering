package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes4.dex */
public final class btp {
    private static final ThreadLocal a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    private int f988b = 17;

    public btp() {
    }

    public btp(byte[] bArr) {
    }

    public static int a(Object obj, String... strArr) {
        btp btpVar = new btp(null);
        Class<?> cls = obj.getClass();
        f(obj, cls, btpVar, strArr);
        while (cls.getSuperclass() != null && cls != null) {
            cls = cls.getSuperclass();
            f(obj, cls, btpVar, strArr);
        }
        return btpVar.f988b;
    }

    static Set b() {
        return (Set) a.get();
    }

    private static void e(Object obj) {
        Set b2 = b();
        if (b2 != null) {
            b2.remove(new btr(obj));
            if (b2.isEmpty()) {
                a.remove();
            }
        }
    }

    private static void f(Object obj, Class cls, btp btpVar, String[] strArr) {
        Set b2 = b();
        if (b2 == null || !b2.contains(new btr(obj))) {
            try {
                Set b3 = b();
                if (b3 == null) {
                    b3 = new HashSet();
                    a.set(b3);
                }
                b3.add(new btr(obj));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (Field field : declaredFields) {
                    if (!bsk.Q(strArr, field.getName()) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(btq.class)) {
                        try {
                            btpVar.d(field.get(obj));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            } finally {
                e(obj);
            }
        }
    }

    public final void c(long j) {
        this.f988b = (this.f988b * 37) + ((int) (j ^ (j >> 32)));
    }

    public final void d(Object obj) {
        if (obj == null) {
            this.f988b *= 37;
        } else if (obj.getClass().isArray()) {
            int i = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length = jArr.length;
                while (i < length) {
                    c(jArr[i]);
                    i++;
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length2 = iArr.length;
                while (i < length2) {
                    this.f988b = (this.f988b * 37) + iArr[i];
                    i++;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length3 = sArr.length;
                while (i < length3) {
                    this.f988b = (this.f988b * 37) + sArr[i];
                    i++;
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int length4 = cArr.length;
                while (i < length4) {
                    this.f988b = (this.f988b * 37) + cArr[i];
                    i++;
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length5 = bArr.length;
                while (i < length5) {
                    this.f988b = (this.f988b * 37) + bArr[i];
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length6 = dArr.length;
                while (i < length6) {
                    c(Double.doubleToLongBits(dArr[i]));
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int length7 = fArr.length;
                while (i < length7) {
                    this.f988b = (this.f988b * 37) + Float.floatToIntBits(fArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length8 = zArr.length;
                while (i < length8) {
                    this.f988b = (this.f988b * 37) + (!zArr[i] ? 1 : 0);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length9 = objArr.length;
                while (i < length9) {
                    d(objArr[i]);
                    i++;
                }
            }
        } else {
            this.f988b = (this.f988b * 37) + obj.hashCode();
        }
    }

    public final int hashCode() {
        return this.f988b;
    }
}

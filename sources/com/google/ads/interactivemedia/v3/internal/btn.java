package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes4.dex */
public final class btn {
    private static final ThreadLocal a = new ThreadLocal();
    private final List c;

    /* renamed from: b  reason: collision with root package name */
    private boolean f987b = true;
    private String[] d = null;

    public btn() {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(String.class);
    }

    static Set a() {
        return (Set) a.get();
    }

    static btt b(Object obj, Object obj2) {
        return btt.c(new btr(obj), new btr(obj2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r1.isInstance(r4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r6.isInstance(r5) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.Object r4, java.lang.Object r5, java.lang.String... r6) {
        /*
            if (r4 != r5) goto L5
            r4 = 1
            goto L71
        L5:
            com.google.ads.interactivemedia.v3.internal.btn r0 = new com.google.ads.interactivemedia.v3.internal.btn
            r0.<init>()
            r0.d = r6
            boolean r6 = r0.f987b
            if (r6 != 0) goto L11
            goto L6f
        L11:
            if (r4 == r5) goto L6f
            java.lang.Class r6 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            boolean r2 = r6.isInstance(r5)
            if (r2 == 0) goto L28
            boolean r2 = r1.isInstance(r4)
            if (r2 != 0) goto L34
            goto L36
        L28:
            boolean r2 = r1.isInstance(r4)
            if (r2 == 0) goto L6c
            boolean r2 = r6.isInstance(r5)
            if (r2 != 0) goto L36
        L34:
            r2 = r6
            goto L37
        L36:
            r2 = r1
        L37:
            boolean r3 = r2.isArray()     // Catch: java.lang.IllegalArgumentException -> L6c
            if (r3 == 0) goto L41
            r0.f(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L6c
            goto L6f
        L41:
            java.util.List r3 = r0.c     // Catch: java.lang.IllegalArgumentException -> L6c
            boolean r6 = r3.contains(r6)     // Catch: java.lang.IllegalArgumentException -> L6c
            if (r6 != 0) goto L65
            java.util.List r6 = r0.c     // Catch: java.lang.IllegalArgumentException -> L6c
            boolean r6 = r6.contains(r1)     // Catch: java.lang.IllegalArgumentException -> L6c
            if (r6 == 0) goto L52
            goto L65
        L52:
            r0.h(r4, r5, r2)     // Catch: java.lang.IllegalArgumentException -> L6c
        L55:
            java.lang.Class r6 = r2.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6c
            if (r6 == 0) goto L6f
            if (r2 == 0) goto L6f
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6c
            r0.h(r4, r5, r2)     // Catch: java.lang.IllegalArgumentException -> L6c
            goto L55
        L65:
            boolean r4 = r4.equals(r5)     // Catch: java.lang.IllegalArgumentException -> L6c
            r0.f987b = r4     // Catch: java.lang.IllegalArgumentException -> L6c
            goto L6f
        L6c:
            r4 = 0
            r0.f987b = r4
        L6f:
            boolean r4 = r0.f987b
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.btn.c(java.lang.Object, java.lang.Object, java.lang.String[]):boolean");
    }

    private final void h(Object obj, Object obj2, Class cls) {
        Set a2 = a();
        btt b2 = b(obj, obj2);
        bts btsVar = (bts) b2;
        btt c = btt.c(btsVar.f990b, btsVar.a);
        if (a2 == null || !(a2.contains(b2) || a2.contains(c))) {
            try {
                Set a3 = a();
                if (a3 == null) {
                    a3 = new HashSet();
                    a.set(a3);
                }
                a3.add(b(obj, obj2));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (int i = 0; i < declaredFields.length && this.f987b; i++) {
                    Field field = declaredFields[i];
                    if (!bsk.Q(this.d, field.getName()) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(bto.class)) {
                        try {
                            f(field.get(obj), field.get(obj2));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            } finally {
                i(obj, obj2);
            }
        }
    }

    private static void i(Object obj, Object obj2) {
        Set a2 = a();
        if (a2 != null) {
            a2.remove(b(obj, obj2));
            if (a2.isEmpty()) {
                a.remove();
            }
        }
    }

    public final void d(int i, int i2) {
        if (this.f987b) {
            this.f987b = i == i2;
        }
    }

    public final void e(long j, long j2) {
        if (this.f987b) {
            this.f987b = j == j2;
        }
    }

    public final void f(Object obj, Object obj2) {
        if (this.f987b && obj != obj2) {
            if (obj == null || obj2 == null) {
                g();
            } else if (!obj.getClass().isArray()) {
                this.f987b = obj.equals(obj2);
            } else if (obj.getClass() != obj2.getClass()) {
                g();
            } else {
                int i = 0;
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    long[] jArr2 = (long[]) obj2;
                    if (this.f987b && jArr != jArr2) {
                        if (jArr.length != jArr2.length) {
                            g();
                            return;
                        }
                        while (i < jArr.length && this.f987b) {
                            e(jArr[i], jArr2[i]);
                            i++;
                        }
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int[] iArr2 = (int[]) obj2;
                    if (!this.f987b || iArr == iArr2) {
                        return;
                    }
                    if (iArr.length != iArr2.length) {
                        g();
                        return;
                    }
                    while (i < iArr.length && this.f987b) {
                        d(iArr[i], iArr2[i]);
                        i++;
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    short[] sArr2 = (short[]) obj2;
                    if (!this.f987b || sArr == sArr2) {
                        return;
                    }
                    if (sArr.length != sArr2.length) {
                        g();
                        return;
                    }
                    for (int i2 = 0; i2 < sArr.length && this.f987b; i2++) {
                        this.f987b = sArr[i2] == sArr2[i2];
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    char[] cArr2 = (char[]) obj2;
                    if (!this.f987b || cArr == cArr2) {
                        return;
                    }
                    if (cArr.length != cArr2.length) {
                        g();
                        return;
                    }
                    for (int i3 = 0; i3 < cArr.length && this.f987b; i3++) {
                        this.f987b = cArr[i3] == cArr2[i3];
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = (byte[]) obj2;
                    if (!this.f987b || bArr == bArr2) {
                        return;
                    }
                    if (bArr.length != bArr2.length) {
                        g();
                        return;
                    }
                    for (int i4 = 0; i4 < bArr.length && this.f987b; i4++) {
                        this.f987b = bArr[i4] == bArr2[i4];
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    double[] dArr2 = (double[]) obj2;
                    if (!this.f987b || dArr == dArr2) {
                        return;
                    }
                    if (dArr.length != dArr2.length) {
                        g();
                        return;
                    }
                    while (i < dArr.length && this.f987b) {
                        e(Double.doubleToLongBits(dArr[i]), Double.doubleToLongBits(dArr2[i]));
                        i++;
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    float[] fArr2 = (float[]) obj2;
                    if (!this.f987b || fArr == fArr2) {
                        return;
                    }
                    if (fArr.length != fArr2.length) {
                        g();
                        return;
                    }
                    while (i < fArr.length && this.f987b) {
                        d(Float.floatToIntBits(fArr[i]), Float.floatToIntBits(fArr2[i]));
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    boolean[] zArr2 = (boolean[]) obj2;
                    if (!this.f987b || zArr == zArr2) {
                        return;
                    }
                    if (zArr.length != zArr2.length) {
                        g();
                        return;
                    }
                    for (int i5 = 0; i5 < zArr.length && this.f987b; i5++) {
                        this.f987b = zArr[i5] == zArr2[i5];
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    Object[] objArr2 = (Object[]) obj2;
                    if (!this.f987b || objArr == objArr2) {
                        return;
                    }
                    if (objArr.length != objArr2.length) {
                        g();
                        return;
                    }
                    while (i < objArr.length && this.f987b) {
                        f(objArr[i], objArr2[i]);
                        i++;
                    }
                }
            }
        }
    }

    protected final void g() {
        this.f987b = false;
    }
}

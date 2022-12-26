package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class uh {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f1298b;
    private final bo c;

    public uh() {
        ug ugVar = ug.a;
        throw null;
    }

    public final Object b() {
        SparseArray sparseArray = this.f1298b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void c(int i, Object obj) {
        if (this.a == -1) {
            af.w(this.f1298b.size() == 0);
            this.a = 0;
        }
        if (this.f1298b.size() > 0) {
            SparseArray sparseArray = this.f1298b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            af.u(i >= keyAt);
            if (keyAt == i) {
                bo boVar = this.c;
                SparseArray sparseArray2 = this.f1298b;
                boVar.a(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f1298b.append(i, obj);
    }

    public final void d() {
        for (int i = 0; i < this.f1298b.size(); i++) {
            this.c.a(this.f1298b.valueAt(i));
        }
        this.a = -1;
        this.f1298b.clear();
    }

    public final void e(int i) {
        for (int size = this.f1298b.size() - 1; size >= 0 && i < this.f1298b.keyAt(size); size--) {
            this.c.a(this.f1298b.valueAt(size));
            this.f1298b.removeAt(size);
        }
        this.a = this.f1298b.size() > 0 ? Math.min(this.a, this.f1298b.size() - 1) : -1;
    }

    public final void f(int i) {
        int i2 = 0;
        while (i2 < this.f1298b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f1298b.keyAt(i3)) {
                return;
            }
            this.c.a(this.f1298b.valueAt(i2));
            this.f1298b.removeAt(i2);
            int i4 = this.a;
            if (i4 > 0) {
                this.a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final boolean g() {
        return this.f1298b.size() == 0;
    }

    public uh(bo boVar) {
        this.f1298b = new SparseArray();
        this.c = boVar;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x0009 -> B:7:0x000b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r4) {
        /*
            r3 = this;
            int r0 = r3.a
            r1 = -1
            if (r0 == r1) goto L7
            r1 = r3
            goto Lb
        L7:
            r0 = 0
            r1 = r3
        L9:
            r1.a = r0
        Lb:
            int r0 = r1.a
            if (r0 > 0) goto L10
            goto L1d
        L10:
            android.util.SparseArray r2 = r1.f1298b
            int r0 = r2.keyAt(r0)
            if (r4 >= r0) goto L1d
            int r0 = r1.a
            int r0 = r0 + (-1)
            goto L9
        L1d:
            int r0 = r1.a
            android.util.SparseArray r2 = r1.f1298b
            int r2 = r2.size()
            int r2 = r2 + (-1)
            if (r0 >= r2) goto L3c
            android.util.SparseArray r0 = r1.f1298b
            int r2 = r1.a
            int r2 = r2 + 1
            int r0 = r0.keyAt(r2)
            if (r4 < r0) goto L3c
            int r0 = r1.a
            int r0 = r0 + 1
            r1.a = r0
            goto L1d
        L3c:
            android.util.SparseArray r4 = r1.f1298b
            int r0 = r1.a
            java.lang.Object r4 = r4.valueAt(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.uh.a(int):java.lang.Object");
    }
}

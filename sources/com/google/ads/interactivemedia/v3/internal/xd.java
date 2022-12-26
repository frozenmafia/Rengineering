package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes4.dex */
public final class xd {
    private static final Comparator a = xb.f1338b;

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator f1340b = xb.a;
    private int g;
    private int h;
    private int i;
    private final int c = 2000;
    private final xc[] e = new xc[5];
    private final ArrayList d = new ArrayList();
    private int f = -1;

    public xd(int i) {
    }

    public final void a(int i, float f) {
        xc xcVar;
        if (this.f != 1) {
            Collections.sort(this.d, a);
            this.f = 1;
        }
        int i2 = this.i;
        if (i2 > 0) {
            xc[] xcVarArr = this.e;
            int i3 = i2 - 1;
            this.i = i3;
            xcVar = xcVarArr[i3];
        } else {
            xcVar = new xc(null);
        }
        int i4 = this.g;
        this.g = i4 + 1;
        xcVar.a = i4;
        xcVar.f1339b = i;
        xcVar.c = f;
        this.d.add(xcVar);
        this.h += i;
        while (true) {
            int i5 = this.h;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            xc xcVar2 = (xc) this.d.get(0);
            int i7 = xcVar2.f1339b;
            if (i7 <= i6) {
                this.h -= i7;
                this.d.remove(0);
                int i8 = this.i;
                if (i8 < 5) {
                    xc[] xcVarArr2 = this.e;
                    this.i = i8 + 1;
                    xcVarArr2[i8] = xcVar2;
                }
            } else {
                xcVar2.f1339b = i7 - i6;
                this.h -= i6;
            }
        }
    }

    public final void b() {
        this.d.clear();
        this.f = -1;
        this.g = 0;
        this.h = 0;
    }

    public final float c() {
        ArrayList arrayList;
        if (this.f != 0) {
            Collections.sort(this.d, f1340b);
            this.f = 0;
        }
        float f = this.h;
        int i = 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            xc xcVar = (xc) this.d.get(i2);
            i += xcVar.f1339b;
            if (i >= 0.5f * f) {
                return xcVar.c;
            }
        }
        if (this.d.isEmpty()) {
            return Float.NaN;
        }
        return ((xc) this.d.get(arrayList.size() - 1)).c;
    }
}

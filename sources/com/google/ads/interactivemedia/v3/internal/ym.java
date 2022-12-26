package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final class ym {
    public final List a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1364b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    private ym(List list, int i, int i2, int i3, float f, String str) {
        this.a = list;
        this.f1364b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static ym a(ci ciVar) throws as {
        String str;
        int i;
        int i2;
        float f;
        try {
            ciVar.G(4);
            int i3 = (ciVar.i() & 3) + 1;
            if (i3 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int i4 = ciVar.i() & 31;
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(b(ciVar));
            }
            int i6 = ciVar.i();
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList.add(b(ciVar));
            }
            if (i4 > 0) {
                zq c = zr.c((byte[]) arrayList.get(0), i3, ((byte[]) arrayList.get(0)).length);
                int i8 = c.e;
                int i9 = c.f;
                float f2 = c.g;
                str = bn.a(c.a, c.f1384b, c.c);
                i = i8;
                i2 = i9;
                f = f2;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new ym(arrayList, i3, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw as.a("Error parsing AVC config", e);
        }
    }

    private static byte[] b(ci ciVar) {
        int m = ciVar.m();
        int c = ciVar.c();
        ciVar.G(m);
        return bn.c(ciVar.H(), c, m);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
public final class zj {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1377b;

    public zj(bf bfVar, int... iArr) {
        this(bfVar, iArr, null);
    }

    public zj(byte[] bArr, String str) {
        this.f1377b = bArr;
        this.a = str;
    }

    public zj(int[] iArr, ua[] uaVarArr) {
        this.a = iArr;
        this.f1377b = uaVarArr;
    }

    public final void a(long j) {
        for (ua uaVar : (ua[]) this.f1377b) {
            uaVar.D(j);
        }
    }

    public final int[] b() {
        int[] iArr = new int[((ua[]) this.f1377b).length];
        int i = 0;
        while (true) {
            ua[] uaVarArr = (ua[]) this.f1377b;
            if (i >= uaVarArr.length) {
                return iArr;
            }
            iArr[i] = uaVarArr[i].m();
            i++;
        }
    }

    public final zz c(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.a;
            if (i2 < iArr.length) {
                if (i == iArr[i2]) {
                    return ((ua[]) this.f1377b)[i2];
                }
                i2++;
            } else {
                cc.b("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new zb();
            }
        }
    }

    public final String d() {
        return (String) this.a;
    }

    public final byte[] e() {
        return (byte[]) this.f1377b;
    }

    public zj(bf bfVar, int[] iArr, byte[] bArr) {
        if (iArr.length == 0) {
            cc.c("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f1377b = bfVar;
        this.a = iArr;
    }

    public zj(yy yyVar) {
        this.f1377b = yyVar;
        this.a = new AtomicBoolean(false);
    }
}

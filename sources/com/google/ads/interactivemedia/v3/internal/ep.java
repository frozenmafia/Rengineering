package com.google.ads.interactivemedia.v3.internal;

import androidx.databinding.library.baseAdapters.BR;
/* loaded from: classes4.dex */
public final class ep {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final s f1033b;
    public final s c;
    public final int d;
    public final int e;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ep(java.lang.String r2, com.google.ads.interactivemedia.v3.internal.s r3, com.google.ads.interactivemedia.v3.internal.s r4, int r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r5 == 0) goto L9
            if (r6 != 0) goto La
            r6 = 0
        L9:
            r0 = 1
        La:
            com.google.ads.interactivemedia.v3.internal.af.u(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L24
            r1.a = r2
            com.google.ads.interactivemedia.v3.internal.af.s(r3)
            r1.f1033b = r3
            com.google.ads.interactivemedia.v3.internal.af.s(r4)
            r1.c = r4
            r1.d = r5
            r1.e = r6
            return
        L24:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ep.<init>(java.lang.String, com.google.ads.interactivemedia.v3.internal.s, com.google.ads.interactivemedia.v3.internal.s, int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ep epVar = (ep) obj;
        return this.d == epVar.d && this.e == epVar.e && this.a.equals(epVar.a) && this.f1033b.equals(epVar.f1033b) && this.c.equals(epVar.c);
    }

    public final int hashCode() {
        int i = this.d;
        int i2 = this.e;
        int hashCode = this.a.hashCode();
        return ((((((((i + BR.userTeamVM) * 31) + i2) * 31) + hashCode) * 31) + this.f1033b.hashCode()) * 31) + this.c.hashCode();
    }
}

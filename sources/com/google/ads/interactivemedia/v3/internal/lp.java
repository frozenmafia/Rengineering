package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class lp {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1158b;
    public final int c;
    public final int d;

    public lp(String str, String str2, int i, int i2) {
        this.a = str;
        this.f1158b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lp) {
            lp lpVar = (lp) obj;
            return this.c == lpVar.c && this.d == lpVar.d && atc.o(this.a, lpVar.a) && atc.o(this.f1158b, lpVar.f1158b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f1158b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}

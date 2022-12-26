package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class bj {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    private final bf f848b;
    private final boolean c;
    private final int[] d;
    private final boolean[] e;

    public bj(bf bfVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = bfVar.a;
        this.a = i;
        boolean z2 = false;
        af.u(i == iArr.length && i == zArr.length);
        this.f848b = bfVar;
        if (z && i > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f848b.c;
    }

    public final s b(int i) {
        return this.f848b.b(i);
    }

    public final boolean c() {
        for (boolean z : this.e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i) {
        return this.e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bj bjVar = (bj) obj;
        return this.c == bjVar.c && this.f848b.equals(bjVar.f848b) && Arrays.equals(this.d, bjVar.d) && Arrays.equals(this.e, bjVar.e);
    }

    public final int hashCode() {
        int hashCode = this.f848b.hashCode();
        boolean z = this.c;
        return (((((hashCode * 31) + (z ? 1 : 0)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }
}

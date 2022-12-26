package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class zy {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f1390b;
    public final int c;
    public final int d;

    public zy(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.f1390b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zy zyVar = (zy) obj;
        return this.a == zyVar.a && this.c == zyVar.c && this.d == zyVar.d && Arrays.equals(this.f1390b, zyVar.f1390b);
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.f1390b)) * 31) + this.c) * 31) + this.d;
    }
}

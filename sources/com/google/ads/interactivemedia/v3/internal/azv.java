package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class azv {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f779b;
    private final int c;
    private final int d;
    private final int e;
    private final aza f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public azv(Object obj, byte[] bArr, int i, int i2, int i3, aza azaVar, byte[] bArr2) {
        this.a = obj;
        this.f779b = Arrays.copyOf(bArr, bArr.length);
        this.d = i;
        this.e = i2;
        this.c = i3;
        this.f = azaVar;
    }

    public final int a() {
        return this.c;
    }

    public final Object b() {
        return this.a;
    }

    public final byte[] c() {
        byte[] bArr = this.f779b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final aza f() {
        return this.f;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class yu implements zw {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f1369b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public yu(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f1369b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
            return;
        }
        int i = length - 1;
        this.f = jArr2[i] + jArr3[i];
    }

    public final int a(long j) {
        return cp.aq(this.e, j, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final long e() {
        return this.f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final zu g(long j) {
        int a = a(j);
        zx zxVar = new zx(this.e[a], this.c[a]);
        if (zxVar.f1389b >= j || a == this.a - 1) {
            return new zu(zxVar, zxVar);
        }
        int i = a + 1;
        return new zu(zxVar, new zx(this.e[i], this.c[i]));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final boolean h() {
        return true;
    }

    public final String toString() {
        int i = this.a;
        String arrays = Arrays.toString(this.f1369b);
        String arrays2 = Arrays.toString(this.c);
        String arrays3 = Arrays.toString(this.e);
        String arrays4 = Arrays.toString(this.d);
        return "ChunkIndex(length=" + i + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }
}

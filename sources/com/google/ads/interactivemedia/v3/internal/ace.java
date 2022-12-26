package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.util.MimeTypes;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ace implements acc {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final int f458b;
    private final ci c;

    public ace(aby abyVar, s sVar) {
        ci ciVar = abyVar.a;
        this.c = ciVar;
        ciVar.F(12);
        int l = ciVar.l();
        if (MimeTypes.AUDIO_RAW.equals(sVar.l)) {
            int l2 = cp.l(sVar.A, sVar.y);
            if (l == 0 || l % l2 != 0) {
                cc.e("AtomParsers", "Audio sample size mismatch. stsd sample size: " + l2 + ", stsz sample size: " + l);
                l = l2;
            }
        }
        this.a = l == 0 ? -1 : l;
        this.f458b = ciVar.l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acc
    public final int a() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acc
    public final int b() {
        return this.f458b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acc
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.l() : i;
    }
}

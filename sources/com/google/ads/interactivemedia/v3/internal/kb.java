package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class kb implements jr {
    final /* synthetic */ ke a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ kb(ke keVar) {
        this.a = keVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jr
    public final void a(long j) {
        cc.e("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jr
    public final void b(long j) {
        jl jlVar;
        jl jlVar2;
        jh jhVar;
        ke keVar = this.a;
        jlVar = keVar.r;
        if (jlVar != null) {
            jlVar2 = keVar.r;
            jhVar = ((ki) jlVar2).a.c;
            jhVar.r(j);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jr
    public final void c(long j, long j2, long j3, long j4) {
        long H;
        long I;
        H = this.a.H();
        I = this.a.I();
        cc.e("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + H + ", " + I);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jr
    public final void d(long j, long j2, long j3, long j4) {
        long H;
        long I;
        H = this.a.H();
        I = this.a.I();
        cc.e("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + H + ", " + I);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jr
    public final void e(int i, long j) {
        jl jlVar;
        long j2;
        jl jlVar2;
        jh jhVar;
        jlVar = this.a.r;
        if (jlVar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ke keVar = this.a;
            j2 = keVar.Z;
            jlVar2 = keVar.r;
            jhVar = ((ki) jlVar2).a.c;
            jhVar.t(i, j, elapsedRealtime - j2);
        }
    }
}

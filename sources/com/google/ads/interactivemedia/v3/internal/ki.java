package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ki implements jl {
    final /* synthetic */ kj a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ki(kj kjVar) {
        this.a = kjVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jl
    public final void a(Exception exc) {
        cc.c("MediaCodecAudioRenderer", "Audio sink error", exc);
        kj.U(this.a).b(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jl
    public final void b() {
        kj kjVar = this.a;
        if (kj.T(kjVar) != null) {
            kj.T(kjVar).b();
        }
    }
}

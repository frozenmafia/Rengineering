package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
/* loaded from: classes4.dex */
final class ea {
    private final MediaCodec.CryptoInfo a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f1022b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(ea eaVar, int i, int i2) {
        eaVar.f1022b.set(i, i2);
        eaVar.a.setPattern(eaVar.f1022b);
    }
}

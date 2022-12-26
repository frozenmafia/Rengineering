package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class rq implements ro {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private MediaCodecInfo[] f1251b;

    public rq(boolean z, boolean z2) {
        this.a = (z || z2) ? 1 : 0;
    }

    private final void f() {
        if (this.f1251b == null) {
            this.f1251b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ro
    public final int a() {
        f();
        return this.f1251b.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ro
    public final MediaCodecInfo b(int i) {
        f();
        return this.f1251b[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ro
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ro
    public final boolean d() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ro
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}

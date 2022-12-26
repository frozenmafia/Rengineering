package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
/* loaded from: classes4.dex */
public final class qz {
    public final rd a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaFormat f1240b;
    public final s c;
    public final Surface d;
    public final MediaCrypto e;

    private qz(rd rdVar, MediaFormat mediaFormat, s sVar, Surface surface, MediaCrypto mediaCrypto) {
        this.a = rdVar;
        this.f1240b = mediaFormat;
        this.c = sVar;
        this.d = surface;
        this.e = mediaCrypto;
    }

    public static qz a(rd rdVar, MediaFormat mediaFormat, s sVar, MediaCrypto mediaCrypto) {
        return new qz(rdVar, mediaFormat, sVar, null, mediaCrypto);
    }

    public static qz b(rd rdVar, MediaFormat mediaFormat, s sVar, Surface surface, MediaCrypto mediaCrypto) {
        return new qz(rdVar, mediaFormat, sVar, surface, mediaCrypto);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.android.exoplayer2.util.MimeTypes;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class rp implements ro {
    private rp() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ rp(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ro
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ro
    public final MediaCodecInfo b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ro
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ro
    public final boolean d() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ro
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}

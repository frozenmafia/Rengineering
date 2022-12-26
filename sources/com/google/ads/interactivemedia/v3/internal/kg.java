package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
/* loaded from: classes4.dex */
public final class kg implements jw {

    /* renamed from: b  reason: collision with root package name */
    protected final int f1133b = 250000;
    protected final int c = 750000;
    protected final int d = 4;
    protected final int e = 250000;
    protected final int f = 50000000;
    public final int g = 2;

    /* JADX INFO: Access modifiers changed from: protected */
    public kg(kf kfVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(int i, int i2, int i3) {
        return axl.a(((i * i2) * i3) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int b(int i) {
        switch (i) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
            case 18:
                return Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
            case 15:
                return 8000;
            case 16:
                return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
            case 17:
                return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
        }
    }
}

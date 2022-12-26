package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
/* loaded from: classes4.dex */
public final class yh {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1359b = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static yg a(byte[] bArr) throws as {
        return b(new ch(bArr), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        if (r11 != 3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.ads.interactivemedia.v3.internal.yg b(com.google.ads.interactivemedia.v3.internal.ch r11, boolean r12) throws com.google.ads.interactivemedia.v3.internal.as {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.yh.b(com.google.ads.interactivemedia.v3.internal.ch, boolean):com.google.ads.interactivemedia.v3.internal.yg");
    }

    private static int c(ch chVar) {
        int c2 = chVar.c(5);
        return c2 == 31 ? chVar.c(6) + 32 : c2;
    }

    private static int d(ch chVar) throws as {
        int c2 = chVar.c(4);
        if (c2 == 15) {
            return chVar.c(24);
        }
        if (c2 < 13) {
            return f1359b[c2];
        }
        throw as.a(null, null);
    }
}

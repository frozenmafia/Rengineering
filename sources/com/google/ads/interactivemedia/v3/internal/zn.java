package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
/* loaded from: classes4.dex */
public final class zn {
    private static final String[] a = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1381b = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] c = {32000, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] d = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] e = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] f = {32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] g = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    public static int c(int i) {
        int i2;
        int i3;
        int i4;
        if (!m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || ((i >>> 10) & 3) == 3) {
            return -1;
        }
        return l(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? 384 : 1152 : i == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f1381b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i4 - 1] : d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? e[i4 - 1] : f[i4 - 1];
        } else {
            i6 = g[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i7) + i8;
    }
}

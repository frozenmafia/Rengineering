package com.google.ads.interactivemedia.v3.internal;

import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class za {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1374b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] c = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] d = {64, 112, 128, 192, 224, 256, 384, BR.sortType, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static s a(byte[] bArr, String str, String str2) {
        ch chVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            chVar = new ch(bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b3 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b3;
                }
            }
            chVar = new ch(copyOf);
            if (copyOf[0] == 31) {
                ch chVar2 = new ch(copyOf);
                while (chVar2.a() >= 16) {
                    chVar2.i(2);
                    chVar.l(chVar2.c(14));
                }
            }
            chVar.e(copyOf);
        }
        chVar.i(60);
        int i3 = f1374b[chVar.c(6)];
        int i4 = c[chVar.c(4)];
        int c2 = chVar.c(5);
        int i5 = c2 < 29 ? (d[c2] * 1000) / 2 : -1;
        chVar.i(10);
        int i6 = chVar.c(2) > 0 ? 1 : 0;
        r rVar = new r();
        rVar.S(str);
        rVar.ae(MimeTypes.AUDIO_DTS);
        rVar.G(i5);
        rVar.H(i3 + i6);
        rVar.af(i4);
        rVar.M(null);
        rVar.V(str2);
        return rVar.v();
    }
}

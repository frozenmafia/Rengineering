package o;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.logging.type.LogSeverity;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public final class SubscriptionManagerCompat {
    private static final String[] HaptikSDK$b = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] HaptikSDK$c = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] ag$a = {32000, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] ah$a = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] valueOf = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] toString = {32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] values = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean valueOf(int i) {
        return (i & (-2097152)) == -2097152;
    }

    /* loaded from: classes3.dex */
    public final class Api29Impl {
        private static final int[] ah$a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, LogSeverity.EMERGENCY_VALUE, LogSeverity.EMERGENCY_VALUE, androidx.databinding.library.baseAdapters.BR.teamCombination, 400, 400, 2048};

        /* loaded from: classes3.dex */
        public static final class values {
            public final int ag$a;
            public final int ah$a;
            public final int toString;
            public final int valueOf;
            public final int values;

            private values(int i, int i2, int i3, int i4, int i5) {
                this.ag$a = i;
                this.toString = i2;
                this.valueOf = i3;
                this.ah$a = i4;
                this.values = i5;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
            if (r10 != 11) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
            if (r10 != 11) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
            if (r10 != 8) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static o.SubscriptionManagerCompat.Api29Impl.values ah$a(o.getAzimuthDegrees r10) {
            /*
                r0 = 16
                int r1 = r10.valueOf(r0)
                int r0 = r10.valueOf(r0)
                r2 = 4
                r3 = 65535(0xffff, float:9.1834E-41)
                if (r0 != r3) goto L18
                r0 = 24
                int r0 = r10.valueOf(r0)
                r3 = 7
                goto L19
            L18:
                r3 = 4
            L19:
                int r0 = r0 + r3
                r3 = 44097(0xac41, float:6.1793E-41)
                if (r1 != r3) goto L21
                int r0 = r0 + 2
            L21:
                r7 = r0
                r0 = 2
                int r1 = r10.valueOf(r0)
                r3 = 3
                if (r1 != r3) goto L2f
                int r4 = ag$a(r10, r0)
                int r1 = r1 + r4
            L2f:
                r4 = r1
                r1 = 10
                int r1 = r10.valueOf(r1)
                boolean r5 = r10.HaptikSDK$a()
                if (r5 == 0) goto L45
                int r5 = r10.valueOf(r3)
                if (r5 <= 0) goto L45
                r10.toString(r0)
            L45:
                boolean r5 = r10.HaptikSDK$a()
                r6 = 48000(0xbb80, float:6.7262E-41)
                r8 = 44100(0xac44, float:6.1797E-41)
                if (r5 == 0) goto L55
                r9 = 48000(0xbb80, float:6.7262E-41)
                goto L58
            L55:
                r9 = 44100(0xac44, float:6.1797E-41)
            L58:
                int r10 = r10.valueOf(r2)
                if (r9 != r8) goto L68
                r5 = 13
                if (r10 != r5) goto L68
                int[] r0 = o.SubscriptionManagerCompat.Api29Impl.ah$a
                r10 = r0[r10]
                r8 = r10
                goto L97
            L68:
                if (r9 != r6) goto L95
                int[] r5 = o.SubscriptionManagerCompat.Api29Impl.ah$a
                int r6 = r5.length
                if (r10 >= r6) goto L95
                r5 = r5[r10]
                int r1 = r1 % 5
                r6 = 1
                r8 = 8
                if (r1 == r6) goto L8d
                r6 = 11
                if (r1 == r0) goto L88
                if (r1 == r3) goto L8d
                if (r1 == r2) goto L81
                goto L93
            L81:
                if (r10 == r3) goto L91
                if (r10 == r8) goto L91
                if (r10 != r6) goto L93
                goto L91
            L88:
                if (r10 == r8) goto L91
                if (r10 != r6) goto L93
                goto L91
            L8d:
                if (r10 == r3) goto L91
                if (r10 != r8) goto L93
            L91:
                int r5 = r5 + 1
            L93:
                r8 = r5
                goto L97
            L95:
                r10 = 0
                r8 = 0
            L97:
                o.SubscriptionManagerCompat$Api29Impl$values r10 = new o.SubscriptionManagerCompat$Api29Impl$values
                r5 = 2
                r0 = 0
                r3 = r10
                r6 = r9
                r9 = r0
                r3.<init>(r4, r5, r6, r7, r8)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SubscriptionManagerCompat.Api29Impl.ah$a(o.getAzimuthDegrees):o.SubscriptionManagerCompat$Api29Impl$values");
        }

        public static int toString(byte[] bArr, int i) {
            int i2 = 7;
            if (bArr.length < 7) {
                return -1;
            }
            int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            if (i3 == 65535) {
                i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
            } else {
                i2 = 4;
            }
            if (i == 44097) {
                i2 += 2;
            }
            return i3 + i2;
        }

        public static int ag$a(ByteBuffer byteBuffer) {
            byte[] bArr = new byte[16];
            int position = byteBuffer.position();
            byteBuffer.get(bArr);
            byteBuffer.position(position);
            return ah$a(new getAzimuthDegrees(bArr)).values;
        }

        public static void values(int i, C$default$setContentDescription c$default$setContentDescription) {
            c$default$setContentDescription.valueOf(7);
            byte[] ah$a2 = c$default$setContentDescription.ah$a();
            ah$a2[0] = -84;
            ah$a2[1] = 64;
            ah$a2[2] = -1;
            ah$a2[3] = -1;
            ah$a2[4] = (byte) ((i >> 16) & 255);
            ah$a2[5] = (byte) ((i >> 8) & 255);
            ah$a2[6] = (byte) (i & 255);
        }

        private static int ag$a(getAzimuthDegrees getazimuthdegrees, int i) {
            int i2 = 0;
            while (true) {
                int valueOf = i2 + getazimuthdegrees.valueOf(i);
                if (!getazimuthdegrees.HaptikSDK$a()) {
                    return valueOf;
                }
                i2 = (valueOf + 1) << i;
            }
        }
    }

    public static int ag$a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!valueOf(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = HaptikSDK$c[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? ag$a[i4 - 1] : ah$a[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? valueOf[i4 - 1] : toString[i4 - 1];
        } else {
            i6 = values[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i7) + i8;
    }

    public static int values(int i) {
        int i2;
        int i3;
        int i4;
        if (!valueOf(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || ((i >>> 10) & 3) == 3) {
            return -1;
        }
        return toString(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toString(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        } else if (i2 != 2) {
            if (i2 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }
}

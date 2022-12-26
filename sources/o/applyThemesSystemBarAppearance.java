package o;

import com.appsamurai.storyly.exoplayer2.common.drm.DrmInitData;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes3.dex */
public final class applyThemesSystemBarAppearance {
    private static final int[] values = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] ah$a = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] ag$a = {64, 112, 128, 192, 224, 256, 384, androidx.databinding.library.baseAdapters.BR.sortType, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static boolean toString(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* renamed from: o.applyThemesSystemBarAppearance$default  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class Cdefault {
        public static int toString(byte[] bArr) {
            return bArr[9] & 255;
        }

        public static List<byte[]> valueOf(byte[] bArr) {
            long values = values(ah$a(bArr));
            long values2 = values(3840L);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArr);
            arrayList.add(ag$a(values));
            arrayList.add(ag$a(values2));
            return arrayList;
        }

        private static int ah$a(byte[] bArr) {
            return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
        }

        private static byte[] ag$a(long j) {
            return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
        }

        private static long values(long j) {
            return (j * C.NANOS_PER_SECOND) / 48000;
        }
    }

    public static createFromIcon toString(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        getAzimuthDegrees ag$a2 = ag$a(bArr);
        ag$a2.toString(60);
        int i = values[ag$a2.valueOf(6)];
        int i2 = ah$a[ag$a2.valueOf(4)];
        int valueOf = ag$a2.valueOf(5);
        int[] iArr = ag$a;
        int i3 = valueOf >= iArr.length ? -1 : (iArr[valueOf] * 1000) / 2;
        ag$a2.toString(10);
        return new createFromIcon$ag$a().ah$a(str).invoke(MimeTypes.AUDIO_DTS).ah$a(i3).values(i + (ag$a2.valueOf(2) > 0 ? 1 : 0)).getInitSettings(i2).ah$a(drmInitData).ag$a(str2).valueOf();
    }

    public static int valueOf(byte[] bArr) {
        int i;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 == 31) {
                i = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            } else {
                i = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static int ah$a(ByteBuffer byteBuffer) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int position = byteBuffer.position();
        byte b4 = byteBuffer.get(position);
        if (b4 != -2) {
            if (b4 == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                b3 = byteBuffer.get(position + 7);
            } else if (b4 == 31) {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                b3 = byteBuffer.get(position + 6);
            } else {
                i = (byteBuffer.get(position + 4) & 1) << 6;
                b2 = byteBuffer.get(position + 5);
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        b2 = byteBuffer.get(position + 4);
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int values(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = 1
            r3 = 6
            r4 = 7
            r5 = 4
            r6 = -2
            if (r1 == r6) goto L4a
            r6 = -1
            if (r1 == r6) goto L32
            r6 = 31
            if (r1 == r6) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r3 = r7[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r5
            r1 = r1 | r3
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r5
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r5
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r2
            r0 = 1
            goto L5d
        L4a:
            r1 = r7[r5]
            r1 = r1 & 3
            int r1 = r1 << 12
            r4 = r7[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r5
            r1 = r1 | r4
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r5
            r7 = r7 | r1
            int r7 = r7 + r2
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.applyThemesSystemBarAppearance.values(byte[]):int");
    }

    private static getAzimuthDegrees ag$a(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new getAzimuthDegrees(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (ah$a(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b2 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b2;
            }
        }
        getAzimuthDegrees getazimuthdegrees = new getAzimuthDegrees(copyOf);
        if (copyOf[0] == 31) {
            getAzimuthDegrees getazimuthdegrees2 = new getAzimuthDegrees(copyOf);
            while (getazimuthdegrees2.ah$a() >= 16) {
                getazimuthdegrees2.toString(2);
                getazimuthdegrees.toString(getazimuthdegrees2.valueOf(14), 14);
            }
        }
        getazimuthdegrees.values(copyOf);
        return getazimuthdegrees;
    }

    private static boolean ah$a(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}

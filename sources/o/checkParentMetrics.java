package o;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
/* loaded from: classes5.dex */
public final class checkParentMetrics {
    public static final int valueOf(int i) {
        return ((i & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) << 8) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & 255) << 24);
    }

    public static final short valueOf(short s) {
        int i = s & 65535;
        return (short) (((i & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8) | ((i & 255) << 8));
    }

    public static final void valueOf(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final boolean values(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        runAnimators.ag$a(bArr, "a");
        runAnimators.ag$a(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final String toString(byte b2) {
        return new String(new char[]{setExtensionCallback.values()[(b2 >> 4) & 15], setExtensionCallback.values()[b2 & 15]});
    }

    public static final String ag$a(int i) {
        if (i == 0) {
            return SessionDescription.SUPPORTED_SDP_VERSION;
        }
        int i2 = 0;
        char[] cArr = {setExtensionCallback.values()[(i >> 28) & 15], setExtensionCallback.values()[(i >> 24) & 15], setExtensionCallback.values()[(i >> 20) & 15], setExtensionCallback.values()[(i >> 16) & 15], setExtensionCallback.values()[(i >> 12) & 15], setExtensionCallback.values()[(i >> 8) & 15], setExtensionCallback.values()[(i >> 4) & 15], setExtensionCallback.values()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }
}

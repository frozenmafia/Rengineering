package o;

import com.google.android.exoplayer2.C;
import o.dirTypeForward;
/* loaded from: classes3.dex */
public final class SpannedStringKt {
    public final byte[] ag$a;
    public final dirTypeForward.toString ah$a;
    public final boolean toString;
    public final int valueOf;
    public final String values;

    public SpannedStringKt(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        FingerprintManagerCompat.toString((bArr2 == null) ^ (i == 0));
        this.toString = z;
        this.values = str;
        this.valueOf = i;
        this.ag$a = bArr2;
        this.ah$a = new dirTypeForward.toString(toString(str), bArr, i2, i3);
    }

    private static int toString(String str) {
        if (str == null) {
            return 1;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C.CENC_TYPE_cbc1)) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(C.CENC_TYPE_cbcs)) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(C.CENC_TYPE_cenc)) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(C.CENC_TYPE_cens)) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return 2;
        }
        if (c != 2 && c != 3) {
            SupportMenuItem.toString("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
        }
        return 1;
    }
}

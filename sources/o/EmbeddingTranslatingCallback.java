package o;

import o.Visibility;
import okio.ByteString;
import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public final class EmbeddingTranslatingCallback {
    private static final String[] valueOf;
    public static final EmbeddingTranslatingCallback ag$a = new EmbeddingTranslatingCallback();
    public static final ByteString ah$a = ByteString.Companion.ag$a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] toString = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] values = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            runAnimators.ah$a(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = Visibility.Mode.ah$a(C$r8$lambda$yScxR8XDNmwEhhX_T4Oe1hescc.values("%8s", binaryString), (char) TokenParser.SP, '0', false, 4, (Object) null);
        }
        valueOf = strArr;
        String[] strArr2 = values;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = values;
            strArr3[i3 | 8] = runAnimators.values(strArr3[i3], (Object) "|PADDED");
        }
        String[] strArr4 = values;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = values;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                strArr5[i8 | 8] = strArr5[i7] + "|" + strArr5[i5] + "|PADDED";
            }
        }
        int length = values.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = values;
            if (strArr6[i9] == null) {
                strArr6[i9] = valueOf[i9];
            }
        }
    }

    private EmbeddingTranslatingCallback() {
    }

    public final String ah$a(boolean z, int i, int i2, int i3, int i4) {
        return C$r8$lambda$yScxR8XDNmwEhhX_T4Oe1hescc.values("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), ag$a(i3), values(i3, i4));
    }

    public final String ag$a(int i) {
        String[] strArr = toString;
        return i < strArr.length ? strArr[i] : C$r8$lambda$yScxR8XDNmwEhhX_T4Oe1hescc.values("0x%02x", Integer.valueOf(i));
    }

    public final String values(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : valueOf[i2];
            } else if (i != 7 && i != 8) {
                String[] strArr = values;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    runAnimators.toString((Object) str);
                } else {
                    str = valueOf[i2];
                }
                String str2 = str;
                if (i != 5 || (i2 & 4) == 0) {
                    return (i != 0 || (i2 & 32) == 0) ? str2 : Visibility.Mode.toString(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
                }
                return Visibility.Mode.toString(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
            }
        }
        return valueOf[i2];
    }
}

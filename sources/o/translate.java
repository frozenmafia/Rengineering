package o;

import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
/* loaded from: classes5.dex */
public final class translate {

    /* loaded from: classes5.dex */
    public final class window_release {
        private int[] toString;
        private byte[] valueOf;

        public static void ah$a(window_release window_releaseVar, byte[] bArr, int[] iArr) {
            window_releaseVar.valueOf = bArr;
            window_releaseVar.toString = iArr;
        }

        public static void values(window_release window_releaseVar, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                int[] iArr = window_releaseVar.toString;
                byte[] bArr = window_releaseVar.valueOf;
                int i3 = i2 * 4;
                iArr[i2] = ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
            }
        }
    }

    public static final String values(Cookie cookie, boolean z) {
        runAnimators.ag$a(cookie, "cookie");
        return cookie.toString$okhttp(z);
    }

    public static final String[] values(ConnectionSpec connectionSpec, String[] strArr) {
        runAnimators.ag$a(connectionSpec, "$this$effectiveCipherSuites");
        runAnimators.ag$a(strArr, "socketEnabledCipherSuites");
        return connectionSpec.getCipherSuitesAsString$okhttp() != null ? C$r8$lambda$yScxR8XDNmwEhhX_T4Oe1hescc.values(strArr, connectionSpec.getCipherSuitesAsString$okhttp(), CipherSuite.Companion.getORDER_BY_NAME$okhttp()) : strArr;
    }
}

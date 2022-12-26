package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
/* loaded from: classes4.dex */
public final class bdw {
    public static Integer a() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }

    public static final bie b() {
        byte[] bArr = new byte[49];
        for (int i = 0; i < 49; i++) {
            char charAt = "type.googleapis.com/google.crypto.tink.AesCmacKey".charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new bea("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return bie.a(bArr);
    }
}

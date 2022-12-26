package com.google.ads.interactivemedia.v3.impl.data;

import android.util.Base64;
/* loaded from: classes4.dex */
public final /* synthetic */ class ai {
    public static String a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    public static byte[] b(String str, boolean z) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, true != z ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(String.valueOf(str)));
    }
}

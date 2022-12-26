package com.sendbird.android.shadow.okhttp3;

import com.sendbird.android.shadow.okhttp3.internal.Util;
import com.sendbird.android.shadow.okio.ByteString;
import java.nio.charset.Charset;
/* loaded from: classes7.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Util.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        String base64 = ByteString.encodeString(str + ":" + str2, charset).base64();
        return "Basic " + base64;
    }
}

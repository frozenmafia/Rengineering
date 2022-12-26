package org.apache.commons.codec.digest;

import androidx.core.view.ViewCompat;
import java.util.Random;
/* loaded from: classes8.dex */
class B64 {
    static final String B64T = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    B64() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b64from24bit(byte b2, byte b3, byte b4, int i, StringBuilder sb) {
        int i2 = ((b2 << 16) & ViewCompat.MEASURED_SIZE_MASK) | ((b3 << 8) & 65535) | (b4 & 255);
        while (i > 0) {
            sb.append(B64T.charAt(i2 & 63));
            i2 >>= 6;
            i--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getRandomSalt(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 1; i2 <= i; i2++) {
            sb.append(B64T.charAt(new Random().nextInt(64)));
        }
        return sb.toString();
    }
}

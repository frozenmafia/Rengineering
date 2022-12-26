package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;
/* loaded from: classes8.dex */
class Utils {
    private static final int RADIX = 16;

    Utils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int digit16(byte b2) throws DecoderException {
        int digit = Character.digit((char) b2, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException("Invalid URL encoding: not a valid digit (radix 16): " + ((int) b2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char hexDigit(int i) {
        return Character.toUpperCase(Character.forDigit(i & 15, 16));
    }
}

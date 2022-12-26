package com.google.crypto.tink.shaded.protobuf;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
/* loaded from: classes7.dex */
class Utf8$ag$a {
    private static int HaptikSDK$a(byte b2) {
        return b2 & 63;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean HaptikSDK$b(byte b2) {
        return b2 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean HaptikSDK$c(byte b2) {
        return b2 < -16;
    }

    private static char ah$a(int i) {
        return (char) ((i & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + 56320);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean toString(byte b2) {
        return b2 >= 0;
    }

    private static char values(int i) {
        return (char) ((i >>> 10) + 55232);
    }

    private static boolean values(byte b2) {
        return b2 > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toString(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ag$a(byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (b2 < -62 || values(b3)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | HaptikSDK$a(b3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toString(byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (values(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || values(b4)))) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i] = (char) (((b2 & 15) << 12) | (HaptikSDK$a(b3) << 6) | HaptikSDK$a(b4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void values(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (values(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || values(b4) || values(b5)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        int HaptikSDK$a = ((b2 & 7) << 18) | (HaptikSDK$a(b3) << 12) | (HaptikSDK$a(b4) << 6) | HaptikSDK$a(b5);
        cArr[i] = values(HaptikSDK$a);
        cArr[i + 1] = ah$a(HaptikSDK$a);
    }
}

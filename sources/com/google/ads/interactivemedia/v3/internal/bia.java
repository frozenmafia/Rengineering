package com.google.ads.interactivemedia.v3.internal;

import java.security.SecureRandom;
/* loaded from: classes4.dex */
public final class bia {
    private static final ThreadLocal a = new bhz();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] b(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}

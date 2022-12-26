package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public final class bby {
    public static final String a;

    static {
        new bbx();
        a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        int i = bgz.a;
        try {
            bab.l(new bca());
            if (bbu.b()) {
                return;
            }
            bab.o(new bbx());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}

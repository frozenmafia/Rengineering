package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* loaded from: classes4.dex */
final class bbj extends ThreadLocal {
    protected static final Cipher a() {
        try {
            return (Cipher) bhq.a.a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return a();
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public final class baa {
    public static om a(String str) throws GeneralSecurityException {
        om omVar = (om) bab.j().get(str);
        if (omVar != null) {
            return omVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}

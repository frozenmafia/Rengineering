package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes4.dex */
public final class azr {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static azq a(String str) throws GeneralSecurityException {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            azq azqVar = (azq) it.next();
            if (azqVar.a()) {
                return azqVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}

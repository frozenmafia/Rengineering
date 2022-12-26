package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes4.dex */
public final class bbu {
    private static final Logger a = Logger.getLogger(bbu.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f792b = new AtomicBoolean(false);

    private bbu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return false;
        }
    }

    public static boolean b() {
        return f792b.get();
    }
}

package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes4.dex */
public final class bhq {
    public static final bhq a;

    /* renamed from: b  reason: collision with root package name */
    public static final bhq f838b;
    public static final bhq c;
    public static final bhq d;
    public static final bhq e;
    private static final Logger f = Logger.getLogger(bhq.class.getName());
    private static final List g;
    private static final boolean h;
    private final bhs i;

    static {
        if (bbu.b()) {
            g = b(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt");
            h = false;
        } else if (bic.d()) {
            g = b(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
            h = true;
        } else {
            g = new ArrayList();
            h = true;
        }
        a = new bhq(new bhr(1));
        f838b = new bhq(new bhr(4));
        c = new bhq(new bhr(0));
        d = new bhq(new bhr(3));
        e = new bhq(new bhr(2));
    }

    public bhq(bhs bhsVar) {
        this.i = bhsVar;
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : g) {
            try {
                return this.i.a(str, provider);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (h) {
            return this.i.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}

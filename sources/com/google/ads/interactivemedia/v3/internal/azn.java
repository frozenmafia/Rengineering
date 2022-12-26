package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class azn {
    private static final Logger a = Logger.getLogger(azn.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f775b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public azn() {
        this.f775b = new ConcurrentHashMap();
    }

    private static azm g(bdl bdlVar) {
        return new azk(bdlVar, 0);
    }

    private final azm h(String str) throws GeneralSecurityException {
        azm azmVar;
        synchronized (this) {
            if (!this.f775b.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
            }
            azmVar = (azm) this.f775b.get(str);
        }
        return azmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        r6.f775b.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(com.google.ads.interactivemedia.v3.internal.azm r7, boolean r8) throws java.security.GeneralSecurityException {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.ads.interactivemedia.v3.internal.azh r0 = r7.b()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.f()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.ConcurrentMap r1 = r6.f775b     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.ads.interactivemedia.v3.internal.azm r1 = (com.google.ads.interactivemedia.v3.internal.azm) r1     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L5b
            java.lang.Class r2 = r1.c()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r3 = r7.c()     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L22
            goto L5b
        L22:
            java.util.logging.Logger r8 = com.google.ads.interactivemedia.v3.internal.azn.a     // Catch: java.lang.Throwable -> L6b
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r3 = r3.concat(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "com.google.crypto.tink.KeyManagerRegistry"
            java.lang.String r5 = "registerKeyManagerContainer"
            r8.logp(r2, r4, r5, r3)     // Catch: java.lang.Throwable -> L6b
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L6b
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r0 = r1.c()     // Catch: java.lang.Throwable -> L6b
            r1 = 1
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r1] = r0     // Catch: java.lang.Throwable -> L6b
            r0 = 2
            java.lang.Class r7 = r7.c()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r7     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r7 = java.lang.String.format(r7, r2)     // Catch: java.lang.Throwable -> L6b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L6b
            throw r8     // Catch: java.lang.Throwable -> L6b
        L5b:
            if (r8 != 0) goto L64
            java.util.concurrent.ConcurrentMap r8 = r6.f775b     // Catch: java.lang.Throwable -> L6b
            r8.putIfAbsent(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L64:
            java.util.concurrent.ConcurrentMap r8 = r6.f775b     // Catch: java.lang.Throwable -> L6b
            r8.put(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L6b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.azn.i(com.google.ads.interactivemedia.v3.internal.azm, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final azh a(String str, Class cls) throws GeneralSecurityException {
        azm h = h(str);
        if (h.e().contains(cls)) {
            return h.a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(h.c());
        Set<Class> e = h.e();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : e) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final azh b(String str) throws GeneralSecurityException {
        return h(str).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(bdu bduVar, bdl bdlVar) throws GeneralSecurityException {
        Class d;
        synchronized (this) {
            int e = bduVar.e();
            int e2 = bdlVar.e();
            if (!bbt.a(e)) {
                String valueOf = String.valueOf(bduVar.getClass());
                throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
            } else if (bbt.a(e2)) {
                String c = bduVar.c();
                String c2 = bdlVar.c();
                if (this.f775b.containsKey(c) && ((azm) this.f775b.get(c)).d() != null && (d = ((azm) this.f775b.get(c)).d()) != null && !d.getName().equals(bdlVar.getClass().getName())) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + c + " with inconsistent public key type " + c2);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", bduVar.getClass().getName(), d.getName(), bdlVar.getClass().getName()));
                }
                i(new azl(bduVar, bdlVar), true);
                i(g(bdlVar), false);
            } else {
                String valueOf2 = String.valueOf(bdlVar.getClass());
                throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(azh azhVar) throws GeneralSecurityException {
        synchronized (this) {
            if (bbt.a(bbt.a)) {
                i(new azk(azhVar, 1), false);
            } else {
                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(bdl bdlVar) throws GeneralSecurityException {
        synchronized (this) {
            if (!bbt.a(bdlVar.e())) {
                String valueOf = String.valueOf(bdlVar.getClass());
                throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
            }
            i(g(bdlVar), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(String str) {
        return this.f775b.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public azn(azn aznVar) {
        this.f775b = new ConcurrentHashMap(aznVar.f775b);
    }
}

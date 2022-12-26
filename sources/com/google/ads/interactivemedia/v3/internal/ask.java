package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* loaded from: classes4.dex */
public final class ask {
    private static final HashMap a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f700b;
    private final asl c;
    private final arh d;
    private final aqy e;
    private asc f;
    private final Object g = new Object();

    public ask(Context context, asl aslVar, arh arhVar, aqy aqyVar) {
        this.f700b = context;
        this.c = aslVar;
        this.d = arhVar;
        this.e = aqyVar;
    }

    private static long d(long j) {
        return System.currentTimeMillis() - j;
    }

    private final Class e(asd asdVar) throws asj {
        synchronized (this) {
            String k = asdVar.a().k();
            HashMap hashMap = a;
            Class cls = (Class) hashMap.get(k);
            if (cls != null) {
                return cls;
            }
            try {
                if (this.e.a(asdVar.c())) {
                    try {
                        File b2 = asdVar.b();
                        if (!b2.exists()) {
                            b2.mkdirs();
                        }
                        Class loadClass = new DexClassLoader(asdVar.c().getAbsolutePath(), b2.getAbsolutePath(), null, this.f700b.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                        hashMap.put(k, loadClass);
                        return loadClass;
                    } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                        throw new asj(2008, e);
                    }
                }
                throw new asj(2026, "VM did not pass signature verification");
            } catch (GeneralSecurityException e2) {
                throw new asj(2026, e2);
            }
        }
    }

    public final ark a() {
        asc ascVar;
        synchronized (this.g) {
            ascVar = this.f;
        }
        return ascVar;
    }

    public final asd b() {
        synchronized (this.g) {
            asc ascVar = this.f;
            if (ascVar != null) {
                return ascVar.f();
            }
            return null;
        }
    }

    public final boolean c(asd asdVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                asc ascVar = new asc(e(asdVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f700b, "msa-r", asdVar.e(), null, new Bundle(), 2), asdVar, this.c, this.d);
                if (!ascVar.h()) {
                    throw new asj(4000, "init failed");
                }
                int e = ascVar.e();
                if (e == 0) {
                    synchronized (this.g) {
                        asc ascVar2 = this.f;
                        if (ascVar2 != null) {
                            try {
                                ascVar2.g();
                            } catch (asj e2) {
                                this.d.c(e2.a(), -1L, e2);
                            }
                        }
                        this.f = ascVar;
                    }
                    this.d.d(3000, d(currentTimeMillis));
                    return true;
                }
                throw new asj(4001, "ci: " + e);
            } catch (Exception e3) {
                throw new asj(2004, e3);
            }
        } catch (asj e4) {
            this.d.c(e4.a(), d(currentTimeMillis), e4);
            return false;
        } catch (Exception e5) {
            this.d.c(4010, d(currentTimeMillis), e5);
            return false;
        }
    }
}

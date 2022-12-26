package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes4.dex */
public abstract class bdl {
    private final Class a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f806b;
    private final Class c;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public bdl(Class cls, bdt... bdtVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            bdt bdtVar = bdtVarArr[i];
            if (!hashMap.containsKey(bdtVar.b())) {
                hashMap.put(bdtVar.b(), bdtVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(bdtVar.b().getCanonicalName())));
            }
        }
        this.c = bdtVarArr[0].b();
        this.f806b = Collections.unmodifiableMap(hashMap);
    }

    public bdk a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract bqq b(bnz bnzVar) throws bpt;

    public abstract String c();

    public abstract void d(bqq bqqVar) throws GeneralSecurityException;

    public int e() {
        return bbt.a;
    }

    public abstract int f();

    public final Class i() {
        return this.c;
    }

    public final Class j() {
        return this.a;
    }

    public final Object k(bqq bqqVar, Class cls) throws GeneralSecurityException {
        bdt bdtVar = (bdt) this.f806b.get(cls);
        if (bdtVar == null) {
            String canonicalName = cls.getCanonicalName();
            throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
        }
        return bdtVar.a(bqqVar);
    }

    public final Set l() {
        return this.f806b.keySet();
    }
}

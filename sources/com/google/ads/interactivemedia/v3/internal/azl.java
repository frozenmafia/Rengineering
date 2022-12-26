package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class azl implements azm {
    final /* synthetic */ bdu a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ bdl f774b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public azl(bdu bduVar, bdl bdlVar) {
        this.a = bduVar;
        this.f774b = bdlVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final azh a(Class cls) throws GeneralSecurityException {
        try {
            return new azj(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final azh b() {
        bdu bduVar = this.a;
        return new azj(bduVar, bduVar.i());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final Class c() {
        return this.a.getClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final Class d() {
        return this.f774b.getClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final Set e() {
        return this.a.l();
    }
}

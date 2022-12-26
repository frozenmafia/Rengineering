package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class azk implements azm {
    final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f773b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public azk(azh azhVar, int i) {
        this.f773b = i;
        this.a = azhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public azk(bdl bdlVar, int i) {
        this.f773b = i;
        this.a = bdlVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.ads.interactivemedia.v3.internal.azh, java.lang.Object] */
    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final azh b() {
        if (this.f773b != 0) {
            return this.a;
        }
        bdl bdlVar = (bdl) this.a;
        return new azj(bdlVar, bdlVar.i());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final Class c() {
        return this.a.getClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final Class d() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.ads.interactivemedia.v3.internal.azh, java.lang.Object] */
    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final Set e() {
        return this.f773b != 0 ? Collections.singleton(this.a.c()) : ((bdl) this.a).l();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.ads.interactivemedia.v3.internal.azh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.ads.interactivemedia.v3.internal.azh, java.lang.Object] */
    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final azh a(Class cls) throws GeneralSecurityException {
        if (this.f773b != 0) {
            if (this.a.c().equals(cls)) {
                return this.a;
            }
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        try {
            return new azj((bdl) this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }
}

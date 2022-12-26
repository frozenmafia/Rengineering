package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class la implements wy {
    final /* synthetic */ ld a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public la(ld ldVar) {
        this.a = ldVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void a() throws IOException {
        wx wxVar;
        IOException iOException;
        IOException iOException2;
        wxVar = this.a.n;
        wxVar.a();
        ld ldVar = this.a;
        iOException = ldVar.p;
        if (iOException == null) {
            return;
        }
        iOException2 = ldVar.p;
        throw iOException2;
    }
}

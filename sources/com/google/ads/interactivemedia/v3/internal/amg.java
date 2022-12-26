package com.google.ads.interactivemedia.v3.internal;

import java.io.File;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
final class amg implements ash {
    final /* synthetic */ aqy a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public amg(aqy aqyVar) {
        this.a = aqyVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ash
    public final boolean a(File file) {
        try {
            return this.a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}

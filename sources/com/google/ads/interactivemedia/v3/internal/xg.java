package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class xg implements wt {
    private xg() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ xg(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wt
    public final void e() throws IOException {
        synchronized (xh.c()) {
            synchronized (xh.d()) {
                if (xh.g()) {
                    return;
                }
                long a = xh.a();
                synchronized (xh.d()) {
                    xh.e(a);
                    xh.i();
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wt
    public final void r() {
    }
}

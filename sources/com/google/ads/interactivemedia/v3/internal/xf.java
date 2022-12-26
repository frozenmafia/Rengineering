package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ConcurrentModificationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class xf implements wr {
    private final xe a;

    public xf(xe xeVar) {
        this.a = xeVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wr
    public final void bh(wt wtVar, long j, long j2) {
        if (!xh.h()) {
            this.a.a(new IOException(new ConcurrentModificationException()));
        } else {
            this.a.b();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wr
    public final wq bi(wt wtVar, long j, long j2, IOException iOException, int i) {
        this.a.a(iOException);
        return wx.f1335b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wr
    public final void bl(wt wtVar, long j, long j2, boolean z) {
    }
}

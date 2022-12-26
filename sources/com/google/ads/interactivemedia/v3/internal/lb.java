package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class lb implements wr {
    final /* synthetic */ ld a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f1146b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ lb(ld ldVar, int i) {
        this.f1146b = i;
        this.a = ldVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wr
    public final /* synthetic */ void bh(wt wtVar, long j, long j2) {
        if (this.f1146b == 0) {
            this.a.m((xa) wtVar, j, j2);
            return;
        }
        this.a.l((xa) wtVar, j, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wr
    public final /* synthetic */ wq bi(wt wtVar, long j, long j2, IOException iOException, int i) {
        if (this.f1146b == 0) {
            return this.a.s((xa) wtVar, j, j2, iOException);
        }
        return this.a.r((xa) wtVar, j, j2, iOException, i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wr
    public final /* synthetic */ void bl(wt wtVar, long j, long j2, boolean z) {
        if (this.f1146b == 0) {
            this.a.k((xa) wtVar, j, j2);
            return;
        }
        this.a.k((xa) wtVar, j, j2);
    }
}

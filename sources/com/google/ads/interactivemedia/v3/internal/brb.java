package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;
/* loaded from: classes4.dex */
final class brb extends bns {
    final brd a;

    /* renamed from: b  reason: collision with root package name */
    bnv f954b = b();
    final /* synthetic */ bre c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public brb(bre breVar) {
        this.c = breVar;
        this.a = new brd(breVar);
    }

    private final bnv b() {
        brd brdVar = this.a;
        if (brdVar.hasNext()) {
            return brdVar.next().iterator();
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnv
    public final byte a() {
        bnv bnvVar = this.f954b;
        if (bnvVar == null) {
            throw new NoSuchElementException();
        }
        byte a = bnvVar.a();
        if (!this.f954b.hasNext()) {
            this.f954b = b();
        }
        return a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f954b != null;
    }
}

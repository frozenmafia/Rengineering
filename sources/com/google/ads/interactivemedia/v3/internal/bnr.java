package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bnr extends bns {
    final /* synthetic */ bnz a;

    /* renamed from: b  reason: collision with root package name */
    private int f906b = 0;
    private final int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bnr(bnz bnzVar) {
        this.a = bnzVar;
        this.c = bnzVar.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnv
    public final byte a() {
        int i = this.f906b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.f906b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f906b < this.c;
    }
}

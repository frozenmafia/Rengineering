package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;
/* loaded from: classes4.dex */
public abstract class ul implements vb {

    /* renamed from: b  reason: collision with root package name */
    private final long f1301b;
    private final long c;
    private long d;

    public ul(long j, long j2) {
        this.f1301b = j;
        this.c = j2;
        this.d = j - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        long j = this.d;
        if (j < this.f1301b || j > this.c) {
            throw new NoSuchElementException();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vb
    public final boolean e() {
        long j = this.d + 1;
        this.d = j;
        return j <= this.c;
    }
}

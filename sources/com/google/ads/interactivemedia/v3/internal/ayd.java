package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public final class ayd extends ayc implements ScheduledFuture, ayq {
    private final ayq a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledFuture f765b;

    protected ayd(ayq ayqVar) {
        super(null);
        this.a = ayqVar;
    }

    public ayd(ayq ayqVar, ScheduledFuture scheduledFuture) {
        this(ayqVar);
        this.f765b = scheduledFuture;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayc, com.google.ads.interactivemedia.v3.internal.aui
    protected final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayc
    protected final ayq b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.ayc
    public final /* synthetic */ Future c() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayc, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = c().cancel(z);
        if (cancel) {
            this.f765b.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f765b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f765b.getDelay(timeUnit);
    }
}

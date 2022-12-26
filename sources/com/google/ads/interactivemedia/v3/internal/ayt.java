package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ayt extends axp implements ScheduledExecutorService, ayr {
    final ScheduledExecutorService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ayt(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        atc.k(scheduledExecutorService);
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ayx q = ayx.q(runnable, null);
        return new ayd(q, this.a.schedule(q, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ays aysVar = new ays(runnable);
        return new ayd(aysVar, this.a.scheduleAtFixedRate(aysVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ays aysVar = new ays(runnable);
        return new ayd(aysVar, this.a.scheduleWithFixedDelay(aysVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ayx p = ayx.p(callable);
        return new ayd(p, this.a.schedule(p, j, timeUnit));
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes4.dex */
final class anj implements ThreadFactory {
    private final ThreadFactory a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f652b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        int andIncrement = this.f652b.getAndIncrement();
        newThread.setName("gads-" + andIncrement);
        return newThread;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public final class ahq {
    private final BlockingQueue a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f563b;
    private final ArrayDeque c = new ArrayDeque();
    private ahp d = null;

    public ahq() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.f563b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        ahp ahpVar = (ahp) this.c.poll();
        this.d = ahpVar;
        if (ahpVar != null) {
            ahpVar.executeOnExecutor(this.f563b, new Object[0]);
        }
    }

    public final void a(ahp ahpVar) {
        ahpVar.b(this);
        this.c.add(ahpVar);
        if (this.d == null) {
            c();
        }
    }

    public final void b() {
        this.d = null;
        c();
    }
}

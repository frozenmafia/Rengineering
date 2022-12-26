package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes4.dex */
public final class bdp {
    private static final bdp a = new bdp();

    /* renamed from: b  reason: collision with root package name */
    private static final bdo f807b = new bdo(null);
    private final AtomicReference c = new AtomicReference();

    public static bdp a() {
        return a;
    }

    public final beu b() {
        beu beuVar = (beu) this.c.get();
        return beuVar == null ? f807b : beuVar;
    }
}

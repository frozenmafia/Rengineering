package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes4.dex */
public final class aqi {
    private static final AtomicReference a = new AtomicReference();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference f676b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqg a() {
        return (aqg) a.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqh b() {
        return (aqh) f676b.get();
    }

    public static void c(aqg aqgVar) {
        a.set(aqgVar);
    }
}

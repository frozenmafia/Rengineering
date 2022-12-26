package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes4.dex */
public final class ayg {
    private final Object a;

    public ayg() {
        this.a = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ayg(avb avbVar) {
        this.a = avbVar;
    }

    public final ayq a(Callable callable, Executor executor) {
        return new axz((auv) this.a, executor, callable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final AtomicReference b(String str) {
        synchronized (this) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.a.get(str);
    }
}

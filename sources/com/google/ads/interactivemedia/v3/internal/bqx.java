package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bqx {
    private static final bqx a = new bqx();
    private final ConcurrentMap c = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final brg f951b = new bqj();

    private bqx() {
    }

    public static bqx a() {
        return a;
    }

    public final brf b(Class cls) {
        bpr.j(cls, "messageType");
        brf brfVar = (brf) this.c.get(cls);
        if (brfVar == null) {
            brfVar = this.f951b.a(cls);
            bpr.j(cls, "messageType");
            bpr.j(brfVar, "schema");
            brf brfVar2 = (brf) this.c.putIfAbsent(cls, brfVar);
            if (brfVar2 != null) {
                return brfVar2;
            }
        }
        return brfVar;
    }

    public final brf c(Object obj) {
        return b(obj.getClass());
    }
}

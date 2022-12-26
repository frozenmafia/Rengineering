package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* loaded from: classes4.dex */
final class sm {
    private final Map a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f1270b;
    private cw c;

    public sm() {
        new HashSet();
        this.f1270b = new HashMap();
    }

    public final void a(cw cwVar) {
        if (cwVar != this.c) {
            this.c = cwVar;
            this.a.clear();
            this.f1270b.clear();
        }
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class gx implements gt {
    public final sw a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Object f1073b = new Object();

    public gx(tc tcVar, boolean z) {
        this.a = new sw(tcVar, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gt
    public final be a() {
        return this.a.j();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gt
    public final Object b() {
        return this.f1073b;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}

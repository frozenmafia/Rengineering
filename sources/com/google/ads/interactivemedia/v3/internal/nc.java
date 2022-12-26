package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class nc implements mo {
    private final Set a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private mu f1182b;

    @Override // com.google.ads.interactivemedia.v3.internal.mo
    public final void a() {
        this.f1182b = null;
        avb m = avb.m(this.a);
        this.a.clear();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            ((mu) m.get(i)).j();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mo
    public final void b(Exception exc, boolean z) {
        this.f1182b = null;
        avb m = avb.m(this.a);
        this.a.clear();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            ((mu) m.get(i)).k(exc, z);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mo
    public final void c(mu muVar) {
        this.a.add(muVar);
        if (this.f1182b != null) {
            return;
        }
        this.f1182b = muVar;
        muVar.l();
    }

    public final void d(mu muVar) {
        this.a.remove(muVar);
        if (this.f1182b == muVar) {
            this.f1182b = null;
            if (this.a.isEmpty()) {
                return;
            }
            mu muVar2 = (mu) this.a.iterator().next();
            this.f1182b = muVar2;
            muVar2.l();
        }
    }
}

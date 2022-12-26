package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes4.dex */
public final /* synthetic */ class bv implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f991b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bv(nj njVar, nk nkVar, int i, int i2) {
        this.d = i2;
        this.c = njVar;
        this.f991b = nkVar;
        this.a = i;
    }

    public /* synthetic */ bv(CopyOnWriteArraySet copyOnWriteArraySet, int i, bw bwVar, int i2) {
        this.d = i2;
        this.f991b = copyOnWriteArraySet;
        this.a = i;
        this.c = bwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.ads.interactivemedia.v3.internal.nk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.google.ads.interactivemedia.v3.internal.bw] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            Object obj = this.f991b;
            int i = this.a;
            ?? r2 = this.c;
            Iterator it = ((CopyOnWriteArraySet) obj).iterator();
            while (it.hasNext()) {
                ((by) it.next()).a(i, r2);
            }
            return;
        }
        Object obj2 = this.c;
        ?? r1 = this.f991b;
        int i2 = this.a;
        r1.ap();
        nj njVar = (nj) obj2;
        r1.am(njVar.a, njVar.f1185b, i2);
    }
}

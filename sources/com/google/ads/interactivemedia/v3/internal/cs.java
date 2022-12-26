package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class cs implements cx {
    private final boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f1004b = new ArrayList(1);
    private int c;
    private db d;

    /* JADX INFO: Access modifiers changed from: protected */
    public cs(boolean z) {
        this.a = z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public /* synthetic */ Map e() {
        return Collections.emptyMap();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void f(dv dvVar) {
        af.s(dvVar);
        if (this.f1004b.contains(dvVar)) {
            return;
        }
        this.f1004b.add(dvVar);
        this.c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(int i) {
        db dbVar = this.d;
        int i2 = cp.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((dv) this.f1004b.get(i3)).a(dbVar, this.a, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        db dbVar = this.d;
        int i = cp.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((dv) this.f1004b.get(i2)).b(dbVar, this.a);
        }
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(db dbVar) {
        for (int i = 0; i < this.c; i++) {
            ((dv) this.f1004b.get(i)).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(db dbVar) {
        this.d = dbVar;
        for (int i = 0; i < this.c; i++) {
            ((dv) this.f1004b.get(i)).d(dbVar, this.a);
        }
    }
}

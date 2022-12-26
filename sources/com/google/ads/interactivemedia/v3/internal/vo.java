package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
/* loaded from: classes4.dex */
public final class vo extends bh {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1318b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final SparseArray g;
    private final SparseBooleanArray h;

    @Deprecated
    public vo() {
        this.g = new SparseArray();
        this.h = new SparseBooleanArray();
        C();
    }

    private final void C() {
        this.a = true;
        this.f1318b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bh
    public final /* synthetic */ void q(Context context) {
        super.q(context);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bh
    public final /* bridge */ /* synthetic */ bh r(int i, int i2) {
        super.r(i, i2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bh
    public final /* bridge */ /* synthetic */ void s(Context context) {
        super.s(context);
    }

    public final vp v() {
        return new vp(this);
    }

    public vo(Context context) {
        q(context);
        s(context);
        this.g = new SparseArray();
        this.h = new SparseBooleanArray();
        C();
    }
}

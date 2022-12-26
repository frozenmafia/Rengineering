package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseBooleanArray;
/* loaded from: classes4.dex */
public final class p {
    private final SparseBooleanArray a = new SparseBooleanArray();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1208b;

    public final q a() {
        af.w(!this.f1208b);
        this.f1208b = true;
        return new q(this.a);
    }

    public final void b(int i) {
        af.w(!this.f1208b);
        this.a.append(i, true);
    }
}

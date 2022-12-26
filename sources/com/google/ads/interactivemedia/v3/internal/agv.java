package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
/* loaded from: classes4.dex */
public final class agv {
    private static final agv a = new agv();

    /* renamed from: b  reason: collision with root package name */
    private Context f551b;

    private agv() {
    }

    public static agv b() {
        return a;
    }

    public final Context a() {
        return this.f551b;
    }

    public final void c(Context context) {
        this.f551b = context != null ? context.getApplicationContext() : null;
    }
}

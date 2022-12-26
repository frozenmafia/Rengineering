package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes4.dex */
public final class ss {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicLong f1273b = new AtomicLong();

    public ss() {
    }

    public ss(db dbVar) {
        Uri uri = dbVar.a;
        Collections.emptyMap();
    }

    public static long a() {
        return f1273b.getAndIncrement();
    }
}

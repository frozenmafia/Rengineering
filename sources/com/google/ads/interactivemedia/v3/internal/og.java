package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes4.dex */
public final class og extends IOException {
    public final db a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f1193b;
    public final Map c;
    public final long d;

    public og(db dbVar, Uri uri, Map map, long j, Throwable th) {
        super(th);
        this.a = dbVar;
        this.f1193b = uri;
        this.c = map;
        this.d = j;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes4.dex */
public final class da {
    private Uri a;

    /* renamed from: b  reason: collision with root package name */
    private int f1008b;
    private byte[] c;
    private Map d;
    private long e;
    private long f;
    private String g;
    private int h;

    public da() {
        this.f1008b = 1;
        this.d = Collections.emptyMap();
        this.f = -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ da(db dbVar) {
        this.a = dbVar.a;
        this.f1008b = dbVar.f1009b;
        this.c = dbVar.c;
        this.d = dbVar.d;
        this.e = dbVar.e;
        this.f = dbVar.f;
        this.g = dbVar.g;
        this.h = dbVar.h;
    }

    public final void b(int i) {
        this.h = i;
    }

    public final void c(byte[] bArr) {
        this.c = bArr;
    }

    public final void d() {
        this.f1008b = 2;
    }

    public final void e(Map map) {
        this.d = map;
    }

    public final void f(String str) {
        this.g = str;
    }

    public final void g(long j) {
        this.f = j;
    }

    public final void h(long j) {
        this.e = j;
    }

    public final void i(Uri uri) {
        this.a = uri;
    }

    public final void j(String str) {
        this.a = Uri.parse(str);
    }

    public final db a() {
        if (this.a != null) {
            return new db(this.a, this.f1008b, this.c, this.d, this.e, this.f, this.g, this.h, null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}

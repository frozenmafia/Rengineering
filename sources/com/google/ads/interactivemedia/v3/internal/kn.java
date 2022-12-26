package com.google.ads.interactivemedia.v3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes4.dex */
public final class kn implements ja {

    /* renamed from: b  reason: collision with root package name */
    private int f1137b;
    private float c = 1.0f;
    private float d = 1.0f;
    private iy e = iy.a;
    private iy f;
    private iy g;
    private iy h;
    private boolean i;
    private km j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;

    /* renamed from: o  reason: collision with root package name */
    private long f1138o;
    private boolean p;

    public kn() {
        iy iyVar = iy.a;
        this.f = iyVar;
        this.g = iyVar;
        this.h = iyVar;
        ByteBuffer byteBuffer = a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = a;
        this.f1137b = -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final iy a(iy iyVar) throws iz {
        if (iyVar.d == 2) {
            int i = this.f1137b;
            if (i == -1) {
                i = iyVar.f1109b;
            }
            this.e = iyVar;
            iy iyVar2 = new iy(i, iyVar.c, 2);
            this.f = iyVar2;
            this.i = true;
            return iyVar2;
        }
        throw new iz(iyVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final ByteBuffer b() {
        int a;
        km kmVar = this.j;
        if (kmVar != null && (a = kmVar.a()) > 0) {
            if (this.k.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            kmVar.d(this.l);
            this.f1138o += a;
            this.k.limit(a);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = a;
        return byteBuffer;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void c() {
        if (g()) {
            iy iyVar = this.e;
            this.g = iyVar;
            this.h = this.f;
            if (this.i) {
                this.j = new km(iyVar.f1109b, iyVar.c, this.c, this.d, this.h.f1109b);
            } else {
                km kmVar = this.j;
                if (kmVar != null) {
                    kmVar.c();
                }
            }
        }
        this.m = a;
        this.n = 0L;
        this.f1138o = 0L;
        this.p = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void d() {
        km kmVar = this.j;
        if (kmVar != null) {
            kmVar.e();
        }
        this.p = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            km kmVar = this.j;
            af.s(kmVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            kmVar.f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void f() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = iy.a;
        iy iyVar = iy.a;
        this.f = iyVar;
        this.g = iyVar;
        this.h = iyVar;
        ByteBuffer byteBuffer = a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = a;
        this.f1137b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.f1138o = 0L;
        this.p = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final boolean g() {
        return this.f.f1109b != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f1109b != this.e.f1109b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final boolean h() {
        km kmVar;
        return this.p && ((kmVar = this.j) == null || kmVar.a() == 0);
    }

    public final long i(long j) {
        if (this.f1138o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            long j2 = this.n;
            km kmVar = this.j;
            af.s(kmVar);
            long b2 = j2 - kmVar.b();
            int i = this.h.f1109b;
            int i2 = this.g.f1109b;
            if (i == i2) {
                return cp.w(j, b2, this.f1138o);
            }
            return cp.w(j, b2 * i, this.f1138o * i2);
        }
        return (long) (this.c * j);
    }

    public final void j(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public final void k(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }
}

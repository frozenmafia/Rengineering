package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes4.dex */
public abstract class jt implements ja {

    /* renamed from: b  reason: collision with root package name */
    protected iy f1124b;
    protected iy c;
    private iy d;
    private iy e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public jt() {
        ByteBuffer byteBuffer = a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        this.d = iy.a;
        iy iyVar = iy.a;
        this.e = iyVar;
        this.f1124b = iyVar;
        this.c = iyVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final iy a(iy iyVar) throws iz {
        this.d = iyVar;
        this.e = i(iyVar);
        return g() ? this.e : iy.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = a;
        return byteBuffer;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void c() {
        this.g = a;
        this.h = false;
        this.f1124b = this.d;
        this.c = this.e;
        k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void d() {
        this.h = true;
        l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void f() {
        c();
        this.f = a;
        this.d = iy.a;
        iy iyVar = iy.a;
        this.e = iyVar;
        this.f1124b = iyVar;
        this.c = iyVar;
        m();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public boolean g() {
        return this.e != iy.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public boolean h() {
        return this.h && this.g == a;
    }

    protected iy i(iy iyVar) throws iz {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean n() {
        return this.g.hasRemaining();
    }
}

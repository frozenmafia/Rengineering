package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
final class qv extends ee {
    private long f;
    private int g;
    private int h;

    public qv() {
        super(2);
        this.h = 32;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ee, com.google.ads.interactivemedia.v3.internal.dy
    public final void b() {
        super.b();
        this.g = 0;
    }

    public final int l() {
        return this.g;
    }

    public final long m() {
        return this.f;
    }

    public final void n(int i) {
        af.u(true);
        this.h = i;
    }

    public final boolean o(ee eeVar) {
        ByteBuffer byteBuffer;
        af.u(!eeVar.k());
        af.u(!eeVar.e());
        af.u(!eeVar.g());
        if (p()) {
            if (this.g >= this.h || eeVar.f() != f()) {
                return false;
            }
            ByteBuffer byteBuffer2 = eeVar.f1024b;
            if (byteBuffer2 != null && (byteBuffer = this.f1024b) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.g;
        this.g = i + 1;
        if (i == 0) {
            this.d = eeVar.d;
            if (eeVar.h()) {
                c(1);
            }
        }
        if (eeVar.f()) {
            c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = eeVar.f1024b;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.f1024b.put(byteBuffer3);
        }
        this.f = eeVar.d;
        return true;
    }

    public final boolean p() {
        return this.g > 0;
    }
}

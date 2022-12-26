package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ju extends jt {
    private int[] d;
    private int[] e;

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) af.s(this.e);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = j(((limit - position) / this.f1124b.e) * this.c.e);
        while (position < limit) {
            for (int i : iArr) {
                j.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.f1124b.e;
        }
        byteBuffer.position(limit);
        j.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    public final iy i(iy iyVar) throws iz {
        int[] iArr = this.d;
        if (iArr == null) {
            return iy.a;
        }
        if (iyVar.d != 2) {
            throw new iz(iyVar);
        }
        boolean z = iyVar.c != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new iy(iyVar.f1109b, length, 2) : iy.a;
            }
            int i2 = iArr[i];
            if (i2 >= iyVar.c) {
                throw new iz(iyVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    protected final void k() {
        this.e = this.d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    protected final void m() {
        this.e = null;
        this.d = null;
    }

    public final void o(int[] iArr) {
        this.d = iArr;
    }
}

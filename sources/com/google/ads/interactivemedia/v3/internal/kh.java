package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class kh extends jt {
    private static final int d = Float.floatToIntBits(Float.NaN);

    private static void o(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == d) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer j;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f1124b.d;
        if (i2 == 536870912) {
            j = j((i / 3) * 4);
            while (position < limit) {
                o(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), j);
                position += 3;
            }
        } else if (i2 == 805306368) {
            j = j(i);
            while (position < limit) {
                o((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), j);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    public final iy i(iy iyVar) throws iz {
        int i = iyVar.d;
        if (cp.X(i)) {
            return i != 4 ? new iy(iyVar.f1109b, iyVar.c, 4) : iy.a;
        }
        throw new iz(iyVar);
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
public abstract class aae {
    public final ao a(ee eeVar) {
        ByteBuffer byteBuffer = eeVar.f1024b;
        af.s(byteBuffer);
        af.u(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eeVar.f()) {
            return null;
        }
        return b(byteBuffer);
    }

    protected abstract ao b(ByteBuffer byteBuffer);
}

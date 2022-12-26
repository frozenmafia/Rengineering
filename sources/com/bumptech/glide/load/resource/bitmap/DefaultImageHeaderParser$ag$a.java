package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes3.dex */
final class DefaultImageHeaderParser$ag$a {
    private final ByteBuffer toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultImageHeaderParser$ag$a(byte[] bArr, int i) {
        this.toString = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(ByteOrder byteOrder) {
        this.toString.order(byteOrder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int ag$a() {
        return this.toString.remaining();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int values(int i) {
        if (valueOf(i, 4)) {
            return this.toString.getInt(i);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public short ah$a(int i) {
        if (valueOf(i, 2)) {
            return this.toString.getShort(i);
        }
        return (short) -1;
    }

    private boolean valueOf(int i, int i2) {
        return this.toString.remaining() - i >= i2;
    }
}

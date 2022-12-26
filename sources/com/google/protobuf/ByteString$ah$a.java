package com.google.protobuf;

import java.util.Arrays;
/* loaded from: classes5.dex */
final class ByteString$ah$a implements ByteString$ag$a {
    private ByteString$ah$a() {
    }

    @Override // com.google.protobuf.ByteString$ag$a
    public byte[] valueOf(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}

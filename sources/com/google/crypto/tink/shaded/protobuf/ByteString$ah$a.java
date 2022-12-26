package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.Arrays;
/* loaded from: classes7.dex */
final class ByteString$ah$a implements ByteString.toString {
    private ByteString$ah$a() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString.toString
    public byte[] ag$a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}

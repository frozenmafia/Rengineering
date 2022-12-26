package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
/* loaded from: classes7.dex */
final class ByteString$HaptikSDK$a implements ByteString.toString {
    private ByteString$HaptikSDK$a() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString.toString
    public byte[] ag$a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}

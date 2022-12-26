package com.google.protobuf;
/* loaded from: classes5.dex */
final class ByteString$HaptikSDK$a implements ByteString$ag$a {
    private ByteString$HaptikSDK$a() {
    }

    @Override // com.google.protobuf.ByteString$ag$a
    public byte[] valueOf(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}

package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;
/* loaded from: classes7.dex */
abstract class setDefaultSwipeDirs implements endAnimation {
    private final onDown ag$a;
    private final onDown toString;

    abstract onDown toString(byte[] bArr, int i) throws InvalidKeyException;

    public setDefaultSwipeDirs(byte[] bArr) throws InvalidKeyException {
        this.toString = toString(bArr, 1);
        this.ag$a = toString(bArr, 0);
    }

    @Override // o.endAnimation
    public byte[] ah$a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > (Integer.MAX_VALUE - this.toString.ag$a()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.toString.ag$a() + 16);
        valueOf(allocate, bArr, bArr2);
        return allocate.array();
    }

    private void valueOf(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr.length + this.toString.ag$a() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.toString.toString(byteBuffer, bArr);
        byteBuffer.position(position);
        byte[] bArr3 = new byte[this.toString.ag$a()];
        byteBuffer.get(bArr3);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] valueOf = onSelected.valueOf(ah$a(bArr3), valueOf(bArr2, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(valueOf);
    }

    @Override // o.endAnimation
    public byte[] values(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return valueOf(ByteBuffer.wrap(bArr), bArr2);
    }

    private byte[] valueOf(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() < this.toString.ag$a() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr2 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr3 = new byte[this.toString.ag$a()];
        byteBuffer.get(bArr3);
        if (bArr == null) {
            bArr = new byte[0];
        }
        try {
            onSelected.toString(ah$a(bArr3), valueOf(bArr, byteBuffer), bArr2);
            byteBuffer.position(position);
            return this.toString.ah$a(byteBuffer);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    private byte[] ah$a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.ag$a.ag$a(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] valueOf(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }
}

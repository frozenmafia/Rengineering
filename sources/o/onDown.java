package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import o.ItemTouchHelper;
/* loaded from: classes7.dex */
public abstract class onDown implements ItemTouchUIUtilImpl {
    private static final int[] valueOf = ah$a(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    private final int ag$a;
    int[] toString;

    private static int ag$a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    public abstract int ag$a();

    abstract int[] values(int[] iArr, int i);

    public onDown(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.toString = ah$a(bArr);
        this.ag$a = i;
    }

    @Override // o.ItemTouchUIUtilImpl
    public byte[] ag$a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - ag$a()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(ag$a() + bArr.length);
        toString(allocate, bArr);
        return allocate.array();
    }

    public void toString(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - ag$a() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] ah$a = LinearLayoutManager.ah$a(ag$a());
        byteBuffer.put(ah$a);
        ag$a(ah$a, byteBuffer, ByteBuffer.wrap(bArr));
    }

    @Override // o.ItemTouchUIUtilImpl
    public byte[] valueOf(byte[] bArr) throws GeneralSecurityException {
        return ah$a(ByteBuffer.wrap(bArr));
    }

    public byte[] ah$a(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < ag$a()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[ag$a()];
        byteBuffer.get(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        ag$a(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    private void ag$a(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer ag$a = ag$a(bArr, this.ag$a + i2);
            if (i2 == i - 1) {
                ItemTouchHelper.RecoverAnimation.ag$a(byteBuffer, byteBuffer2, ag$a, remaining % 64);
            } else {
                ItemTouchHelper.RecoverAnimation.ag$a(byteBuffer, byteBuffer2, ag$a, 64);
            }
        }
    }

    public ByteBuffer ag$a(byte[] bArr, int i) {
        int[] values = values(ah$a(bArr), i);
        int[] iArr = (int[]) values.clone();
        valueOf(iArr);
        for (int i2 = 0; i2 < values.length; i2++) {
            values[i2] = values[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(values, 0, 16);
        return order;
    }

    public static void ag$a(int[] iArr, int[] iArr2) {
        int[] iArr3 = valueOf;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void valueOf(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            values(iArr, 0, 4, 8, 12);
            values(iArr, 1, 5, 9, 13);
            values(iArr, 2, 6, 10, 14);
            values(iArr, 3, 7, 11, 15);
            values(iArr, 0, 5, 10, 15);
            values(iArr, 1, 6, 11, 12);
            values(iArr, 2, 7, 8, 13);
            values(iArr, 3, 4, 9, 14);
        }
    }

    static void values(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = ag$a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = ag$a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = ag$a(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = ag$a(iArr[i2] ^ iArr[i3], 7);
    }

    static int[] ah$a(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}

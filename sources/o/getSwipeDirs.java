package o;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import o.ItemTouchHelper;
/* loaded from: classes7.dex */
public final class getSwipeDirs implements endAnimation {
    private final ItemTouchUIUtilImpl ah$a;
    private final int toString;
    private final calculateDiff values;

    public getSwipeDirs(ItemTouchUIUtilImpl itemTouchUIUtilImpl, calculateDiff calculatediff, int i) {
        this.ah$a = itemTouchUIUtilImpl;
        this.values = calculatediff;
        this.toString = i;
    }

    @Override // o.endAnimation
    public byte[] ah$a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] ag$a = this.ah$a.ag$a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return ItemTouchHelper.RecoverAnimation.ah$a(ag$a, this.values.valueOf(ItemTouchHelper.RecoverAnimation.ah$a(bArr2, ag$a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // o.endAnimation
    public byte[] values(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.toString;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.toString, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.values.valueOf(copyOfRange2, ItemTouchHelper.RecoverAnimation.ah$a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.ah$a.valueOf(copyOfRange);
    }
}

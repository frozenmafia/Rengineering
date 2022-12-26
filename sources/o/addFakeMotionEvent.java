package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class addFakeMotionEvent extends handlesGetAccessibilityClassName<byte[]> {
    private int ah$a;
    private byte[] values;

    public addFakeMotionEvent(byte[] bArr) {
        runAnimators.ag$a(bArr, "bufferWithData");
        this.values = bArr;
        this.ah$a = bArr.length;
        values(10);
    }

    @Override // o.handlesGetAccessibilityClassName
    public int ag$a() {
        return this.ah$a;
    }

    @Override // o.handlesGetAccessibilityClassName
    public void values(int i) {
        byte[] bArr = this.values;
        if (bArr.length < i) {
            byte[] copyOf = Arrays.copyOf(bArr, addTransitionInternal.ah$a(i, bArr.length * 2));
            runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.values = copyOf;
        }
    }

    public final void valueOf(byte b2) {
        handlesGetAccessibilityClassName.toString(this, 0, 1, null);
        byte[] bArr = this.values;
        int ag$a = ag$a();
        this.ah$a = ag$a + 1;
        bArr[ag$a] = b2;
    }

    @Override // o.handlesGetAccessibilityClassName
    /* renamed from: ah$a */
    public byte[] valueOf() {
        byte[] copyOf = Arrays.copyOf(this.values, ag$a());
        runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }
}

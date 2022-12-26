package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class onRestorePendingState extends handlesGetAccessibilityClassName<short[]> {
    private short[] toString;
    private int valueOf;

    public onRestorePendingState(short[] sArr) {
        runAnimators.ag$a(sArr, "bufferWithData");
        this.toString = sArr;
        this.valueOf = sArr.length;
        values(10);
    }

    @Override // o.handlesGetAccessibilityClassName
    public int ag$a() {
        return this.valueOf;
    }

    @Override // o.handlesGetAccessibilityClassName
    public void values(int i) {
        short[] sArr = this.toString;
        if (sArr.length < i) {
            short[] copyOf = Arrays.copyOf(sArr, addTransitionInternal.ah$a(i, sArr.length * 2));
            runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.toString = copyOf;
        }
    }

    public final void values(short s) {
        handlesGetAccessibilityClassName.toString(this, 0, 1, null);
        short[] sArr = this.toString;
        int ag$a = ag$a();
        this.valueOf = ag$a + 1;
        sArr[ag$a] = s;
    }

    @Override // o.handlesGetAccessibilityClassName
    /* renamed from: ah$a */
    public short[] valueOf() {
        short[] copyOf = Arrays.copyOf(this.toString, ag$a());
        runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }
}

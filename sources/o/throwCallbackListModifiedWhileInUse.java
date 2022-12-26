package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class throwCallbackListModifiedWhileInUse extends handlesGetAccessibilityClassName<boolean[]> {
    private boolean[] ag$a;
    private int valueOf;

    public throwCallbackListModifiedWhileInUse(boolean[] zArr) {
        runAnimators.ag$a(zArr, "bufferWithData");
        this.ag$a = zArr;
        this.valueOf = zArr.length;
        values(10);
    }

    @Override // o.handlesGetAccessibilityClassName
    public int ag$a() {
        return this.valueOf;
    }

    @Override // o.handlesGetAccessibilityClassName
    public void values(int i) {
        boolean[] zArr = this.ag$a;
        if (zArr.length < i) {
            boolean[] copyOf = Arrays.copyOf(zArr, addTransitionInternal.ah$a(i, zArr.length * 2));
            runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.ag$a = copyOf;
        }
    }

    public final void values(boolean z) {
        handlesGetAccessibilityClassName.toString(this, 0, 1, null);
        boolean[] zArr = this.ag$a;
        int ag$a = ag$a();
        this.valueOf = ag$a + 1;
        zArr[ag$a] = z;
    }

    @Override // o.handlesGetAccessibilityClassName
    /* renamed from: ah$a */
    public boolean[] valueOf() {
        boolean[] copyOf = Arrays.copyOf(this.ag$a, ag$a());
        runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }
}

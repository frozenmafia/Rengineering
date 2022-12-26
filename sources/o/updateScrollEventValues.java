package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class updateScrollEventValues extends handlesGetAccessibilityClassName<int[]> {
    private int[] ah$a;
    private int toString;

    public updateScrollEventValues(int[] iArr) {
        runAnimators.ag$a(iArr, "bufferWithData");
        this.ah$a = iArr;
        this.toString = iArr.length;
        values(10);
    }

    @Override // o.handlesGetAccessibilityClassName
    public int ag$a() {
        return this.toString;
    }

    @Override // o.handlesGetAccessibilityClassName
    public void values(int i) {
        int[] iArr = this.ah$a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, addTransitionInternal.ah$a(i, iArr.length * 2));
            runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.ah$a = copyOf;
        }
    }

    public final void valueOf(int i) {
        handlesGetAccessibilityClassName.toString(this, 0, 1, null);
        int[] iArr = this.ah$a;
        int ag$a = ag$a();
        this.toString = ag$a + 1;
        iArr[ag$a] = i;
    }

    @Override // o.handlesGetAccessibilityClassName
    /* renamed from: values */
    public int[] valueOf() {
        int[] copyOf = Arrays.copyOf(this.ah$a, ag$a());
        runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }
}

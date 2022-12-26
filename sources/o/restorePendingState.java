package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class restorePendingState extends handlesGetAccessibilityClassName<long[]> {
    private long[] ah$a;
    private int valueOf;

    public restorePendingState(long[] jArr) {
        runAnimators.ag$a(jArr, "bufferWithData");
        this.ah$a = jArr;
        this.valueOf = jArr.length;
        values(10);
    }

    @Override // o.handlesGetAccessibilityClassName
    public int ag$a() {
        return this.valueOf;
    }

    @Override // o.handlesGetAccessibilityClassName
    public void values(int i) {
        long[] jArr = this.ah$a;
        if (jArr.length < i) {
            long[] copyOf = Arrays.copyOf(jArr, addTransitionInternal.ah$a(i, jArr.length * 2));
            runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.ah$a = copyOf;
        }
    }

    public final void ag$a(long j) {
        handlesGetAccessibilityClassName.toString(this, 0, 1, null);
        long[] jArr = this.ah$a;
        int ag$a = ag$a();
        this.valueOf = ag$a + 1;
        jArr[ag$a] = j;
    }

    @Override // o.handlesGetAccessibilityClassName
    /* renamed from: values */
    public long[] valueOf() {
        long[] copyOf = Arrays.copyOf(this.ah$a, ag$a());
        runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }
}

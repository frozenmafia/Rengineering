package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class getPageTransformer extends handlesGetAccessibilityClassName<double[]> {
    private int ag$a;
    private double[] ah$a;

    public getPageTransformer(double[] dArr) {
        runAnimators.ag$a(dArr, "bufferWithData");
        this.ah$a = dArr;
        this.ag$a = dArr.length;
        values(10);
    }

    @Override // o.handlesGetAccessibilityClassName
    public int ag$a() {
        return this.ag$a;
    }

    @Override // o.handlesGetAccessibilityClassName
    public void values(int i) {
        double[] dArr = this.ah$a;
        if (dArr.length < i) {
            double[] copyOf = Arrays.copyOf(dArr, addTransitionInternal.ah$a(i, dArr.length * 2));
            runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.ah$a = copyOf;
        }
    }

    public final void ag$a(double d) {
        handlesGetAccessibilityClassName.toString(this, 0, 1, null);
        double[] dArr = this.ah$a;
        int ag$a = ag$a();
        this.ag$a = ag$a + 1;
        dArr[ag$a] = d;
    }

    @Override // o.handlesGetAccessibilityClassName
    /* renamed from: ah$a */
    public double[] valueOf() {
        double[] copyOf = Arrays.copyOf(this.ah$a, ag$a());
        runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }
}

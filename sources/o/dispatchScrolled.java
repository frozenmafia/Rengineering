package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class dispatchScrolled extends handlesGetAccessibilityClassName<float[]> {
    private int toString;
    private float[] values;

    public dispatchScrolled(float[] fArr) {
        runAnimators.ag$a(fArr, "bufferWithData");
        this.values = fArr;
        this.toString = fArr.length;
        values(10);
    }

    @Override // o.handlesGetAccessibilityClassName
    public int ag$a() {
        return this.toString;
    }

    @Override // o.handlesGetAccessibilityClassName
    public void values(int i) {
        float[] fArr = this.values;
        if (fArr.length < i) {
            float[] copyOf = Arrays.copyOf(fArr, addTransitionInternal.ah$a(i, fArr.length * 2));
            runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.values = copyOf;
        }
    }

    public final void values(float f) {
        handlesGetAccessibilityClassName.toString(this, 0, 1, null);
        float[] fArr = this.values;
        int ag$a = ag$a();
        this.toString = ag$a + 1;
        fArr[ag$a] = f;
    }

    @Override // o.handlesGetAccessibilityClassName
    /* renamed from: values */
    public float[] valueOf() {
        float[] copyOf = Arrays.copyOf(this.values, ag$a());
        runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }
}

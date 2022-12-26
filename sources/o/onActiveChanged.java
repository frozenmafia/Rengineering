package o;

import o.ResultReceiver;
/* loaded from: classes.dex */
public class onActiveChanged {
    private final float[] ag$a;
    private final int[] values;

    public onActiveChanged(float[] fArr, int[] iArr) {
        this.ag$a = fArr;
        this.values = iArr;
    }

    public float[] values() {
        return this.ag$a;
    }

    public int[] ag$a() {
        return this.values;
    }

    public int ah$a() {
        return this.values.length;
    }

    public void toString(onActiveChanged onactivechanged, onActiveChanged onactivechanged2, float f) {
        if (onactivechanged.values.length != onactivechanged2.values.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + onactivechanged.values.length + " vs " + onactivechanged2.values.length + ")");
        }
        for (int i = 0; i < onactivechanged.values.length; i++) {
            this.ag$a[i] = viewModels.ag$a(onactivechanged.ag$a[i], onactivechanged2.ag$a[i], f);
            this.values[i] = ResultReceiver.AnonymousClass1.valueOf(f, onactivechanged.values[i], onactivechanged2.values[i]);
        }
    }
}

package o;

import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes4.dex */
public final class onViewCreated {
    public static final onViewCreated$ag$a valueOf = new onViewCreated$ag$a(null);
    private int ag$a;
    private int[] ah$a;
    private float[] toString;

    public onViewCreated(int[] iArr) {
        int values;
        runAnimators.ag$a(iArr, "shape");
        this.ah$a = iArr;
        values = valueOf.values(iArr);
        this.ag$a = values;
        this.toString = new float[values];
    }

    /* renamed from: o.onViewCreated$lambda-10  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class lambda10 extends PreferenceHeaderFragmentCompat$$ExternalSyntheticLambda0 {
        public lambda10(TextInputLayout textInputLayout, int i) {
            super(textInputLayout, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.PreferenceHeaderFragmentCompat$$ExternalSyntheticLambda0
        public void values() {
            this.ah$a.setEndIconDrawable(this.toString);
            this.ah$a.setEndIconOnClickListener(null);
            this.ah$a.setEndIconOnLongClickListener(null);
        }
    }

    public final float[] values() {
        return this.toString;
    }

    public final int ag$a() {
        return this.ah$a.length;
    }

    public final int valueOf(int i) {
        return this.ah$a[i];
    }

    public final void ah$a(int[] iArr) {
        int values;
        runAnimators.ag$a(iArr, "shape");
        this.ah$a = iArr;
        values = valueOf.values(iArr);
        float[] fArr = new float[values];
        System.arraycopy(this.toString, 0, fArr, 0, Math.min(this.ag$a, values));
        this.toString = fArr;
        this.ag$a = values;
    }
}

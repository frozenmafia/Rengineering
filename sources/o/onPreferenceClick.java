package o;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* loaded from: classes5.dex */
public class onPreferenceClick implements TypeEvaluator<Matrix> {
    private final float[] valueOf = new float[9];
    private final float[] values = new float[9];
    private final Matrix ag$a = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* renamed from: values */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.valueOf);
        matrix2.getValues(this.values);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.values;
            float f2 = fArr[i];
            float[] fArr2 = this.valueOf;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.ag$a.setValues(this.values);
        return this.ag$a;
    }
}

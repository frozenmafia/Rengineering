package o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import o.areContentsTheSame;
/* loaded from: classes5.dex */
public class areContentsTheSame$ag$a extends areContentsTheSame.values {
    private static final RectF HaptikSDK$b = new RectF();
    @Deprecated
    public float ag$a;
    @Deprecated
    public float ah$a;
    @Deprecated
    public float ah$b;
    @Deprecated
    public float toString;
    @Deprecated
    public float valueOf;
    @Deprecated
    public float values;

    public areContentsTheSame$ag$a(float f, float f2, float f3, float f4) {
        valueOf(f);
        HaptikSDK$c(f2);
        values(f3);
        ah$a(f4);
    }

    @Override // o.areContentsTheSame.values
    public void values(Matrix matrix, Path path) {
        Matrix matrix2 = this.HaptikSDK$c;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = HaptikSDK$b;
        rectF.set(valueOf(), HaptikSDK$b(), ag$a(), ah$a());
        path.arcTo(rectF, values(), HaptikSDK$c(), false);
        path.transform(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float valueOf() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float HaptikSDK$b() {
        return this.ah$b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float ag$a() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float ah$a() {
        return this.valueOf;
    }

    private void valueOf(float f) {
        this.ag$a = f;
    }

    private void HaptikSDK$c(float f) {
        this.ah$b = f;
    }

    private void values(float f) {
        this.toString = f;
    }

    private void ah$a(float f) {
        this.valueOf = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float values() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float HaptikSDK$c() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toString(float f) {
        this.values = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag$a(float f) {
        this.ah$a = f;
    }
}

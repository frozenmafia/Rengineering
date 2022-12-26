package o;

import android.opengl.Matrix;
/* loaded from: classes3.dex */
final class setFinalThemeId {
    private boolean toString;
    private final float[] ag$a = new float[16];
    private final float[] values = new float[16];
    private final getCn0DbHz<float[]> valueOf = new getCn0DbHz<>();

    public void toString(long j, float[] fArr) {
        this.valueOf.values(j, fArr);
    }

    public void ag$a() {
        this.valueOf.values();
        this.toString = false;
    }

    public boolean valueOf(float[] fArr, long j) {
        float[] getcn0dbhz = this.valueOf.toString(j);
        if (getcn0dbhz == null) {
            return false;
        }
        values(this.values, getcn0dbhz);
        if (!this.toString) {
            ah$a(this.ag$a, this.values);
            this.toString = true;
        }
        Matrix.multiplyMM(fArr, 0, this.ag$a, 0, this.values, 0);
        return true;
    }

    public static void ah$a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8]));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }

    private static void values(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }
}

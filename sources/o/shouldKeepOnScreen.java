package o;
/* loaded from: classes3.dex */
final class shouldKeepOnScreen {
    public final int ag$a;
    public final boolean ah$a;
    public final shouldKeepOnScreen$ah$a valueOf;
    public final shouldKeepOnScreen$ah$a values;

    public static shouldKeepOnScreen valueOf(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        float f5 = f;
        int i8 = i;
        int i9 = i2;
        FingerprintManagerCompat.toString(f5 > 0.0f);
        FingerprintManagerCompat.toString(i8 >= 1);
        FingerprintManagerCompat.toString(i9 >= 1);
        FingerprintManagerCompat.toString(f2 > 0.0f && f2 <= 180.0f);
        FingerprintManagerCompat.toString(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f6 = radians / i8;
        float f7 = radians2 / i9;
        int i10 = i9 + 1;
        int i11 = ((i10 * 2) + 2) * i8;
        float[] fArr2 = new float[i11 * 3];
        float[] fArr3 = new float[i11 * 2];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i8) {
            float f8 = radians / 2.0f;
            float f9 = (i12 * f6) - f8;
            int i15 = i12 + 1;
            float f10 = (i15 * f6) - f8;
            int i16 = 0;
            while (i16 < i10) {
                float f11 = f9;
                int i17 = i15;
                int i18 = 0;
                int i19 = 2;
                while (i18 < i19) {
                    if (i18 == 0) {
                        f4 = f11;
                        i4 = i10;
                    } else {
                        i4 = i10;
                        f4 = f10;
                    }
                    float f12 = i16 * f7;
                    int i20 = i14 + 1;
                    int i21 = i16;
                    double d = f5;
                    float f13 = f6;
                    int i22 = i18;
                    double d2 = (f12 + 3.1415927f) - (radians2 / 2.0f);
                    float f14 = f7;
                    double d3 = f4;
                    float[] fArr4 = fArr3;
                    float f15 = f10;
                    fArr2[i14] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    int i23 = i20 + 1;
                    float f16 = radians;
                    float f17 = radians2;
                    fArr2[i20] = (float) (d * Math.sin(d3));
                    int i24 = i23 + 1;
                    fArr2[i23] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    int i25 = i13 + 1;
                    fArr4[i13] = f12 / f17;
                    int i26 = i25 + 1;
                    fArr4[i25] = ((i12 + i22) * f13) / f16;
                    if (i21 == 0 && i22 == 0) {
                        i5 = i2;
                        i6 = i21;
                        i7 = i22;
                    } else {
                        i5 = i2;
                        i6 = i21;
                        i7 = i22;
                        if (i6 != i5 || i7 != 1) {
                            fArr = fArr4;
                            i13 = i26;
                            i14 = i24;
                            i18 = i7 + 1;
                            f7 = f14;
                            i9 = i5;
                            i16 = i6;
                            fArr3 = fArr;
                            radians = f16;
                            i10 = i4;
                            f6 = f13;
                            radians2 = f17;
                            f10 = f15;
                            i19 = 2;
                            f5 = f;
                        }
                    }
                    System.arraycopy(fArr2, i24 - 3, fArr2, i24, 3);
                    i24 += 3;
                    fArr = fArr4;
                    System.arraycopy(fArr, i26 - 2, fArr, i26, 2);
                    i26 += 2;
                    i13 = i26;
                    i14 = i24;
                    i18 = i7 + 1;
                    f7 = f14;
                    i9 = i5;
                    i16 = i6;
                    fArr3 = fArr;
                    radians = f16;
                    i10 = i4;
                    f6 = f13;
                    radians2 = f17;
                    f10 = f15;
                    i19 = 2;
                    f5 = f;
                }
                float f18 = radians2;
                int i27 = i16;
                int i28 = i9;
                int i29 = i27 + 1;
                f9 = f11;
                f7 = f7;
                i15 = i17;
                radians2 = f18;
                f10 = f10;
                f5 = f;
                i9 = i28;
                i16 = i29;
            }
            f5 = f;
            i8 = i;
            i12 = i15;
        }
        return new shouldKeepOnScreen(new shouldKeepOnScreen$ah$a(new valueOf(0, fArr2, fArr3, 1)), i3);
    }

    public shouldKeepOnScreen(shouldKeepOnScreen$ah$a shouldkeeponscreen_ah_a, int i) {
        this(shouldkeeponscreen_ah_a, shouldkeeponscreen_ah_a, i);
    }

    public shouldKeepOnScreen(shouldKeepOnScreen$ah$a shouldkeeponscreen_ah_a, shouldKeepOnScreen$ah$a shouldkeeponscreen_ah_a2, int i) {
        this.values = shouldkeeponscreen_ah_a;
        this.valueOf = shouldkeeponscreen_ah_a2;
        this.ag$a = i;
        this.ah$a = shouldkeeponscreen_ah_a == shouldkeeponscreen_ah_a2;
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public final int ah$a;
        public final int toString;
        public final float[] valueOf;
        public final float[] values;

        public valueOf(int i, float[] fArr, float[] fArr2, int i2) {
            this.toString = i;
            FingerprintManagerCompat.toString(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.valueOf = fArr;
            this.values = fArr2;
            this.ah$a = i2;
        }

        public int ag$a() {
            return this.valueOf.length / 3;
        }
    }
}

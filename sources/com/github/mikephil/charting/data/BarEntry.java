package com.github.mikephil.charting.data;

import o.registerCallbacks;
/* loaded from: classes4.dex */
public class BarEntry extends Entry {
    private float ag$a;
    private float[] ah$a;
    private float toString;
    private registerCallbacks[] values;

    public BarEntry(float f, float f2) {
        super(f, f2);
    }

    public BarEntry(float f, float[] fArr) {
        super(f, toString(fArr));
        this.ah$a = fArr;
        getInitSettings();
        values();
    }

    public float[] HaptikSDK$b() {
        return this.ah$a;
    }

    @Override // o.onProgressUpdateSent
    public float ah$b() {
        return super.ah$b();
    }

    public registerCallbacks[] ag$a() {
        return this.values;
    }

    public boolean invoke() {
        return this.ah$a != null;
    }

    public float ah$a() {
        return this.ag$a;
    }

    public float valueOf() {
        return this.toString;
    }

    private void getInitSettings() {
        float[] fArr = this.ah$a;
        if (fArr == null) {
            this.toString = 0.0f;
            this.ag$a = 0.0f;
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (float f3 : fArr) {
            if (f3 <= 0.0f) {
                f += Math.abs(f3);
            } else {
                f2 += f3;
            }
        }
        this.toString = f;
        this.ag$a = f2;
    }

    private static float toString(float[] fArr) {
        float f = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    protected void values() {
        float[] HaptikSDK$b = HaptikSDK$b();
        if (HaptikSDK$b == null || HaptikSDK$b.length == 0) {
            return;
        }
        this.values = new registerCallbacks[HaptikSDK$b.length];
        float f = -valueOf();
        int i = 0;
        float f2 = 0.0f;
        while (true) {
            registerCallbacks[] registercallbacksArr = this.values;
            if (i >= registercallbacksArr.length) {
                return;
            }
            float f3 = HaptikSDK$b[i];
            if (f3 < 0.0f) {
                float f4 = f - f3;
                registercallbacksArr[i] = new registerCallbacks(f, f4);
                f = f4;
            } else {
                float f5 = f3 + f2;
                registercallbacksArr[i] = new registerCallbacks(f2, f5);
                f2 = f5;
            }
            i++;
        }
    }
}

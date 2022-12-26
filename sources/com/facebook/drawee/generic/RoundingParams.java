package com.facebook.drawee.generic;

import java.util.Arrays;
import o.Fragment;
/* loaded from: classes4.dex */
public class RoundingParams {
    private RoundingMethod invoke = RoundingMethod.BITMAP_ONLY;
    private boolean HaptikSDK$a = false;
    private float[] ah$a = null;
    private int valueOf = 0;
    private float values = 0.0f;
    private int ag$a = 0;
    private float toString = 0.0f;
    private boolean HaptikSDK$b = false;
    private boolean HaptikSDK$c = false;

    /* loaded from: classes4.dex */
    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public RoundingParams values(boolean z) {
        this.HaptikSDK$a = z;
        return this;
    }

    public boolean HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public RoundingParams toString(float f) {
        Arrays.fill(getInitSettings(), f);
        return this;
    }

    public RoundingParams valueOf(float f, float f2, float f3, float f4) {
        float[] initSettings = getInitSettings();
        initSettings[1] = f;
        initSettings[0] = f;
        initSettings[3] = f2;
        initSettings[2] = f2;
        initSettings[5] = f3;
        initSettings[4] = f3;
        initSettings[7] = f4;
        initSettings[6] = f4;
        return this;
    }

    public float[] ag$a() {
        return this.ah$a;
    }

    public RoundingParams ah$a(RoundingMethod roundingMethod) {
        this.invoke = roundingMethod;
        return this;
    }

    public RoundingMethod HaptikSDK$c() {
        return this.invoke;
    }

    public RoundingParams toString(int i) {
        this.valueOf = i;
        this.invoke = RoundingMethod.OVERLAY_COLOR;
        return this;
    }

    public int values() {
        return this.valueOf;
    }

    private float[] getInitSettings() {
        if (this.ah$a == null) {
            this.ah$a = new float[8];
        }
        return this.ah$a;
    }

    public RoundingParams values(float f) {
        Fragment.AnonymousClass8.valueOf(f >= 0.0f, "the border width cannot be < 0");
        this.values = f;
        return this;
    }

    public float ah$a() {
        return this.values;
    }

    public RoundingParams ag$a(int i) {
        this.ag$a = i;
        return this;
    }

    public int valueOf() {
        return this.ag$a;
    }

    public RoundingParams ag$a(int i, float f) {
        Fragment.AnonymousClass8.valueOf(f >= 0.0f, "the border width cannot be < 0");
        this.values = f;
        this.ag$a = i;
        return this;
    }

    public RoundingParams ah$a(float f) {
        Fragment.AnonymousClass8.valueOf(f >= 0.0f, "the padding cannot be < 0");
        this.toString = f;
        return this;
    }

    public float HaptikSDK$b() {
        return this.toString;
    }

    public boolean invoke() {
        return this.HaptikSDK$b;
    }

    public RoundingParams toString(boolean z) {
        this.HaptikSDK$c = z;
        return this;
    }

    public boolean ah$b() {
        return this.HaptikSDK$c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.HaptikSDK$a == roundingParams.HaptikSDK$a && this.valueOf == roundingParams.valueOf && Float.compare(roundingParams.values, this.values) == 0 && this.ag$a == roundingParams.ag$a && Float.compare(roundingParams.toString, this.toString) == 0 && this.invoke == roundingParams.invoke && this.HaptikSDK$b == roundingParams.HaptikSDK$b && this.HaptikSDK$c == roundingParams.HaptikSDK$c) {
            return Arrays.equals(this.ah$a, roundingParams.ah$a);
        }
        return false;
    }

    public int hashCode() {
        RoundingMethod roundingMethod = this.invoke;
        int hashCode = roundingMethod != null ? roundingMethod.hashCode() : 0;
        boolean z = this.HaptikSDK$a;
        float[] fArr = this.ah$a;
        int hashCode2 = fArr != null ? Arrays.hashCode(fArr) : 0;
        int i = this.valueOf;
        float f = this.values;
        int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        int i2 = this.ag$a;
        float f2 = this.toString;
        return (((((((((((((((hashCode * 31) + (z ? 1 : 0)) * 31) + hashCode2) * 31) + i) * 31) + floatToIntBits) * 31) + i2) * 31) + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + (this.HaptikSDK$b ? 1 : 0)) * 31) + (this.HaptikSDK$c ? 1 : 0);
    }
}

package com.airbnb.lottie.model;
/* loaded from: classes.dex */
public class DocumentData {
    public float HaptikSDK$a;
    public float HaptikSDK$b;
    public String HaptikSDK$c;
    public String ag$a;
    public int ah$a;
    public int ah$b;
    public int getSignupData;
    public boolean invoke;
    public float toString;
    public Justification valueOf;
    public float values;

    /* loaded from: classes.dex */
    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        values(str, str2, f, justification, i, f2, f3, i2, i3, f4, z);
    }

    public DocumentData() {
    }

    public void values(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.HaptikSDK$c = str;
        this.ag$a = str2;
        this.HaptikSDK$a = f;
        this.valueOf = justification;
        this.getSignupData = i;
        this.toString = f2;
        this.values = f3;
        this.ah$a = i2;
        this.ah$b = i3;
        this.HaptikSDK$b = f4;
        this.invoke = z;
    }

    public int hashCode() {
        int ordinal = this.valueOf.ordinal();
        int i = this.getSignupData;
        long floatToRawIntBits = Float.floatToRawIntBits(this.toString);
        return (((((((((int) ((((this.HaptikSDK$c.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.HaptikSDK$a)) * 31) + ordinal) * 31) + i) * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.ah$a;
    }
}

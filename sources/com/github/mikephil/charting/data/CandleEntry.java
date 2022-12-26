package com.github.mikephil.charting.data;
/* loaded from: classes4.dex */
public class CandleEntry extends Entry {
    private float ag$a;
    private float ah$a;
    private float valueOf;
    private float values;

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Object obj) {
        super(f, (f2 + f3) / 2.0f, obj);
        this.values = 0.0f;
        this.ah$a = 0.0f;
        this.valueOf = 0.0f;
        this.ag$a = 0.0f;
        this.values = f2;
        this.ah$a = f3;
        this.ag$a = f4;
        this.valueOf = f5;
    }

    @Override // o.onProgressUpdateSent
    public float ah$b() {
        return super.ah$b();
    }

    public float ag$a() {
        return this.values;
    }

    public float values() {
        return this.ah$a;
    }

    public float ah$a() {
        return this.valueOf;
    }

    public float valueOf() {
        return this.ag$a;
    }
}

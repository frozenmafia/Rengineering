package com.github.mikephil.charting.data;

import android.util.Log;
/* loaded from: classes4.dex */
public class PieEntry extends Entry {
    private String toString;

    public PieEntry(float f) {
        super(0.0f, f);
    }

    public PieEntry(float f, Object obj) {
        super(0.0f, f, obj);
    }

    public PieEntry(float f, String str, Object obj) {
        super(0.0f, f, obj);
        this.toString = str;
    }

    public float ah$a() {
        return ah$b();
    }

    public String values() {
        return this.toString;
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void toString(float f) {
        super.toString(f);
        Log.i("DEPRECATED", "Pie entries do not have x values");
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float HaptikWebView() {
        Log.i("DEPRECATED", "Pie entries do not have x values");
        return super.HaptikWebView();
    }
}

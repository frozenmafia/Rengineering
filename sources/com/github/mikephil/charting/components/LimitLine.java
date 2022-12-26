package com.github.mikephil.charting.components;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import o.getServiceComponentByAction;
import o.performSearch;
/* loaded from: classes4.dex */
public class LimitLine extends performSearch {
    private float valueOf;
    private float ah$b = 2.0f;
    private int values = Color.rgb(237, 91, 91);
    private Paint.Style HaptikSDK$b = Paint.Style.FILL_AND_STROKE;
    private String ag$a = "";
    private DashPathEffect ah$a = null;
    private LimitLabelPosition toString = LimitLabelPosition.RIGHT_TOP;

    /* loaded from: classes4.dex */
    public enum LimitLabelPosition {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public LimitLine(float f) {
        this.valueOf = 0.0f;
        this.valueOf = f;
    }

    public float ah$a() {
        return this.valueOf;
    }

    public void toString(float f) {
        if (f < 0.2f) {
            f = 0.2f;
        }
        if (f > 12.0f) {
            f = 12.0f;
        }
        this.ah$b = getServiceComponentByAction.valueOf(f);
    }

    public float HaptikSDK$c() {
        return this.ah$b;
    }

    public void ag$a(int i) {
        this.values = i;
    }

    public int invoke() {
        return this.values;
    }

    public void ah$a(float f, float f2, float f3) {
        this.ah$a = new DashPathEffect(new float[]{f, f2}, f3);
    }

    public DashPathEffect values() {
        return this.ah$a;
    }

    public Paint.Style ah$b() {
        return this.HaptikSDK$b;
    }

    public void values(LimitLabelPosition limitLabelPosition) {
        this.toString = limitLabelPosition;
    }

    public LimitLabelPosition ag$a() {
        return this.toString;
    }

    public void toString(String str) {
        this.ag$a = str;
    }

    public String valueOf() {
        return this.ag$a;
    }
}

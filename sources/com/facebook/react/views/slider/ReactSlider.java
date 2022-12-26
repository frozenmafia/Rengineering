package com.facebook.react.views.slider;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
/* loaded from: classes4.dex */
public class ReactSlider extends AppCompatSeekBar {
    private static int values = 128;
    private double ag$a;
    private double ah$a;
    private double invoke;
    private double toString;
    private double valueOf;

    public ReactSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ag$a = 0.0d;
        this.toString = 0.0d;
        this.invoke = 0.0d;
        this.ah$a = 0.0d;
        this.valueOf = 0.0d;
        valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf() {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT >= 26) {
            return;
        }
        super.setStateListAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(double d) {
        this.toString = d;
        values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(double d) {
        this.ag$a = d;
        values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(double d) {
        this.invoke = d;
        HaptikSDK$b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(double d) {
        this.ah$a = d;
        values();
    }

    public double valueOf(int i) {
        if (i == getMax()) {
            return this.toString;
        }
        return (i * ah$a()) + this.ag$a;
    }

    private void values() {
        if (this.ah$a == 0.0d) {
            this.valueOf = (this.toString - this.ag$a) / values;
        }
        setMax(ag$a());
        HaptikSDK$b();
    }

    private void HaptikSDK$b() {
        double d = this.invoke;
        double d2 = this.ag$a;
        setProgress((int) Math.round(((d - d2) / (this.toString - d2)) * ag$a()));
    }

    private int ag$a() {
        return (int) Math.ceil((this.toString - this.ag$a) / ah$a());
    }

    private double ah$a() {
        double d = this.ah$a;
        return d > 0.0d ? d : this.valueOf;
    }
}

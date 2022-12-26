package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.app.dream11Pro.R;
import o.AnyRes;
/* loaded from: classes3.dex */
public class CircularTextView extends CustomTextView {
    Paint HaptikSDK$b;
    int ag$a;
    int ah$a;
    private float invoke;
    int toString;
    int valueOf;
    Paint values;

    public CircularTextView(Context context) {
        super(context);
        this.values = new Paint();
        this.HaptikSDK$b = new Paint();
        this.ah$a = 0;
        this.toString = 0;
    }

    public CircularTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.values = new Paint();
        this.HaptikSDK$b = new Paint();
        this.ah$a = 0;
        this.toString = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CircularTextView);
        try {
            this.ag$a = obtainStyledAttributes.getColor(1, getResources().getColor(R.color.res_0x7f0605d5));
            this.invoke = obtainStyledAttributes.getFloat(2, 5.0f);
            this.valueOf = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.res_0x7f060531));
        } catch (Exception unused) {
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
    }

    public CircularTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.values = new Paint();
        this.HaptikSDK$b = new Paint();
        this.ah$a = 0;
        this.toString = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.values.setColor(this.valueOf);
        this.values.setFlags(1);
        this.HaptikSDK$b.setColor(this.ag$a);
        this.HaptikSDK$b.setFlags(1);
        float f = this.toString >> 1;
        canvas.drawCircle(f, f, this.ah$a, this.HaptikSDK$b);
        float f2 = this.toString >> 1;
        canvas.drawCircle(f2, f2, this.ah$a - this.invoke, this.values);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int max = Math.max(i2, i);
        this.toString = max;
        this.ah$a = max / 2;
    }

    public void setBorderWidth(float f) {
        this.invoke = f;
        requestLayout();
        invalidate();
    }

    public void setStrokeWidth(int i) {
        this.invoke = i * getContext().getResources().getDisplayMetrics().density;
    }

    public void setStrokeColor(int i) {
        this.ag$a = i;
    }

    public void setSolidColor(int i) {
        this.valueOf = i;
    }

    public static void setBgColor(CircularTextView circularTextView, String str) {
        if (circularTextView == null || str == null) {
            return;
        }
        circularTextView.setSolidColor(Color.parseColor(str));
    }

    public static void setBgColorInt(CircularTextView circularTextView, int i) {
        if (circularTextView != null) {
            circularTextView.setSolidColor(i);
        }
    }

    public static void setStrokeColor(CircularTextView circularTextView, int i) {
        if (circularTextView != null) {
            circularTextView.setStrokeColor(i);
        }
    }
}

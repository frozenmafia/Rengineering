package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes4.dex */
public final class aer extends FrameLayout {
    private final aeq a;

    /* renamed from: b  reason: collision with root package name */
    private float f520b;
    private final int c;

    public aer(Context context) {
        super(context, null);
        this.c = 0;
        this.a = new aeq(this);
    }

    public final void a(float f) {
        if (this.f520b != f) {
            this.f520b = f;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f520b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = measuredWidth;
        float f2 = measuredHeight;
        float f3 = (this.f520b / (f / f2)) - 1.0f;
        if (Math.abs(f3) <= 0.01f) {
            this.a.a();
            return;
        }
        if (f3 > 0.0f) {
            measuredHeight = (int) (f / this.f520b);
        } else {
            measuredWidth = (int) (f2 * this.f520b);
        }
        this.a.a();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}

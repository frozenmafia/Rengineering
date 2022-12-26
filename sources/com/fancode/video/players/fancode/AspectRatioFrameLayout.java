package com.fancode.video.players.fancode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes4.dex */
public class AspectRatioFrameLayout extends FrameLayout {
    private int ag$a;
    private float toString;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag$a = 0;
    }

    public void setAspectRatio(float f) {
        if (this.toString != f) {
            this.toString = f;
            requestLayout();
        }
    }

    public float valueOf() {
        return this.toString;
    }

    public void values() {
        this.toString = 0.0f;
    }

    public void setResizeMode(int i) {
        if (this.ag$a != i) {
            this.ag$a = i;
            requestLayout();
        }
    }

    public int ah$a() {
        return this.ag$a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.toString == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.toString / (f3 / f4)) - 1.0f;
        if (Math.abs(f5) <= 0.01f) {
            return;
        }
        int i3 = this.ag$a;
        if (i3 == 1) {
            f = this.toString;
        } else {
            if (i3 == 2) {
                f2 = this.toString;
            } else {
                if (i3 != 3) {
                    if (i3 == 4) {
                        int i4 = (int) (this.toString * f4);
                        if (i4 < measuredWidth) {
                            float f6 = i4;
                            float f7 = f3 / f6;
                            measuredWidth = (int) (f6 * f7);
                            measuredHeight = (int) (f4 * f7);
                        } else {
                            measuredWidth = i4;
                        }
                    } else if (f5 > 0.0f) {
                        f = this.toString;
                    } else {
                        f2 = this.toString;
                    }
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            measuredWidth = (int) (f4 * f2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        measuredHeight = (int) (f3 / f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}

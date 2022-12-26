package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes3.dex */
public class HeightAdjustableViewPager extends ViewPager {
    public HeightAdjustableViewPager(Context context) {
        super(context);
    }

    public HeightAdjustableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i3) {
                i3 = measuredHeight;
            }
        }
        if (i3 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}

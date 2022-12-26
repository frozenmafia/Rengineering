package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import o.removePreferenceInt;
/* loaded from: classes7.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    private int ag$a;
    private final FrameLayout.LayoutParams values;

    public NavigationRailMenuView(Context context) {
        super(context);
        this.ag$a = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.values = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        valueOf(true);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int navigationRailMenuView;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = HaptikSDK$a().getVisibleItems().size();
        if (size2 > 1 && values(HaptikSDK$c(), size2)) {
            navigationRailMenuView = toString(i, size, size2);
        } else {
            navigationRailMenuView = toString(i, size, size2, null);
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState(navigationRailMenuView, i2, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i5;
                childAt.layout(0, i5, i3 - i, measuredHeight);
                i5 = measuredHeight;
            }
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public NavigationBarItemView toString(Context context) {
        return new removePreferenceInt(context);
    }

    private int values(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.ag$a;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    private int toString(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(invoke());
        if (childAt != null) {
            i4 = valueOf(childAt, i, values(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + toString(i, i2, i3, childAt);
    }

    private int toString(int i, int i2, int i3, View view) {
        int makeMeasureSpec;
        values(i, i2, i3);
        if (view == null) {
            makeMeasureSpec = values(i, i2, i3);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != view) {
                i4 += valueOf(childAt, i, makeMeasureSpec);
            }
        }
        return i4;
    }

    private int valueOf(View view, int i, int i2) {
        if (view.getVisibility() != 8) {
            view.measure(i, i2);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(int i) {
        if (this.values.gravity != i) {
            this.values.gravity = i;
            setLayoutParams(this.values);
        }
    }

    public void setItemMinimumHeight(int i) {
        if (this.ag$a != i) {
            this.ag$a = i;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ah$a() {
        return (this.values.gravity & 112) == 48;
    }
}

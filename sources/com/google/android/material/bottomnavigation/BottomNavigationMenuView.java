package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import o.Preference$BaseSavedState$ah$a;
/* loaded from: classes5.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private int[] HaptikSDK$a;
    private final int ag$a;
    private final int ah$a;
    private final int toString;
    private boolean valueOf;
    private final int values;

    public BottomNavigationMenuView(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.values = resources.getDimensionPixelSize(Preference$BaseSavedState$ah$a.design_bottom_navigation_item_max_width);
        this.toString = resources.getDimensionPixelSize(Preference$BaseSavedState$ah$a.design_bottom_navigation_item_min_width);
        this.ah$a = resources.getDimensionPixelSize(Preference$BaseSavedState$ah$a.design_bottom_navigation_active_item_max_width);
        this.ag$a = resources.getDimensionPixelSize(Preference$BaseSavedState$ah$a.design_bottom_navigation_active_item_min_width);
        this.HaptikSDK$a = new int[5];
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        MenuBuilder HaptikSDK$a = HaptikSDK$a();
        int size = View.MeasureSpec.getSize(i);
        int size2 = HaptikSDK$a.getVisibleItems().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (values(HaptikSDK$c(), size2) && ah$a()) {
            View childAt = getChildAt(invoke());
            int i3 = this.ag$a;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.ah$a, Integer.MIN_VALUE), makeMeasureSpec);
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
            int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.toString * i4), Math.min(i3, this.ah$a));
            int i5 = size - min;
            int min2 = Math.min(i5 / (i4 == 0 ? 1 : i4), this.values);
            int i6 = i5 - (i4 * min2);
            int i7 = 0;
            while (i7 < childCount) {
                if (getChildAt(i7).getVisibility() != 8) {
                    this.HaptikSDK$a[i7] = i7 == invoke() ? min : min2;
                    if (i6 > 0) {
                        int[] iArr = this.HaptikSDK$a;
                        iArr[i7] = iArr[i7] + 1;
                        i6--;
                    }
                } else {
                    this.HaptikSDK$a[i7] = 0;
                }
                i7++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.ah$a);
            int i8 = size - (size2 * min3);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr2 = this.HaptikSDK$a;
                    iArr2[i9] = min3;
                    if (i8 > 0) {
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.HaptikSDK$a[i9] = 0;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.HaptikSDK$a[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i4 - i2;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    int i8 = (i3 - i) - i6;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i5);
                } else {
                    childAt.layout(i6, 0, childAt.getMeasuredWidth() + i6, i5);
                }
                i6 += childAt.getMeasuredWidth();
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.valueOf = z;
    }

    public boolean ah$a() {
        return this.valueOf;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public NavigationBarItemView toString(Context context) {
        return new BottomNavigationItemView(context);
    }
}

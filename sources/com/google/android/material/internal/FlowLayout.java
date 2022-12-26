package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import o.Preference;
import o.Preference$BaseSavedState$HaptikSDK$c;
/* loaded from: classes5.dex */
public class FlowLayout extends ViewGroup {
    private int ah$a;
    private int toString;
    private boolean valueOf;
    private int values;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.valueOf = false;
        valueOf(context, attributeSet);
    }

    private void valueOf(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, Preference.BaseSavedState.getSignupData.FlowLayout, 0, 0);
        this.ah$a = obtainStyledAttributes.getDimensionPixelSize(Preference.BaseSavedState.getSignupData.FlowLayout_lineSpacing, 0);
        this.toString = obtainStyledAttributes.getDimensionPixelSize(Preference.BaseSavedState.getSignupData.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void values(int i) {
        this.ah$a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void toString(int i) {
        this.toString = i;
    }

    public boolean ag$a() {
        return this.valueOf;
    }

    public void setSingleLine(boolean z) {
        this.valueOf = z;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i10 = i7;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i11 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= i6 - paddingRight || ag$a()) {
                    i5 = i11;
                } else {
                    i5 = getPaddingLeft();
                    i10 = paddingTop + this.ah$a;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.toString;
                if (i9 == getChildCount() - 1) {
                    i8 += i3;
                }
                paddingTop = i10 + measuredHeight;
                i7 = i10;
            }
        }
        setMeasuredDimension(values(size, mode, i8 + getPaddingRight()), values(size2, mode2, paddingTop + getPaddingBottom()));
    }

    private static int values(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.values = 0;
            return;
        }
        this.values = 1;
        boolean z2 = ViewCompat.getLayoutDirection(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(Preference$BaseSavedState$HaptikSDK$c.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
                    i5 = MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth();
                if (!this.valueOf && i8 + i6 + measuredWidth > i7) {
                    paddingTop = this.ah$a + i9;
                    this.values++;
                    i8 = paddingRight;
                }
                childAt.setTag(Preference$BaseSavedState$HaptikSDK$c.row_index_key, Integer.valueOf(this.values - 1));
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, paddingTop, (i7 - i8) - i6, measuredHeight);
                } else {
                    childAt.layout(i11, paddingTop, measuredWidth2, measuredHeight);
                }
                i8 += i6 + i5 + childAt.getMeasuredWidth() + this.toString;
                i9 = measuredHeight;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int HaptikSDK$a() {
        return this.values;
    }

    public int values(View view) {
        Object tag = view.getTag(Preference$BaseSavedState$HaptikSDK$c.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }
}

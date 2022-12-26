package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import o.Preference;
import o.Preference$1$ah$a;
import o.setViewId;
import o.setWidgetLayoutResource;
/* loaded from: classes5.dex */
public class FlexboxLayout extends ViewGroup implements setWidgetLayoutResource {
    private int HaptikSDK$a;
    private List<setViewId> HaptikSDK$b;
    private Preference$1$ah$a HaptikSDK$c;
    private SparseIntArray HaptikSDK$d;
    private int HaptikSDK$e;
    private int[] HaptikWebView;
    private int ag$a;
    private Drawable ah$a;
    private int ah$b;
    private int ak;
    private int getInitSettings;
    private Preference.AnonymousClass1 getSignupData;
    private int invoke;
    private int onXdkEvent;
    private Drawable toString;
    private int valueOf;
    private int values;

    @Override // o.setWidgetLayoutResource
    public int toString(View view) {
        return 0;
    }

    @Override // o.setWidgetLayoutResource
    public void toString(int i, View view) {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getInitSettings = -1;
        this.getSignupData = new Preference.AnonymousClass1(this);
        this.HaptikSDK$b = new ArrayList();
        this.HaptikSDK$c = new Preference$1$ah$a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout, i, 0);
        this.invoke = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_flexDirection, 0);
        this.ah$b = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_flexWrap, 0);
        this.HaptikSDK$e = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_justifyContent, 0);
        this.values = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_alignItems, 0);
        this.ag$a = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_alignContent, 0);
        this.getInitSettings = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.ak = i2;
            this.onXdkEvent = i2;
        }
        int i3 = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.ak = i3;
        }
        int i4 = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.onXdkEvent = i4;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.HaptikSDK$d == null) {
            this.HaptikSDK$d = new SparseIntArray(getChildCount());
        }
        if (this.getSignupData.ah$a(this.HaptikSDK$d)) {
            this.HaptikWebView = this.getSignupData.valueOf(this.HaptikSDK$d);
        }
        int i3 = this.invoke;
        if (i3 == 0 || i3 == 1) {
            valueOf(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            values(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.invoke);
        }
    }

    @Override // o.setWidgetLayoutResource
    public int valueOf() {
        return getChildCount();
    }

    @Override // o.setWidgetLayoutResource
    public View ag$a(int i) {
        return getChildAt(i);
    }

    public View valueOf(int i) {
        if (i >= 0) {
            int[] iArr = this.HaptikWebView;
            if (i >= iArr.length) {
                return null;
            }
            return getChildAt(iArr[i]);
        }
        return null;
    }

    @Override // o.setWidgetLayoutResource
    public View ah$a(int i) {
        return valueOf(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.HaptikSDK$d == null) {
            this.HaptikSDK$d = new SparseIntArray(getChildCount());
        }
        this.HaptikWebView = this.getSignupData.values(view, i, layoutParams, this.HaptikSDK$d);
        super.addView(view, i, layoutParams);
    }

    private void valueOf(int i, int i2) {
        this.HaptikSDK$b.clear();
        this.HaptikSDK$c.ah$a();
        this.getSignupData.toString(this.HaptikSDK$c, i, i2);
        this.HaptikSDK$b = this.HaptikSDK$c.toString;
        this.getSignupData.ah$a(i, i2);
        if (this.values == 3) {
            for (setViewId setviewid : this.HaptikSDK$b) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < setviewid.HaptikSDK$b; i4++) {
                    View valueOf = valueOf(setviewid.HaptikSDK$a + i4);
                    if (valueOf != null && valueOf.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) valueOf.getLayoutParams();
                        if (this.ah$b != 2) {
                            int max = Math.max(setviewid.HaptikWebView - valueOf.getBaseline(), layoutParams.topMargin);
                            i3 = Math.max(i3, valueOf.getMeasuredHeight() + max + layoutParams.bottomMargin);
                        } else {
                            i3 = Math.max(i3, valueOf.getMeasuredHeight() + layoutParams.topMargin + Math.max((setviewid.HaptikWebView - valueOf.getMeasuredHeight()) + valueOf.getBaseline(), layoutParams.bottomMargin));
                        }
                    }
                }
                setviewid.ah$a = i3;
            }
        }
        this.getSignupData.toString(i, i2, getPaddingTop() + getPaddingBottom());
        this.getSignupData.valueOf();
        ag$a(this.invoke, i, i2, this.HaptikSDK$c.ag$a);
    }

    private void values(int i, int i2) {
        this.HaptikSDK$b.clear();
        this.HaptikSDK$c.ah$a();
        this.getSignupData.valueOf(this.HaptikSDK$c, i, i2);
        this.HaptikSDK$b = this.HaptikSDK$c.toString;
        this.getSignupData.ah$a(i, i2);
        this.getSignupData.toString(i, i2, getPaddingLeft() + getPaddingRight());
        this.getSignupData.valueOf();
        ag$a(this.invoke, i, i2, this.HaptikSDK$c.ag$a);
    }

    private void ag$a(int i, int i2, int i3, int i4) {
        int HaptikSDK$b;
        int ah$b;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            HaptikSDK$b = HaptikSDK$b() + getPaddingTop() + getPaddingBottom();
            ah$b = ah$b();
        } else if (i == 2 || i == 3) {
            HaptikSDK$b = ah$b();
            ah$b = HaptikSDK$b() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < ah$b) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = ah$b;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(ah$b, i2, i4);
        } else if (mode == 1073741824) {
            if (size < ah$b) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < HaptikSDK$b) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = HaptikSDK$b;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(HaptikSDK$b, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < HaptikSDK$b) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // o.setWidgetLayoutResource
    public int ah$b() {
        int i = Integer.MIN_VALUE;
        for (setViewId setviewid : this.HaptikSDK$b) {
            i = Math.max(i, setviewid.HaptikSDK$d);
        }
        return i;
    }

    @Override // o.setWidgetLayoutResource
    public int HaptikSDK$b() {
        int i;
        int i2;
        int size = this.HaptikSDK$b.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            setViewId setviewid = this.HaptikSDK$b.get(i4);
            if (values(i4)) {
                if (getSignupData()) {
                    i2 = this.valueOf;
                } else {
                    i2 = this.HaptikSDK$a;
                }
                i3 += i2;
            }
            if (HaptikSDK$b(i4)) {
                if (getSignupData()) {
                    i = this.valueOf;
                } else {
                    i = this.HaptikSDK$a;
                }
                i3 += i;
            }
            i3 += setviewid.ah$a;
        }
        return i3;
    }

    @Override // o.setWidgetLayoutResource
    public boolean getSignupData() {
        int i = this.invoke;
        return i == 0 || i == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i5 = this.invoke;
        if (i5 == 0) {
            valueOf(layoutDirection == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            valueOf(layoutDirection != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = layoutDirection == 1;
            ag$a(this.ah$b == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = layoutDirection == 1;
            ag$a(this.ah$b == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.invoke);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void valueOf(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.valueOf(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ag$a(boolean r29, boolean r30, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.ag$a(boolean, boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.ah$a == null && this.toString == null) {
            return;
        }
        if (this.onXdkEvent == 0 && this.ak == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i = this.invoke;
        if (i == 0) {
            toString(canvas, layoutDirection == 1, this.ah$b == 2);
        } else if (i == 1) {
            toString(canvas, layoutDirection != 1, this.ah$b == 2);
        } else if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.ah$b == 2) {
                z = !z;
            }
            ag$a(canvas, z, false);
        } else if (i != 3) {
        } else {
            boolean z2 = layoutDirection == 1;
            if (this.ah$b == 2) {
                z2 = !z2;
            }
            ag$a(canvas, z2, true);
        }
    }

    private void toString(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.HaptikSDK$b.size();
        for (int i3 = 0; i3 < size; i3++) {
            setViewId setviewid = this.HaptikSDK$b.get(i3);
            for (int i4 = 0; i4 < setviewid.HaptikSDK$b; i4++) {
                int i5 = setviewid.HaptikSDK$a + i4;
                View valueOf = valueOf(i5);
                if (valueOf != null && valueOf.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) valueOf.getLayoutParams();
                    if (toString(i5, i4)) {
                        if (z) {
                            left = valueOf.getRight() + layoutParams.rightMargin;
                        } else {
                            left = (valueOf.getLeft() - layoutParams.leftMargin) - this.HaptikSDK$a;
                        }
                        ah$a(canvas, left, setviewid.a, setviewid.ah$a);
                    }
                    if (i4 == setviewid.HaptikSDK$b - 1 && (this.ak & 4) > 0) {
                        if (z) {
                            right = (valueOf.getLeft() - layoutParams.leftMargin) - this.HaptikSDK$a;
                        } else {
                            right = valueOf.getRight() + layoutParams.rightMargin;
                        }
                        ah$a(canvas, right, setviewid.a, setviewid.ah$a);
                    }
                }
            }
            if (values(i3)) {
                if (z2) {
                    i2 = setviewid.ag$a;
                } else {
                    i2 = setviewid.a - this.valueOf;
                }
                toString(canvas, paddingLeft, i2, max);
            }
            if (HaptikSDK$b(i3) && (this.onXdkEvent & 4) > 0) {
                if (z2) {
                    i = setviewid.a - this.valueOf;
                } else {
                    i = setviewid.ag$a;
                }
                toString(canvas, paddingLeft, i, max);
            }
        }
    }

    private void ag$a(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.HaptikSDK$b.size();
        for (int i3 = 0; i3 < size; i3++) {
            setViewId setviewid = this.HaptikSDK$b.get(i3);
            for (int i4 = 0; i4 < setviewid.HaptikSDK$b; i4++) {
                int i5 = setviewid.HaptikSDK$a + i4;
                View valueOf = valueOf(i5);
                if (valueOf != null && valueOf.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) valueOf.getLayoutParams();
                    if (toString(i5, i4)) {
                        if (z2) {
                            top = valueOf.getBottom() + layoutParams.bottomMargin;
                        } else {
                            top = (valueOf.getTop() - layoutParams.topMargin) - this.valueOf;
                        }
                        toString(canvas, setviewid.getInitSettings, top, setviewid.ah$a);
                    }
                    if (i4 == setviewid.HaptikSDK$b - 1 && (this.onXdkEvent & 4) > 0) {
                        if (z2) {
                            bottom = (valueOf.getTop() - layoutParams.topMargin) - this.valueOf;
                        } else {
                            bottom = valueOf.getBottom() + layoutParams.bottomMargin;
                        }
                        toString(canvas, setviewid.getInitSettings, bottom, setviewid.ah$a);
                    }
                }
            }
            if (values(i3)) {
                if (z) {
                    i2 = setviewid.HaptikSDK$e;
                } else {
                    i2 = setviewid.getInitSettings - this.HaptikSDK$a;
                }
                ah$a(canvas, i2, paddingTop, max);
            }
            if (HaptikSDK$b(i3) && (this.ak & 4) > 0) {
                if (z) {
                    i = setviewid.getInitSettings - this.HaptikSDK$a;
                } else {
                    i = setviewid.HaptikSDK$e;
                }
                ah$a(canvas, i, paddingTop, max);
            }
        }
    }

    private void ah$a(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.ah$a;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.HaptikSDK$a + i, i3 + i2);
        this.ah$a.draw(canvas);
    }

    private void toString(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.toString;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.valueOf + i2);
        this.toString.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    /* renamed from: values */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // o.setWidgetLayoutResource
    public int values() {
        return this.invoke;
    }

    public void setFlexDirection(int i) {
        if (this.invoke != i) {
            this.invoke = i;
            requestLayout();
        }
    }

    @Override // o.setWidgetLayoutResource
    public int HaptikSDK$a() {
        return this.ah$b;
    }

    public void setFlexWrap(int i) {
        if (this.ah$b != i) {
            this.ah$b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.HaptikSDK$e != i) {
            this.HaptikSDK$e = i;
            requestLayout();
        }
    }

    @Override // o.setWidgetLayoutResource
    public int ag$a() {
        return this.values;
    }

    public void setAlignItems(int i) {
        if (this.values != i) {
            this.values = i;
            requestLayout();
        }
    }

    @Override // o.setWidgetLayoutResource
    public int ah$a() {
        return this.ag$a;
    }

    public void setAlignContent(int i) {
        if (this.ag$a != i) {
            this.ag$a = i;
            requestLayout();
        }
    }

    @Override // o.setWidgetLayoutResource
    public int HaptikSDK$c() {
        return this.getInitSettings;
    }

    public void setMaxLine(int i) {
        if (this.getInitSettings != i) {
            this.getInitSettings = i;
            requestLayout();
        }
    }

    @Override // o.setWidgetLayoutResource
    public int ag$a(View view, int i, int i2) {
        int i3;
        int i4;
        if (getSignupData()) {
            i3 = toString(i, i2) ? 0 + this.HaptikSDK$a : 0;
            if ((this.ak & 4) <= 0) {
                return i3;
            }
            i4 = this.HaptikSDK$a;
        } else {
            i3 = toString(i, i2) ? 0 + this.valueOf : 0;
            if ((this.onXdkEvent & 4) <= 0) {
                return i3;
            }
            i4 = this.valueOf;
        }
        return i3 + i4;
    }

    @Override // o.setWidgetLayoutResource
    public void valueOf(setViewId setviewid) {
        if (getSignupData()) {
            if ((this.ak & 4) > 0) {
                setviewid.HaptikSDK$d += this.HaptikSDK$a;
                setviewid.toString += this.HaptikSDK$a;
            }
        } else if ((this.onXdkEvent & 4) > 0) {
            setviewid.HaptikSDK$d += this.valueOf;
            setviewid.toString += this.valueOf;
        }
    }

    @Override // o.setWidgetLayoutResource
    public int toString(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // o.setWidgetLayoutResource
    public int ah$a(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // o.setWidgetLayoutResource
    public void toString(View view, int i, int i2, setViewId setviewid) {
        if (toString(i, i2)) {
            if (getSignupData()) {
                setviewid.HaptikSDK$d += this.HaptikSDK$a;
                setviewid.toString += this.HaptikSDK$a;
                return;
            }
            setviewid.HaptikSDK$d += this.valueOf;
            setviewid.toString += this.valueOf;
        }
    }

    @Override // o.setWidgetLayoutResource
    public void setFlexLines(List<setViewId> list) {
        this.HaptikSDK$b = list;
    }

    @Override // o.setWidgetLayoutResource
    public List<setViewId> invoke() {
        return this.HaptikSDK$b;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.toString) {
            return;
        }
        this.toString = drawable;
        if (drawable != null) {
            this.valueOf = drawable.getIntrinsicHeight();
        } else {
            this.valueOf = 0;
        }
        HaptikSDK$e();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.ah$a) {
            return;
        }
        this.ah$a = drawable;
        if (drawable != null) {
            this.HaptikSDK$a = drawable.getIntrinsicWidth();
        } else {
            this.HaptikSDK$a = 0;
        }
        HaptikSDK$e();
        requestLayout();
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerVertical(int i) {
        if (i != this.ak) {
            this.ak = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.onXdkEvent) {
            this.onXdkEvent = i;
            requestLayout();
        }
    }

    private void HaptikSDK$e() {
        if (this.toString == null && this.ah$a == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean toString(int i, int i2) {
        return ag$a(i, i2) ? getSignupData() ? (this.ak & 1) != 0 : (this.onXdkEvent & 1) != 0 : getSignupData() ? (this.ak & 2) != 0 : (this.onXdkEvent & 2) != 0;
    }

    private boolean ag$a(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View valueOf = valueOf(i - i3);
            if (valueOf != null && valueOf.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean values(int i) {
        if (i < 0 || i >= this.HaptikSDK$b.size()) {
            return false;
        }
        return toString(i) ? getSignupData() ? (this.onXdkEvent & 1) != 0 : (this.ak & 1) != 0 : getSignupData() ? (this.onXdkEvent & 2) != 0 : (this.ak & 2) != 0;
    }

    private boolean toString(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.HaptikSDK$b.get(i2).ah$a() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean HaptikSDK$b(int i) {
        if (i < 0 || i >= this.HaptikSDK$b.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.HaptikSDK$b.size(); i2++) {
            if (this.HaptikSDK$b.get(i2).ah$a() > 0) {
                return false;
            }
        }
        return getSignupData() ? (this.onXdkEvent & 4) != 0 : (this.ak & 4) != 0;
    }

    /* loaded from: classes5.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayout.LayoutParams.2
            @Override // android.os.Parcelable.Creator
            /* renamed from: ah$a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ah$a */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        };
        private int HaptikSDK$a;
        private int HaptikSDK$b;
        private int HaptikSDK$c;
        private float ag$a;
        private float ah$a;
        private int ah$b;
        private boolean invoke;
        private int toString;
        private int valueOf;
        private float values;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.HaptikSDK$c = 1;
            this.values = 0.0f;
            this.ah$a = 1.0f;
            this.toString = -1;
            this.ag$a = -1.0f;
            this.ah$b = -1;
            this.HaptikSDK$a = -1;
            this.HaptikSDK$b = ViewCompat.MEASURED_SIZE_MASK;
            this.valueOf = ViewCompat.MEASURED_SIZE_MASK;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout);
            this.HaptikSDK$c = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout_layout_order, 1);
            this.values = obtainStyledAttributes.getFloat(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.ah$a = obtainStyledAttributes.getFloat(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.toString = obtainStyledAttributes.getInt(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.ag$a = obtainStyledAttributes.getFraction(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.ah$b = obtainStyledAttributes.getDimensionPixelSize(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout_layout_minWidth, -1);
            this.HaptikSDK$a = obtainStyledAttributes.getDimensionPixelSize(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout_layout_minHeight, -1);
            this.HaptikSDK$b = obtainStyledAttributes.getDimensionPixelSize(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout_layout_maxWidth, ViewCompat.MEASURED_SIZE_MASK);
            this.valueOf = obtainStyledAttributes.getDimensionPixelSize(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout_layout_maxHeight, ViewCompat.MEASURED_SIZE_MASK);
            this.invoke = obtainStyledAttributes.getBoolean(Preference.OnPreferenceChangeInternalListener.valueOf.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.HaptikSDK$c = 1;
            this.values = 0.0f;
            this.ah$a = 1.0f;
            this.toString = -1;
            this.ag$a = -1.0f;
            this.ah$b = -1;
            this.HaptikSDK$a = -1;
            this.HaptikSDK$b = ViewCompat.MEASURED_SIZE_MASK;
            this.valueOf = ViewCompat.MEASURED_SIZE_MASK;
            this.HaptikSDK$c = layoutParams.HaptikSDK$c;
            this.values = layoutParams.values;
            this.ah$a = layoutParams.ah$a;
            this.toString = layoutParams.toString;
            this.ag$a = layoutParams.ag$a;
            this.ah$b = layoutParams.ah$b;
            this.HaptikSDK$a = layoutParams.HaptikSDK$a;
            this.HaptikSDK$b = layoutParams.HaptikSDK$b;
            this.valueOf = layoutParams.valueOf;
            this.invoke = layoutParams.invoke;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.HaptikSDK$c = 1;
            this.values = 0.0f;
            this.ah$a = 1.0f;
            this.toString = -1;
            this.ag$a = -1.0f;
            this.ah$b = -1;
            this.HaptikSDK$a = -1;
            this.HaptikSDK$b = ViewCompat.MEASURED_SIZE_MASK;
            this.valueOf = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.HaptikSDK$c = 1;
            this.values = 0.0f;
            this.ah$a = 1.0f;
            this.toString = -1;
            this.ag$a = -1.0f;
            this.ah$b = -1;
            this.HaptikSDK$a = -1;
            this.HaptikSDK$b = ViewCompat.MEASURED_SIZE_MASK;
            this.valueOf = ViewCompat.MEASURED_SIZE_MASK;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int a() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int HaptikSDK$c() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int HaptikSDK$d() {
            return this.HaptikSDK$c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float valueOf() {
            return this.values;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float ah$a() {
            return this.ah$a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int ag$a() {
            return this.toString;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getInitSettings() {
            return this.ah$b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void values(int i) {
            this.ah$b = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int HaptikWebView() {
            return this.HaptikSDK$a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void ah$a(int i) {
            this.HaptikSDK$a = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getSignupData() {
            return this.HaptikSDK$b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int HaptikSDK$e() {
            return this.valueOf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean aj$a() {
            return this.invoke;
        }

        public void values(boolean z) {
            this.invoke = z;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float values() {
            return this.ag$a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int HaptikSDK$a() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int HaptikSDK$b() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int ah$b() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int invoke() {
            return this.bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.HaptikSDK$c);
            parcel.writeFloat(this.values);
            parcel.writeFloat(this.ah$a);
            parcel.writeInt(this.toString);
            parcel.writeFloat(this.ag$a);
            parcel.writeInt(this.ah$b);
            parcel.writeInt(this.HaptikSDK$a);
            parcel.writeInt(this.HaptikSDK$b);
            parcel.writeInt(this.valueOf);
            parcel.writeByte(this.invoke ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            this.HaptikSDK$c = 1;
            this.values = 0.0f;
            this.ah$a = 1.0f;
            this.toString = -1;
            this.ag$a = -1.0f;
            this.ah$b = -1;
            this.HaptikSDK$a = -1;
            this.HaptikSDK$b = ViewCompat.MEASURED_SIZE_MASK;
            this.valueOf = ViewCompat.MEASURED_SIZE_MASK;
            this.HaptikSDK$c = parcel.readInt();
            this.values = parcel.readFloat();
            this.ah$a = parcel.readFloat();
            this.toString = parcel.readInt();
            this.ag$a = parcel.readFloat();
            this.ah$b = parcel.readInt();
            this.HaptikSDK$a = parcel.readInt();
            this.HaptikSDK$b = parcel.readInt();
            this.valueOf = parcel.readInt();
            this.invoke = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}

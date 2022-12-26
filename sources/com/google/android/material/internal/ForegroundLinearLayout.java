package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import o.Preference;
import o.PreferenceFragment;
/* loaded from: classes7.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {
    private final Rect HaptikSDK$b;
    private int ag$a;
    protected boolean ah$a;
    boolean toString;
    private final Rect valueOf;
    private Drawable values;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.HaptikSDK$b = new Rect();
        this.valueOf = new Rect();
        this.ag$a = 119;
        this.ah$a = true;
        this.toString = false;
        TypedArray scrollToPreferenceObserver = PreferenceFragment.ScrollToPreferenceObserver.toString(context, attributeSet, Preference.BaseSavedState.getSignupData.ForegroundLinearLayout, i, 0, new int[0]);
        this.ag$a = scrollToPreferenceObserver.getInt(Preference.BaseSavedState.getSignupData.ForegroundLinearLayout_android_foregroundGravity, this.ag$a);
        Drawable drawable = scrollToPreferenceObserver.getDrawable(Preference.BaseSavedState.getSignupData.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.ah$a = scrollToPreferenceObserver.getBoolean(Preference.BaseSavedState.getSignupData.ForegroundLinearLayout_foregroundInsidePadding, true);
        scrollToPreferenceObserver.recycle();
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.ag$a;
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.ag$a != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.ag$a = i;
            if (i == 119 && this.values != null) {
                this.values.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.values;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.values;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.values;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.values.setState(getDrawableState());
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.values;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.values);
            }
            this.values = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.ag$a == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.values;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.toString = z | this.toString;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.toString = true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.values;
        if (drawable != null) {
            if (this.toString) {
                this.toString = false;
                Rect rect = this.HaptikSDK$b;
                Rect rect2 = this.valueOf;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.ah$a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.ag$a, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.values;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }
}

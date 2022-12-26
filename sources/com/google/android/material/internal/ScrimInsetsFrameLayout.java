package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import o.Preference;
import o.Preference$BaseSavedState$HaptikSDK$e;
import o.PreferenceFragment;
/* loaded from: classes7.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {
    Drawable ag$a;
    private boolean ah$a;
    Rect toString;
    private boolean valueOf;
    private Rect values;

    protected void ag$a(WindowInsetsCompat windowInsetsCompat) {
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.values = new Rect();
        this.valueOf = true;
        this.ah$a = true;
        TypedArray scrollToPreferenceObserver = PreferenceFragment.ScrollToPreferenceObserver.toString(context, attributeSet, Preference.BaseSavedState.getSignupData.ScrimInsetsFrameLayout, i, Preference$BaseSavedState$HaptikSDK$e.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.ag$a = scrollToPreferenceObserver.getDrawable(Preference.BaseSavedState.getSignupData.ScrimInsetsFrameLayout_insetForeground);
        scrollToPreferenceObserver.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ScrimInsetsFrameLayout.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                if (ScrimInsetsFrameLayout.this.toString == null) {
                    ScrimInsetsFrameLayout.this.toString = new Rect();
                }
                ScrimInsetsFrameLayout.this.toString.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                ScrimInsetsFrameLayout.this.ag$a(windowInsetsCompat);
                ScrimInsetsFrameLayout.this.setWillNotDraw(!windowInsetsCompat.hasSystemWindowInsets() || ScrimInsetsFrameLayout.this.ag$a == null);
                ViewCompat.postInvalidateOnAnimation(ScrimInsetsFrameLayout.this);
                return windowInsetsCompat.consumeSystemWindowInsets();
            }
        });
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.ag$a = drawable;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.valueOf = z;
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.ah$a = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.toString == null || this.ag$a == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.valueOf) {
            this.values.set(0, 0, width, this.toString.top);
            this.ag$a.setBounds(this.values);
            this.ag$a.draw(canvas);
        }
        if (this.ah$a) {
            this.values.set(0, height - this.toString.bottom, width, height);
            this.ag$a.setBounds(this.values);
            this.ag$a.draw(canvas);
        }
        this.values.set(0, this.toString.top, this.toString.left, height - this.toString.bottom);
        this.ag$a.setBounds(this.values);
        this.ag$a.draw(canvas);
        this.values.set(width - this.toString.right, this.toString.top, width, height - this.toString.bottom);
        this.ag$a.setBounds(this.values);
        this.ag$a.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.ag$a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.ag$a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}

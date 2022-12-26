package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import o.PreferenceFragmentCompat;
import o.onPreferenceChange;
import o.openPreferenceHeader;
/* loaded from: classes5.dex */
public class TabLayout$ag$a extends LinearLayout {
    float ag$a;
    int ah$a;
    ValueAnimator toString;
    final /* synthetic */ TabLayout valueOf;
    private int values;

    public static /* synthetic */ void ah$a(TabLayout$ag$a tabLayout$ag$a) {
        tabLayout$ag$a.valueOf();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabLayout$ag$a(TabLayout tabLayout, Context context) {
        super(context);
        this.valueOf = tabLayout;
        this.ah$a = -1;
        this.values = -1;
        setWillNotDraw(false);
    }

    public void ag$a(int i) {
        Rect bounds = this.valueOf.extraCallback.getBounds();
        this.valueOf.extraCallback.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public boolean ah$a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getWidth() <= 0) {
                return true;
            }
        }
        return false;
    }

    public void toString(int i, float f) {
        ValueAnimator valueAnimator = this.toString;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.toString.cancel();
        }
        this.ah$a = i;
        this.ag$a = f;
        toString(getChildAt(i), getChildAt(this.ah$a + 1), this.ag$a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT >= 23 || this.values == i) {
            return;
        }
        requestLayout();
        this.values = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        boolean z = true;
        if (this.valueOf.HaptikSDK$c == 1 || this.valueOf.HaptikSDK$a == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (((int) PreferenceFragmentCompat.DividerDecoration.values(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                this.valueOf.HaptikSDK$c = 0;
                this.valueOf.values(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.toString;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueOf(false, this.ah$a, -1);
        } else {
            valueOf();
        }
    }

    public void valueOf() {
        openPreferenceHeader openpreferenceheader;
        View childAt = getChildAt(this.ah$a);
        openpreferenceheader = this.valueOf.newSession;
        TabLayout tabLayout = this.valueOf;
        openpreferenceheader.valueOf(tabLayout, childAt, tabLayout.extraCallback);
    }

    public void toString(View view, View view2, float f) {
        openPreferenceHeader openpreferenceheader;
        if (view != null && view.getWidth() > 0) {
            openpreferenceheader = this.valueOf.newSession;
            TabLayout tabLayout = this.valueOf;
            openpreferenceheader.toString(tabLayout, view, view2, f, tabLayout.extraCallback);
        } else {
            this.valueOf.extraCallback.setBounds(-1, this.valueOf.extraCallback.getBounds().top, -1, this.valueOf.extraCallback.getBounds().bottom);
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void toString(int i, int i2) {
        ValueAnimator valueAnimator = this.toString;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.toString.cancel();
        }
        valueOf(true, i, i2);
    }

    private void valueOf(boolean z, final int i, int i2) {
        final View childAt = getChildAt(this.ah$a);
        final View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            valueOf();
            return;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout$ag$a.1
            {
                TabLayout$ag$a.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TabLayout$ag$a.this.toString(childAt, childAt2, valueAnimator.getAnimatedFraction());
            }
        };
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.toString = valueAnimator;
            valueAnimator.setInterpolator(onPreferenceChange.values);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.tabs.TabLayout$ag$a.2
                {
                    TabLayout$ag$a.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    TabLayout$ag$a.this.ah$a = i;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    TabLayout$ag$a.this.ah$a = i;
                }
            });
            valueAnimator.start();
            return;
        }
        this.toString.removeAllUpdateListeners();
        this.toString.addUpdateListener(animatorUpdateListener);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int height = this.valueOf.extraCallback.getBounds().height();
        if (height < 0) {
            height = this.valueOf.extraCallback.getIntrinsicHeight();
        }
        int i4 = this.valueOf.a;
        int i5 = 0;
        if (i4 == 0) {
            i5 = getHeight() - height;
            height = getHeight();
        } else if (i4 == 1) {
            i5 = (getHeight() - height) / 2;
            height = (getHeight() + height) / 2;
        } else if (i4 != 2) {
            height = i4 != 3 ? 0 : getHeight();
        }
        if (this.valueOf.extraCallback.getBounds().width() > 0) {
            Rect bounds = this.valueOf.extraCallback.getBounds();
            this.valueOf.extraCallback.setBounds(bounds.left, i5, bounds.right, height);
            Drawable drawable = this.valueOf.extraCallback;
            i = this.valueOf.receiveFile;
            if (i != 0) {
                drawable = DrawableCompat.wrap(drawable);
                if (Build.VERSION.SDK_INT == 21) {
                    i3 = this.valueOf.receiveFile;
                    drawable.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
                } else {
                    i2 = this.valueOf.receiveFile;
                    DrawableCompat.setTint(drawable, i2);
                }
            } else if (Build.VERSION.SDK_INT == 21) {
                drawable.setColorFilter(null);
            } else {
                DrawableCompat.setTintList(drawable, null);
            }
            drawable.draw(canvas);
        }
        super.draw(canvas);
    }
}

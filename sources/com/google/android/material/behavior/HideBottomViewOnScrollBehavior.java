package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.onPreferenceChange;
/* loaded from: classes7.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int ag$a;
    private int ah$a;
    private int valueOf;
    private ViewPropertyAnimator values;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
        this.ag$a = 0;
        this.valueOf = 2;
        this.ah$a = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag$a = 0;
        this.valueOf = 2;
        this.ah$a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.ag$a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public void values(V v, int i) {
        this.ah$a = i;
        if (this.valueOf == 1) {
            v.setTranslationY(this.ag$a + i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            ah$a(v);
        } else if (i2 < 0) {
            toString(v);
        }
    }

    public boolean values() {
        return this.valueOf == 2;
    }

    public void toString(V v) {
        values((HideBottomViewOnScrollBehavior<V>) v, true);
    }

    public void values(V v, boolean z) {
        if (values()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.values;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.valueOf = 2;
        if (z) {
            valueOf(v, 0, 225L, onPreferenceChange.ag$a);
        } else {
            v.setTranslationY(0);
        }
    }

    public boolean ah$a() {
        return this.valueOf == 1;
    }

    public void ah$a(V v) {
        valueOf(v, true);
    }

    public void valueOf(V v, boolean z) {
        if (ah$a()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.values;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.valueOf = 1;
        int i = this.ag$a + this.ah$a;
        if (z) {
            valueOf(v, i, 175L, onPreferenceChange.ah$a);
        } else {
            v.setTranslationY(i);
        }
    }

    private void valueOf(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.values = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.values = null;
            }
        });
    }
}

package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import o.Preference;
import o.putBoolean;
@Deprecated
/* loaded from: classes7.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    private final putBoolean ag$a;
    private final putBoolean ah$a;

    public FabTransformationScrimBehavior() {
        this.ag$a = new putBoolean(75L, 150L);
        this.ah$a = new putBoolean(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag$a = new putBoolean(75L, 150L);
        this.ah$a = new putBoolean(0L, 150L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet values(View view, final View view2, final boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ah$a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        Preference.BaseSavedState.AnonymousClass1.toString(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationScrimBehavior.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z) {
                    return;
                }
                view2.setVisibility(4);
            }
        });
        return animatorSet;
    }

    private void ah$a(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        putBoolean putboolean = z ? this.ag$a : this.ah$a;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        putboolean.values(ofFloat);
        list.add(ofFloat);
    }
}

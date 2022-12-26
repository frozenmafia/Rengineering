package com.swmansion.reanimated.transitions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
/* loaded from: classes7.dex */
public class Scale extends Visibility {
    static final String PROPNAME_SCALE_X = "scale:scaleX";
    static final String PROPNAME_SCALE_Y = "scale:scaleY";

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        transitionValues.values.put(PROPNAME_SCALE_X, Float.valueOf(transitionValues.view.getScaleX()));
        transitionValues.values.put(PROPNAME_SCALE_Y, Float.valueOf(transitionValues.view.getScaleY()));
    }

    public Scale setDisappearedScale(float f) {
        if (f >= 0.0f) {
            return this;
        }
        throw new IllegalArgumentException("disappearedScale cannot be negative!");
    }

    private Animator createAnimation(final View view, float f, float f2, TransitionValues transitionValues) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        float f3 = scaleX * f;
        float f4 = f * scaleY;
        if (transitionValues != null) {
            Float f5 = (Float) transitionValues.values.get(PROPNAME_SCALE_X);
            Float f6 = (Float) transitionValues.values.get(PROPNAME_SCALE_Y);
            if (f5 != null && f5.floatValue() != scaleX) {
                f3 = f5.floatValue();
            }
            if (f6 != null && f6.floatValue() != scaleY) {
                f4 = f6.floatValue();
            }
        }
        view.setScaleX(f3);
        view.setScaleY(f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f3, scaleX * f2), ObjectAnimator.ofFloat(view, View.SCALE_Y, f4, f2 * scaleY));
        addListener(new TransitionListenerAdapter() { // from class: com.swmansion.reanimated.transitions.Scale.1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
                transition.removeListener(this);
            }
        });
        return animatorSet;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimation(view, 0.0f, 1.0f, transitionValues);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimation(view, 1.0f, 0.0f, transitionValues);
    }
}

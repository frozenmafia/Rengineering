package com.app.dream11.spotlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.app.dream11.spotlight.interfaces.AnimationFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class AnimatorAnimationFactory implements AnimationFactory {
    private static final String ALPHA = "alpha";
    private static final float INVISIBLE = 0.0f;
    private static final float VISIBLE = 1.0f;
    private final AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();

    @Override // com.app.dream11.spotlight.interfaces.AnimationFactory
    public void fadeInView(View view, long j, final AnimationFactory.AnimationStartListener animationStartListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(j).addListener(new AnimatorListenerAdapter() { // from class: com.app.dream11.spotlight.AnimatorAnimationFactory.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                animationStartListener.onAnimationStart();
            }
        });
        ofFloat.start();
    }

    @Override // com.app.dream11.spotlight.interfaces.AnimationFactory
    public void fadeOutView(View view, long j, final AnimationFactory.AnimationEndListener animationEndListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ALPHA, 0.0f);
        ofFloat.setDuration(j).addListener(new AnimatorListenerAdapter() { // from class: com.app.dream11.spotlight.AnimatorAnimationFactory.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animationEndListener.onAnimationEnd();
            }
        });
        ofFloat.start();
    }

    @Override // com.app.dream11.spotlight.interfaces.AnimationFactory
    public void animateTargetToPoint(ShowcaseView showcaseView, Point point, final AnimationFactory.AnimationListener animationListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofInt(showcaseView, "showcaseX", point.x), ObjectAnimator.ofInt(showcaseView, "showcaseY", point.y));
        animatorSet.setInterpolator(this.interpolator);
        animatorSet.setDuration(OverlayManger.animationTime);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.app.dream11.spotlight.AnimatorAnimationFactory.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                animationListener.onAnimationEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                animationListener.onAnimationStart();
            }
        });
        animatorSet.start();
    }
}

package com.app.dream11.spotlight.interfaces;

import android.graphics.Point;
import android.view.View;
import com.app.dream11.spotlight.ShowcaseView;
/* loaded from: classes3.dex */
public interface AnimationFactory {

    /* loaded from: classes3.dex */
    public interface AnimationEndListener {
        void onAnimationEnd();
    }

    /* loaded from: classes3.dex */
    public interface AnimationListener {
        void onAnimationEnd();

        void onAnimationStart();
    }

    /* loaded from: classes3.dex */
    public interface AnimationStartListener {
        void onAnimationStart();
    }

    void animateTargetToPoint(ShowcaseView showcaseView, Point point, AnimationListener animationListener);

    void fadeInView(View view, long j, AnimationStartListener animationStartListener);

    void fadeOutView(View view, long j, AnimationEndListener animationEndListener);
}

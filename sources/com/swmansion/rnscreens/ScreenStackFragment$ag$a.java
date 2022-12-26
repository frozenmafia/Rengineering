package com.swmansion.rnscreens;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.swmansion.rnscreens.ScreenStackFragment;
import o.runAnimators;
/* loaded from: classes5.dex */
final class ScreenStackFragment$ag$a extends CoordinatorLayout {
    private final Animation.AnimationListener ag$a;
    private final ScreenFragment ah$a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenStackFragment$ag$a(Context context, ScreenFragment screenFragment) {
        super(context);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(screenFragment, "mFragment");
        this.ah$a = screenFragment;
        this.ag$a = new Animation.AnimationListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$ag$a$ag$a
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                runAnimators.ag$a(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                ScreenFragment screenFragment2;
                runAnimators.ag$a(animation, "animation");
                screenFragment2 = ScreenStackFragment$ag$a.this.ah$a;
                screenFragment2.invoke();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ScreenFragment screenFragment2;
                runAnimators.ag$a(animation, "animation");
                screenFragment2 = ScreenStackFragment$ag$a.this.ah$a;
                screenFragment2.HaptikSDK$b();
            }
        };
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        runAnimators.ag$a(animation, "animation");
        ScreenStackFragment.values valuesVar = new ScreenStackFragment.values(this.ah$a);
        valuesVar.setDuration(animation.getDuration());
        if ((animation instanceof AnimationSet) && !this.ah$a.isRemoving()) {
            ((AnimationSet) animation).addAnimation(valuesVar);
            animation.setAnimationListener(this.ag$a);
            super.startAnimation(animation);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(animation);
        animationSet.addAnimation(valuesVar);
        animationSet.setAnimationListener(this.ag$a);
        super.startAnimation(animationSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }
}

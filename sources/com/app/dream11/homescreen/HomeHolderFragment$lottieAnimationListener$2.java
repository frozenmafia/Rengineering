package com.app.dream11.homescreen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class HomeHolderFragment$lottieAnimationListener$2 extends Lambda implements Styleable.ArcMotion<AnonymousClass1> {
    final /* synthetic */ HomeHolderFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeHolderFragment$lottieAnimationListener$2(HomeHolderFragment homeHolderFragment) {
        super(0);
        this.this$0 = homeHolderFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.app.dream11.homescreen.HomeHolderFragment$lottieAnimationListener$2$1] */
    @Override // o.Styleable.ArcMotion
    public final AnonymousClass1 invoke() {
        final HomeHolderFragment homeHolderFragment = this.this$0;
        return new AnimatorListenerAdapter() { // from class: com.app.dream11.homescreen.HomeHolderFragment$lottieAnimationListener$2.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                runAnimators.ag$a(animator, "animation");
                super.onAnimationCancel(animator);
                HomeHolderFragment.ah$a(HomeHolderFragment.this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                runAnimators.ag$a(animator, "animation");
                super.onAnimationEnd(animator);
                HomeHolderFragment.ah$a(HomeHolderFragment.this);
            }
        };
    }
}

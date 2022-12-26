package com.apxor.androidsdk.plugins.realtimeui.utils;

import android.animation.Animator;
/* loaded from: classes3.dex */
public abstract class a implements Animator.AnimatorListener {
    public boolean a;

    public void a(boolean z) {
        this.a = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}

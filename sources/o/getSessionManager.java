package o;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import o.MediaButtonReceiver;
/* loaded from: classes7.dex */
public abstract class getSessionManager extends MediaSessionManager implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    protected float ag$a;
    protected float ah$a;
    protected float toString;
    protected ObjectAnimator valueOf;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }

    public abstract void valueOf();

    public getSessionManager(MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback, float f, float f2, getMediaButtonReceiverComponent getmediabuttonreceivercomponent, View view, float f3, float f4, long j) {
        super(mediaButtonConnectionCallback, f, f2, getmediabuttonreceivercomponent, view);
        this.ag$a = f3;
        this.ah$a = f4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phase", 0.0f, 1.0f);
        this.valueOf = ofFloat;
        ofFloat.setDuration(j);
        this.valueOf.addUpdateListener(this);
        this.valueOf.addListener(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.valueOf.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        try {
            valueOf();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        try {
            valueOf();
        } catch (IllegalArgumentException unused) {
        }
    }
}

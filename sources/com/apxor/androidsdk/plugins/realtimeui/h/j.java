package com.apxor.androidsdk.plugins.realtimeui.h;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* loaded from: classes3.dex */
class j {
    private final ValueAnimator a = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* loaded from: classes3.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    interface b {
        void a(float f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ValueAnimator a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j a(int i) {
        this.a.setRepeatCount(i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j a(long j) {
        this.a.setStartDelay(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j a(TimeInterpolator timeInterpolator) {
        this.a.setInterpolator(timeInterpolator);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j a(b bVar) {
        this.a.addUpdateListener(new a(bVar));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j b(long j) {
        this.a.setDuration(j);
        return this;
    }
}

package com.appsamurai.storyly.util.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.LinearInterpolator;
import com.appsamurai.storyly.util.ui.h;
import com.appsamurai.storyly.util.ui.h$ag$a;
import com.google.android.exoplayer2.ExoPlayer;
import java.util.Objects;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class h$ag$a extends h.values {
    public final /* synthetic */ h ag$a;
    public final ValueAnimator toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h$ag$a(final h hVar) {
        super(hVar);
        runAnimators.ag$a(hVar, "this$0");
        this.ag$a = hVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.getAccessibilityDelegateInternal
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h$ag$a.toString(h.this, this, valueAnimator);
            }
        });
        setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        this.toString = ofFloat;
    }

    @Override // com.appsamurai.storyly.util.ui.h.values
    public AnimatorSet ag$a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(this.ag$a.HaptikSDK$a, this.toString);
        return animatorSet;
    }

    @Override // com.appsamurai.storyly.util.ui.h.values
    public void ag$a(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        runAnimators.ag$a(canvas, "canvas");
        h hVar = this.ag$a;
        float f = 360;
        float f2 = (hVar.HaptikSDK$c + 270.0f) % f;
        if (!(hVar.ah$b() == 0.0f)) {
            h.ah$a(this.ag$a, f2, canvas);
        }
        float ah$b = this.ag$a.ah$b();
        h hVar2 = this.ag$a;
        canvas.drawArc(hVar2.ak, f2 + ah$b, f - hVar2.ah$b(), false, this.ag$a.ak$b);
    }

    @Override // com.appsamurai.storyly.util.ui.h.values
    public void ah$a() {
        this.ag$a.ICustomTabsService = 360.0f;
        if (this.valueOf.HaptikWebView) {
            return;
        }
        ag$a().start();
    }

    public static final void toString(h hVar, h$ag$a h_ag_a, ValueAnimator valueAnimator) {
        runAnimators.ag$a(hVar, "this$0");
        runAnimators.ag$a(h_ag_a, "this$1");
        if (hVar.getInitSettings) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            hVar.HaptikSDK$c = ((Float) animatedValue).floatValue();
            float f = hVar.ICustomTabsService;
            if (f >= 0.0f) {
                hVar.ICustomTabsService = f - 1.0f;
            } else {
                hVar.setAnimating(false);
            }
            hVar.invalidate();
            return;
        }
        h_ag_a.values();
    }

    @Override // com.appsamurai.storyly.util.ui.h.values
    public void values() {
        this.toString.removeAllUpdateListeners();
        this.toString.removeAllListeners();
        this.ag$a.HaptikSDK$a.removeAllListeners();
        ag$a().cancel();
        this.ag$a.invalidate();
    }
}

package com.appsamurai.storyly.storylypresenter;

import android.view.animation.ScaleAnimation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.TranslationAnimationCreator;
import o.getCurrentDisplaySizeFromWorkarounds;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class x extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public x(Object obj) {
        super(0, obj, o.class, "onSwipeDownComplete", "onSwipeDownComplete()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        o oVar = (o) this.receiver;
        TranslationAnimationCreator.TransitionPositionListener<Object>[] transitionPositionListenerArr = o.values;
        oVar.HaptikSDK$e().invoke(Boolean.TRUE);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, oVar.getWidth() / 2, 0, oVar.getHeight());
        scaleAnimation.setAnimationListener(new getCurrentDisplaySizeFromWorkarounds(oVar));
        scaleAnimation.setDuration(200L);
        setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        oVar.startAnimation(scaleAnimation);
        return setAnimationMatrix.ag$a;
    }
}

package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.TranslationAnimationCreator;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class y extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public y(Object obj) {
        super(0, obj, o.class, "onSwipeDownCancel", "onSwipeDownCancel()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        TranslationAnimationCreator.TransitionPositionListener<Object>[] transitionPositionListenerArr = o.values;
        ((o) this.receiver).HaptikSDK$c();
        return setAnimationMatrix.ag$a;
    }
}

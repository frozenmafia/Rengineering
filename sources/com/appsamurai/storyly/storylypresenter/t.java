package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.TranslationAnimationCreator;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class t extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public t(Object obj) {
        super(0, obj, o.class, "onPreviousClick", "onPreviousClick()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        TranslationAnimationCreator.TransitionPositionListener<Object>[] transitionPositionListenerArr = o.values;
        ((o) this.receiver).ah$b();
        return setAnimationMatrix.ag$a;
    }
}

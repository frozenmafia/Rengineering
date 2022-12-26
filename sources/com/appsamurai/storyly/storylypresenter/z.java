package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.TranslationAnimationCreator;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class z extends FunctionReferenceImpl implements Styleable.ChangeBounds<Float, setAnimationMatrix> {
    public z(Object obj) {
        super(1, obj, o.class, "onSwipeDownMove", "onSwipeDownMove(F)V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Float f) {
        float floatValue = f.floatValue();
        o oVar = (o) this.receiver;
        TranslationAnimationCreator.TransitionPositionListener<Object>[] transitionPositionListenerArr = o.values;
        oVar.extraCallbackWithResult();
        oVar.aj$a().invoke(Float.valueOf(floatValue));
        oVar.setY(floatValue);
        return setAnimationMatrix.ag$a;
    }
}

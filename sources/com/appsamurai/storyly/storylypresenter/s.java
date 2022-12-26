package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.TranslationAnimationCreator;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class s extends FunctionReferenceImpl implements Styleable.ChangeBounds<Boolean, setAnimationMatrix> {
    public s(Object obj) {
        super(1, obj, o.class, "onNextClick", "onNextClick(Z)V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        TranslationAnimationCreator.TransitionPositionListener<Object>[] transitionPositionListenerArr = o.values;
        ((o) this.receiver).values(booleanValue);
        return setAnimationMatrix.ag$a;
    }
}

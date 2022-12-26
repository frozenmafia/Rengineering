package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.TranslationAnimationCreator;
import o.getUniqueKey;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 extends FunctionReferenceImpl implements Styleable.ChangeBounds<Long, setAnimationMatrix> {
    public q0(Object obj) {
        super(1, obj, o.class, "onItemSessionTimeUpdated", "onItemSessionTimeUpdated(Ljava/lang/Long;)V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Long l) {
        Long l2 = l;
        o oVar = (o) this.receiver;
        TranslationAnimationCreator.TransitionPositionListener<Object>[] transitionPositionListenerArr = o.values;
        oVar.getClass();
        if (l2 != null) {
            l2.longValue();
            getUniqueKey getuniquekey = oVar.aj$a;
            if (getuniquekey != null) {
                getuniquekey.a = l2.longValue();
            }
        }
        return setAnimationMatrix.ag$a;
    }
}

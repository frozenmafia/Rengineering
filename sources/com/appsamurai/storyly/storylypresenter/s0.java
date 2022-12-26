package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Transition;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 extends FunctionReferenceImpl implements Transition<Long, Long, setAnimationMatrix> {
    public s0(Object obj) {
        super(2, obj, o.class, "onItemTimeUpdated", "onItemTimeUpdated(Ljava/lang/Long;Ljava/lang/Long;)V", 0);
    }

    @Override // o.Transition
    public setAnimationMatrix invoke(Long l, Long l2) {
        o.ag$a((o) this.receiver, l, l2);
        return setAnimationMatrix.ag$a;
    }
}

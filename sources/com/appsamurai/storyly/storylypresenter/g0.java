package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public g0(Object obj) {
        super(0, obj, o.class, "onSeekEnded", "onSeekEnded()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        o.HaptikSDK$b((o) this.receiver);
        return setAnimationMatrix.ag$a;
    }
}

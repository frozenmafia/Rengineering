package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public f0(Object obj) {
        super(0, obj, o.class, "onSeekStarted", "onSeekStarted()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        o.HaptikSDK$e((o) this.receiver);
        return setAnimationMatrix.ag$a;
    }
}

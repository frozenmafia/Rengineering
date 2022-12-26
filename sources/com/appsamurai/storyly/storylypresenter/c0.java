package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public c0(Object obj) {
        super(0, obj, o.class, "pause", "pause()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        ((o) this.receiver).extraCallbackWithResult();
        return setAnimationMatrix.ag$a;
    }
}

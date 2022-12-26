package com.appsamurai.storyly.storylypresenter;

import com.appsamurai.storyly.storylypresenter.o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class p extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public p(Object obj) {
        super(0, obj, o.class, "onPause", "onPause()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        o oVar = (o) this.receiver;
        if (oVar.getInitSettings == o.a.Started) {
            oVar.extraCallbackWithResult();
        }
        return setAnimationMatrix.ag$a;
    }
}

package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public x0(Object obj) {
        super(0, obj, o.class, "resume", "resume()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        ((o) this.receiver).onRelationshipValidationResult();
        return setAnimationMatrix.ag$a;
    }
}

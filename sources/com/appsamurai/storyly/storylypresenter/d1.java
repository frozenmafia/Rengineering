package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class d1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(o oVar) {
        super(0);
        this.a = oVar;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        this.a.extraCallbackWithResult();
        return setAnimationMatrix.ag$a;
    }
}

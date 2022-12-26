package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class f extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar) {
        super(0);
        this.a = eVar;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        this.a.ah$a().invoke();
        return setAnimationMatrix.ag$a;
    }
}

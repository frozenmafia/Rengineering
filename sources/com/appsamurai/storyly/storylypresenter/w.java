package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class w extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public w(Object obj) {
        super(0, obj, o.class, "onToggleControls", "onToggleControls()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        o.HaptikWebView((o) this.receiver);
        return setAnimationMatrix.ag$a;
    }
}

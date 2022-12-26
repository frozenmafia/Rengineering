package com.appsamurai.storyly;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class i extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public i(Object obj) {
        super(0, obj, StorylyView.class, "onStorylyDismissed", "onStorylyDismissed()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        StorylyView.HaptikWebView((StorylyView) this.receiver);
        return setAnimationMatrix.ag$a;
    }
}

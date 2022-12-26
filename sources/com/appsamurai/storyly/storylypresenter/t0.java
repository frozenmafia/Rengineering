package com.appsamurai.storyly.storylypresenter;

import com.appsamurai.storyly.external.StorylyLoadingView;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class t0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(o oVar) {
        super(0);
        this.a = oVar;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        StorylyLoadingView storylyLoadingView = this.a.asBinder;
        if (storylyLoadingView == null) {
            runAnimators.valueOf("loadingView");
            storylyLoadingView = null;
        }
        storylyLoadingView.values();
        return setAnimationMatrix.ag$a;
    }
}

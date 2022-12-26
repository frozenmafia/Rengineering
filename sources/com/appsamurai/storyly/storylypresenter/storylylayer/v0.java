package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class v0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(dispatchNestedScroll dispatchnestedscroll) {
        super(0);
        this.a = dispatchnestedscroll;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        dispatchNestedScroll dispatchnestedscroll = this.a;
        dispatchnestedscroll.onPostMessage = true;
        dispatchnestedscroll.ah$a().invoke();
        return setAnimationMatrix.ag$a;
    }
}

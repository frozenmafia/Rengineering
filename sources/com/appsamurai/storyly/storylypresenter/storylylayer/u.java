package com.appsamurai.storyly.storylypresenter.storylylayer;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class u extends Lambda implements Styleable.ChangeBounds<List<f1>, setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(dispatchNestedScroll dispatchnestedscroll) {
        super(1);
        this.a = dispatchnestedscroll;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(List<f1> list) {
        List<f1> list2 = list;
        runAnimators.ag$a(list2, "it");
        dispatchNestedScroll dispatchnestedscroll = this.a;
        for (f1 f1Var : list2) {
            dispatchnestedscroll.ah$a(f1Var);
        }
        return setAnimationMatrix.ag$a;
    }
}

package com.appsamurai.storyly.storylypresenter.storylylayer;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class t$c extends Lambda implements Styleable.ChangeBounds<List<f1>, setAnimationMatrix> {
    public final /* synthetic */ f1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t$c(f1 f1Var) {
        super(1);
        this.a = f1Var;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(List<f1> list) {
        List<f1> list2 = list;
        runAnimators.ag$a(list2, "it");
        list2.add(this.a);
        return setAnimationMatrix.ag$a;
    }
}

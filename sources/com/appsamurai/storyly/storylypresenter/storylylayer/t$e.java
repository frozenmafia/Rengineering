package com.appsamurai.storyly.storylypresenter.storylylayer;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class t$e extends Lambda implements Styleable.ChangeBounds<List<f1>, setAnimationMatrix> {
    public static final t$e a = new t$e();

    public t$e() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(List<f1> list) {
        List<f1> list2 = list;
        runAnimators.ag$a(list2, "it");
        for (f1 f1Var : list2) {
            f1Var.valueOf();
        }
        list2.clear();
        return setAnimationMatrix.ag$a;
    }
}

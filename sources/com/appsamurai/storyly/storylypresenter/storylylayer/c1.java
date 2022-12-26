package com.appsamurai.storyly.storylypresenter.storylylayer;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class c1 extends Lambda implements Styleable.ChangeBounds<Map<String, f1>, setAnimationMatrix> {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(int i) {
        super(1);
        this.a = i;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Map<String, f1> map) {
        Map<String, f1> map2 = map;
        runAnimators.ag$a(map2, "it");
        Collection<f1> values = map2.values();
        int i = this.a;
        for (f1 f1Var : values) {
            f1Var.values(i);
        }
        return setAnimationMatrix.ag$a;
    }
}

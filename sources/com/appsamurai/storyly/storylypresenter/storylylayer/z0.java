package com.appsamurai.storyly.storylypresenter.storylylayer;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class z0 extends Lambda implements Styleable.ChangeBounds<Map<String, f1>, setAnimationMatrix> {
    public static final z0 a = new z0();

    public z0() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Map<String, f1> map) {
        Map<String, f1> map2 = map;
        runAnimators.ag$a(map2, "it");
        for (f1 f1Var : map2.values()) {
            f1Var.ah$b();
        }
        return setAnimationMatrix.ag$a;
    }
}

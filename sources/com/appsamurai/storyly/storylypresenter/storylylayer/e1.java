package com.appsamurai.storyly.storylypresenter.storylylayer;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class e1 extends Lambda implements Styleable.ChangeBounds<Map<String, f1>, setAnimationMatrix> {
    public static final e1 a = new e1();

    public e1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Map<String, f1> map) {
        Map<String, f1> map2 = map;
        runAnimators.ag$a(map2, "it");
        for (f1 f1Var : map2.values()) {
            f1Var.valueOf();
        }
        return setAnimationMatrix.ag$a;
    }
}

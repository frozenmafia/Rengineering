package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 extends FunctionReferenceImpl implements Styleable.ChangeBounds<Integer, setAnimationMatrix> {
    public e0(Object obj) {
        super(1, obj, o.class, "onSeek", "onSeek(I)V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Integer num) {
        o.ag$a((o) this.receiver, num.intValue());
        return setAnimationMatrix.ag$a;
    }
}

package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class w0 extends Lambda implements Styleable.ChangeBounds<Integer, setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d2 f154b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(dispatchNestedScroll dispatchnestedscroll, d2 d2Var) {
        super(1);
        this.a = dispatchnestedscroll;
        this.f154b = d2Var;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Integer num) {
        this.a.valueOf(this.f154b, num, Boolean.TRUE);
        return setAnimationMatrix.ag$a;
    }
}

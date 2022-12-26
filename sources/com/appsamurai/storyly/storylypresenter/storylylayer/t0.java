package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class t0 extends Lambda implements Styleable.ChangeBounds<Integer, setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f152b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(dispatchNestedScroll dispatchnestedscroll, q qVar) {
        super(1);
        this.a = dispatchnestedscroll;
        this.f152b = qVar;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Integer num) {
        this.a.valueOf(this.f152b, num, Boolean.TRUE);
        return setAnimationMatrix.ag$a;
    }
}

package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class u0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d2 f153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(dispatchNestedScroll dispatchnestedscroll, d2 d2Var) {
        super(0);
        this.a = dispatchnestedscroll;
        this.f153b = d2Var;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        dispatchNestedScroll.ag$a(this.a, this.f153b, null, Boolean.FALSE, 2);
        return setAnimationMatrix.ag$a;
    }
}

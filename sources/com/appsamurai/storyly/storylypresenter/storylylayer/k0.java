package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class k0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h1 f139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(dispatchNestedScroll dispatchnestedscroll, h1 h1Var) {
        super(0);
        this.a = dispatchnestedscroll;
        this.f139b = h1Var;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        dispatchNestedScroll.ag$a(this.a, this.f139b, null, null, 6);
        return setAnimationMatrix.ag$a;
    }
}

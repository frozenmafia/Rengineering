package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class q0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c2 f149b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(dispatchNestedScroll dispatchnestedscroll, c2 c2Var) {
        super(0);
        this.a = dispatchnestedscroll;
        this.f149b = c2Var;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        dispatchNestedScroll.ag$a(this.a, this.f149b, null, null, 6);
        return setAnimationMatrix.ag$a;
    }
}

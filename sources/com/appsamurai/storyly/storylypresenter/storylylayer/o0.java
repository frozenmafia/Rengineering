package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class o0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p1 f144b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(dispatchNestedScroll dispatchnestedscroll, p1 p1Var) {
        super(0);
        this.a = dispatchnestedscroll;
        this.f144b = p1Var;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        dispatchNestedScroll.ag$a(this.a, this.f144b, null, null, 6);
        return setAnimationMatrix.ag$a;
    }
}

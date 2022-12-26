package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class n0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o1 f142b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(dispatchNestedScroll dispatchnestedscroll, o1 o1Var) {
        super(0);
        this.a = dispatchnestedscroll;
        this.f142b = o1Var;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        dispatchNestedScroll.ag$a(this.a, this.f142b, null, null, 6);
        return setAnimationMatrix.ag$a;
    }
}

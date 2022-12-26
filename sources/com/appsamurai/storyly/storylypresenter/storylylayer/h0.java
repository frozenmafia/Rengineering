package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class h0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(dispatchNestedScroll dispatchnestedscroll, s sVar) {
        super(0);
        this.a = dispatchnestedscroll;
        this.f137b = sVar;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        dispatchNestedScroll.ag$a(this.a, this.f137b, null, Boolean.TRUE, 2);
        return setAnimationMatrix.ag$a;
    }
}

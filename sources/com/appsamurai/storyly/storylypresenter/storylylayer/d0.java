package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class d0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f128b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(dispatchNestedScroll dispatchnestedscroll, l lVar) {
        super(0);
        this.a = dispatchnestedscroll;
        this.f128b = lVar;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        dispatchNestedScroll.ag$a(this.a, this.f128b, null, null, 6);
        return setAnimationMatrix.ag$a;
    }
}

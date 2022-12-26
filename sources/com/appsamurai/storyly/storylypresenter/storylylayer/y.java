package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class y extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f155b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(dispatchNestedScroll dispatchnestedscroll, f fVar) {
        super(0);
        this.a = dispatchnestedscroll;
        this.f155b = fVar;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        dispatchNestedScroll.ag$a(this.a, this.f155b, null, Boolean.FALSE, 2);
        return setAnimationMatrix.ag$a;
    }
}

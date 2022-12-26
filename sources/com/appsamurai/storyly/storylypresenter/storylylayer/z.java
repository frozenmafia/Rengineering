package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class z extends Lambda implements Styleable.ChangeBounds<Integer, setAnimationMatrix> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f156b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dispatchNestedScroll dispatchnestedscroll, f fVar) {
        super(1);
        this.a = dispatchnestedscroll;
        this.f156b = fVar;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Integer num) {
        int intValue = num.intValue();
        this.a.valueOf(this.f156b, Integer.valueOf(intValue), Boolean.TRUE);
        return setAnimationMatrix.ag$a;
    }
}

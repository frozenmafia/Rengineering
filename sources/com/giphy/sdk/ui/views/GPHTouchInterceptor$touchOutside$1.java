package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.WindowMetricsCalculatorDecorator;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
final class GPHTouchInterceptor$touchOutside$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public static final GPHTouchInterceptor$touchOutside$1 INSTANCE = new GPHTouchInterceptor$touchOutside$1();

    GPHTouchInterceptor$touchOutside$1() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WindowMetricsCalculatorDecorator.valueOf.valueOf("dragRelease", new Object[0]);
    }
}

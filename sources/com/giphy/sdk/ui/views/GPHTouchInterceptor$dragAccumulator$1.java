package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.WindowMetricsCalculatorDecorator;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
final class GPHTouchInterceptor$dragAccumulator$1 extends Lambda implements Styleable.ChangeBounds<Float, setAnimationMatrix> {
    public static final GPHTouchInterceptor$dragAccumulator$1 INSTANCE = new GPHTouchInterceptor$dragAccumulator$1();

    GPHTouchInterceptor$dragAccumulator$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Float f) {
        invoke(f.floatValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(float f) {
        WindowMetricsCalculatorDecorator.valueOf.valueOf("dragAccumulator " + f, new Object[0]);
    }
}

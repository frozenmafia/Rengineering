package androidx.window.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<WindowMetricsCalculator, WindowMetricsCalculator> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        runAnimators.ag$a(windowMetricsCalculator, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(windowMetricsCalculator);
    }
}

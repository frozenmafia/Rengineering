package androidx.window.layout;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class WindowMetricsCalculator$Companion$decorator$1 extends Lambda implements Styleable.ChangeBounds<WindowMetricsCalculator, WindowMetricsCalculator> {
    public static final WindowMetricsCalculator$Companion$decorator$1 INSTANCE = new WindowMetricsCalculator$Companion$decorator$1();

    WindowMetricsCalculator$Companion$decorator$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        runAnimators.ag$a(windowMetricsCalculator, "it");
        return windowMetricsCalculator;
    }
}

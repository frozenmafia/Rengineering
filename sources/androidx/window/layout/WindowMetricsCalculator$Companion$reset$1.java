package androidx.window.layout;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WindowMetricsCalculator$Companion$reset$1 extends Lambda implements Styleable.ChangeBounds<WindowMetricsCalculator, WindowMetricsCalculator> {
    public static final WindowMetricsCalculator$Companion$reset$1 INSTANCE = new WindowMetricsCalculator$Companion$reset$1();

    WindowMetricsCalculator$Companion$reset$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        runAnimators.ag$a(windowMetricsCalculator, "it");
        return windowMetricsCalculator;
    }
}

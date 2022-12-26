package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class HorizontalWidgetRun {
    @isFullSpan(valueOf = "defaultAmount")
    private final double valueOf;
    @isFullSpan(valueOf = "suggestedAmountArray")
    private final List<traverseStart> values = reserveEndViewTransition.valueOf();

    /* renamed from: o.HorizontalWidgetRun$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 {
        public static final String[] valueOf(double d, HorizontalWidgetRun horizontalWidgetRun) {
            if (horizontalWidgetRun != null) {
                for (traverseStart traversestart : horizontalWidgetRun.values()) {
                    if (d >= traversestart.values() && d < traversestart.ag$a()) {
                        return traversestart.valueOf();
                    }
                }
            }
            return values(d);
        }

        public static final String[] values(double d, defineTerminalWidget defineterminalwidget) {
            List<traverseStart> ah$a;
            runAnimators.ag$a(defineterminalwidget, "prefilledSuggestedAmount");
            computeWrapSize ag$a = defineterminalwidget.ag$a();
            if (ag$a != null && (ah$a = ag$a.ah$a()) != null) {
                for (traverseStart traversestart : ah$a) {
                    if (d >= traversestart.values() && d < traversestart.ag$a()) {
                        return traversestart.valueOf();
                    }
                }
            }
            return values(d);
        }

        public static final String[] values(double d) {
            if (1.0d > d || d >= 50.0d) {
                if (50.0d > d || d >= 100.0d) {
                    if (100.0d <= d && d < 250.0d) {
                        return new String[]{"500", "1000"};
                    }
                    return new String[]{"1000", "2500"};
                }
                return new String[]{"200", "500"};
            }
            return new String[]{"50", "100"};
        }
    }

    public final double valueOf() {
        return this.valueOf;
    }

    public final List<traverseStart> values() {
        return this.values;
    }
}

package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a;
import java.io.IOException;
/* loaded from: classes5.dex */
final class animateDisappearance$ah$b implements performAccessibilityActionForItem<CrashlyticsReport$toString$ah$a> {
    static final animateDisappearance$ah$b ag$a = new animateDisappearance$ah$b();
    private static final onRequestChildFocus valueOf = onRequestChildFocus.ag$a("arch");
    private static final onRequestChildFocus HaptikSDK$a = onRequestChildFocus.ag$a("model");
    private static final onRequestChildFocus values = onRequestChildFocus.ag$a("cores");
    private static final onRequestChildFocus ah$b = onRequestChildFocus.ag$a("ram");
    private static final onRequestChildFocus ah$a = onRequestChildFocus.ag$a("diskSpace");
    private static final onRequestChildFocus invoke = onRequestChildFocus.ag$a("simulator");
    private static final onRequestChildFocus HaptikSDK$b = onRequestChildFocus.ag$a("state");
    private static final onRequestChildFocus toString = onRequestChildFocus.ag$a("manufacturer");
    private static final onRequestChildFocus HaptikSDK$c = onRequestChildFocus.ag$a("modelClass");

    private animateDisappearance$ah$b() {
    }

    @Override // o.onAddFocusables
    /* renamed from: toString */
    public void ag$a(CrashlyticsReport$toString$ah$a crashlyticsReport$toString$ah$a, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.ah$a(valueOf, crashlyticsReport$toString$ah$a.values());
        removeandrecycleview.valueOf(HaptikSDK$a, crashlyticsReport$toString$ah$a.HaptikSDK$b());
        removeandrecycleview.ah$a(values, crashlyticsReport$toString$ah$a.ag$a());
        removeandrecycleview.ah$a(ah$b, crashlyticsReport$toString$ah$a.HaptikSDK$a());
        removeandrecycleview.ah$a(ah$a, crashlyticsReport$toString$ah$a.ah$a());
        removeandrecycleview.toString(invoke, crashlyticsReport$toString$ah$a.ah$b());
        removeandrecycleview.ah$a(HaptikSDK$b, crashlyticsReport$toString$ah$a.HaptikSDK$c());
        removeandrecycleview.valueOf(toString, crashlyticsReport$toString$ah$a.valueOf());
        removeandrecycleview.valueOf(HaptikSDK$c, crashlyticsReport$toString$ah$a.invoke());
    }
}

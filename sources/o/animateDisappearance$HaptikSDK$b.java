package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.IOException;
/* loaded from: classes5.dex */
final class animateDisappearance$HaptikSDK$b implements performAccessibilityActionForItem<CrashlyticsReport.toString.valueOf> {
    static final animateDisappearance$HaptikSDK$b ag$a = new animateDisappearance$HaptikSDK$b();
    private static final onRequestChildFocus toString = onRequestChildFocus.ag$a("identifier");
    private static final onRequestChildFocus ah$b = onRequestChildFocus.ag$a("version");
    private static final onRequestChildFocus values = onRequestChildFocus.ag$a("displayVersion");
    private static final onRequestChildFocus invoke = onRequestChildFocus.ag$a("organization");
    private static final onRequestChildFocus HaptikSDK$c = onRequestChildFocus.ag$a("installationUuid");
    private static final onRequestChildFocus ah$a = onRequestChildFocus.ag$a("developmentPlatform");
    private static final onRequestChildFocus valueOf = onRequestChildFocus.ag$a("developmentPlatformVersion");

    private animateDisappearance$HaptikSDK$b() {
    }

    @Override // o.onAddFocusables
    /* renamed from: ah$a */
    public void ag$a(CrashlyticsReport.toString.valueOf valueof, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.valueOf(toString, valueof.valueOf());
        removeandrecycleview.valueOf(ah$b, valueof.ah$b());
        removeandrecycleview.valueOf(values, valueof.values());
        removeandrecycleview.valueOf(invoke, valueof.HaptikSDK$a());
        removeandrecycleview.valueOf(HaptikSDK$c, valueof.HaptikSDK$b());
        removeandrecycleview.valueOf(ah$a, valueof.ah$a());
        removeandrecycleview.valueOf(valueOf, valueof.ag$a());
    }
}

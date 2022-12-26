package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a;
import java.io.IOException;
/* loaded from: classes5.dex */
final class animateDisappearance$HaptikSDK$e implements performAccessibilityActionForItem<CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a> {
    static final animateDisappearance$HaptikSDK$e toString = new animateDisappearance$HaptikSDK$e();
    private static final onRequestChildFocus values = onRequestChildFocus.ag$a("name");
    private static final onRequestChildFocus ag$a = onRequestChildFocus.ag$a("code");
    private static final onRequestChildFocus ah$a = onRequestChildFocus.ag$a("address");

    private animateDisappearance$HaptikSDK$e() {
    }

    @Override // o.onAddFocusables
    public void ag$a(CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.valueOf(values, crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.ag$a());
        removeandrecycleview.valueOf(ag$a, crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.values());
        removeandrecycleview.ah$a(ah$a, crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.valueOf());
    }
}

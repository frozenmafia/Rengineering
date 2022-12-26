package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a;
import java.io.IOException;
/* loaded from: classes5.dex */
final class animateDisappearance$HaptikSDK$d implements performAccessibilityActionForItem<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values> {
    static final animateDisappearance$HaptikSDK$d toString = new animateDisappearance$HaptikSDK$d();
    private static final onRequestChildFocus ah$a = onRequestChildFocus.ag$a("name");
    private static final onRequestChildFocus valueOf = onRequestChildFocus.ag$a("importance");
    private static final onRequestChildFocus values = onRequestChildFocus.ag$a("frames");

    private animateDisappearance$HaptikSDK$d() {
    }

    @Override // o.onAddFocusables
    /* renamed from: values */
    public void ag$a(CrashlyticsReport$toString$ag$a$ah$a$ah$a.values valuesVar, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.valueOf(ah$a, valuesVar.ag$a());
        removeandrecycleview.ah$a(valueOf, valuesVar.valueOf());
        removeandrecycleview.valueOf(values, valuesVar.ah$a());
    }
}

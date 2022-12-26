package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.sendbird.android.constant.StringSet;
import java.io.IOException;
/* loaded from: classes5.dex */
final class animateDisappearance$ag$a implements performAccessibilityActionForItem<CrashlyticsReport.valueOf> {
    static final animateDisappearance$ag$a ag$a = new animateDisappearance$ag$a();
    private static final onRequestChildFocus ah$a = onRequestChildFocus.ag$a(StringSet.key);
    private static final onRequestChildFocus valueOf = onRequestChildFocus.ag$a("value");

    private animateDisappearance$ag$a() {
    }

    @Override // o.onAddFocusables
    /* renamed from: valueOf */
    public void ag$a(CrashlyticsReport.valueOf valueof, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.valueOf(ah$a, valueof.valueOf());
        removeandrecycleview.valueOf(valueOf, valueof.ag$a());
    }
}

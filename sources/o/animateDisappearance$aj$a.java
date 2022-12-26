package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a;
import com.sendbird.android.constant.StringSet;
import java.io.IOException;
/* loaded from: classes5.dex */
final class animateDisappearance$aj$a implements performAccessibilityActionForItem<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> {
    static final animateDisappearance$aj$a toString = new animateDisappearance$aj$a();
    private static final onRequestChildFocus ag$a = onRequestChildFocus.ag$a("pc");
    private static final onRequestChildFocus HaptikSDK$b = onRequestChildFocus.ag$a("symbol");
    private static final onRequestChildFocus ah$a = onRequestChildFocus.ag$a(StringSet.file);
    private static final onRequestChildFocus valueOf = onRequestChildFocus.ag$a("offset");
    private static final onRequestChildFocus values = onRequestChildFocus.ag$a("importance");

    private animateDisappearance$aj$a() {
    }

    @Override // o.onAddFocusables
    /* renamed from: valueOf */
    public void ag$a(CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString tostring, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.ah$a(ag$a, tostring.ah$a());
        removeandrecycleview.valueOf(HaptikSDK$b, tostring.HaptikSDK$b());
        removeandrecycleview.valueOf(ah$a, tostring.valueOf());
        removeandrecycleview.ah$a(valueOf, tostring.ag$a());
        removeandrecycleview.ah$a(values, tostring.values());
    }
}

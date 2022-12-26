package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.IOException;
/* loaded from: classes5.dex */
final class animateDisappearance$ah$a implements performAccessibilityActionForItem<CrashlyticsReport.values.toString> {
    static final animateDisappearance$ah$a toString = new animateDisappearance$ah$a();
    private static final onRequestChildFocus valueOf = onRequestChildFocus.ag$a("filename");
    private static final onRequestChildFocus values = onRequestChildFocus.ag$a("contents");

    private animateDisappearance$ah$a() {
    }

    @Override // o.onAddFocusables
    public void ag$a(CrashlyticsReport.values.toString tostring, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.valueOf(valueOf, tostring.values());
        removeandrecycleview.valueOf(values, tostring.valueOf());
    }
}

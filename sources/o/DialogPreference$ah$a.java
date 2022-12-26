package o;

import java.io.IOException;
import o.DialogPreference;
/* loaded from: classes7.dex */
final class DialogPreference$ah$a implements performAccessibilityActionForItem<DialogPreference.TargetFragment> {
    static final DialogPreference$ah$a toString = new DialogPreference$ah$a();
    private static final onRequestChildFocus ag$a = onRequestChildFocus.ag$a("clientMetrics");

    private DialogPreference$ah$a() {
    }

    @Override // o.onAddFocusables
    public void ag$a(DialogPreference.TargetFragment targetFragment, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.valueOf(ag$a, targetFragment.valueOf());
    }
}

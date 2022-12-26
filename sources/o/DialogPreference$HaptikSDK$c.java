package o;

import java.io.IOException;
/* loaded from: classes7.dex */
final class DialogPreference$HaptikSDK$c implements performAccessibilityActionForItem<ListPreference> {
    static final DialogPreference$HaptikSDK$c ag$a = new DialogPreference$HaptikSDK$c();
    private static final onRequestChildFocus ah$a = onRequestChildFocus.valueOf("startMs").ag$a(setRecyclerView.values().values(1).ag$a()).ah$a();
    private static final onRequestChildFocus toString = onRequestChildFocus.valueOf("endMs").ag$a(setRecyclerView.values().values(2).ag$a()).ah$a();

    private DialogPreference$HaptikSDK$c() {
    }

    @Override // o.onAddFocusables
    /* renamed from: valueOf */
    public void ag$a(ListPreference listPreference, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.ah$a(ah$a, listPreference.values());
        removeandrecycleview.ah$a(toString, listPreference.ah$a());
    }
}

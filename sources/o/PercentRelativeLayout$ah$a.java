package o;

import com.google.android.datatransport.cct.internal.ClientInfo;
import java.io.IOException;
/* loaded from: classes7.dex */
final class PercentRelativeLayout$ah$a implements performAccessibilityActionForItem<ClientInfo> {
    static final PercentRelativeLayout$ah$a ah$a = new PercentRelativeLayout$ah$a();
    private static final onRequestChildFocus toString = onRequestChildFocus.ag$a("clientType");
    private static final onRequestChildFocus values = onRequestChildFocus.ag$a("androidClientInfo");

    private PercentRelativeLayout$ah$a() {
    }

    @Override // o.onAddFocusables
    /* renamed from: values */
    public void ag$a(ClientInfo clientInfo, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.valueOf(toString, clientInfo.ag$a());
        removeandrecycleview.valueOf(values, clientInfo.values());
    }
}

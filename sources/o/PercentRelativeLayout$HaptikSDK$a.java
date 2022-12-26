package o;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.io.IOException;
/* loaded from: classes7.dex */
final class PercentRelativeLayout$HaptikSDK$a implements performAccessibilityActionForItem<NetworkConnectionInfo> {
    static final PercentRelativeLayout$HaptikSDK$a ah$a = new PercentRelativeLayout$HaptikSDK$a();
    private static final onRequestChildFocus values = onRequestChildFocus.ag$a("networkType");
    private static final onRequestChildFocus valueOf = onRequestChildFocus.ag$a("mobileSubtype");

    private PercentRelativeLayout$HaptikSDK$a() {
    }

    @Override // o.onAddFocusables
    public void ag$a(NetworkConnectionInfo networkConnectionInfo, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.valueOf(values, networkConnectionInfo.valueOf());
        removeandrecycleview.valueOf(valueOf, networkConnectionInfo.ah$a());
    }
}

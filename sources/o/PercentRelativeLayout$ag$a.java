package o;

import java.io.IOException;
/* loaded from: classes7.dex */
final class PercentRelativeLayout$ag$a implements performAccessibilityActionForItem<onBindViewHolder> {
    static final PercentRelativeLayout$ag$a ag$a = new PercentRelativeLayout$ag$a();
    private static final onRequestChildFocus ah$b = onRequestChildFocus.ag$a("requestTimeMs");
    private static final onRequestChildFocus HaptikSDK$c = onRequestChildFocus.ag$a("requestUptimeMs");
    private static final onRequestChildFocus valueOf = onRequestChildFocus.ag$a("clientInfo");
    private static final onRequestChildFocus toString = onRequestChildFocus.ag$a("logSource");
    private static final onRequestChildFocus values = onRequestChildFocus.ag$a("logSourceName");
    private static final onRequestChildFocus ah$a = onRequestChildFocus.ag$a("logEvent");
    private static final onRequestChildFocus HaptikSDK$a = onRequestChildFocus.ag$a("qosTier");

    private PercentRelativeLayout$ag$a() {
    }

    @Override // o.onAddFocusables
    /* renamed from: ah$a */
    public void ag$a(onBindViewHolder onbindviewholder, removeAndRecycleView removeandrecycleview) throws IOException {
        removeandrecycleview.ah$a(ah$b, onbindviewholder.invoke());
        removeandrecycleview.ah$a(HaptikSDK$c, onbindviewholder.HaptikSDK$c());
        removeandrecycleview.valueOf(valueOf, onbindviewholder.valueOf());
        removeandrecycleview.valueOf(toString, onbindviewholder.ag$a());
        removeandrecycleview.valueOf(values, onbindviewholder.ah$a());
        removeandrecycleview.valueOf(ah$a, onbindviewholder.values());
        removeandrecycleview.valueOf(HaptikSDK$a, onbindviewholder.HaptikSDK$a());
    }
}

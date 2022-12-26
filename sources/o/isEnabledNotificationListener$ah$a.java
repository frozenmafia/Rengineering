package o;

import com.github.mikephil.charting.data.DataSet;
import o.MediaBrowserServiceCompat;
/* loaded from: classes4.dex */
protected class isEnabledNotificationListener$ah$a {
    public int ag$a;
    final /* synthetic */ isEnabledNotificationListener ah$a;
    public int toString;
    public int values;

    /* JADX INFO: Access modifiers changed from: protected */
    public isEnabledNotificationListener$ah$a(isEnabledNotificationListener isenablednotificationlistener) {
        this.ah$a = isenablednotificationlistener;
    }

    public void toString(MediaBrowserServiceCompat.ResultWrapper resultWrapper, MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass7 anonymousClass7) {
        float max = Math.max(0.0f, Math.min(1.0f, this.ah$a.HaptikSDK$b.valueOf()));
        float HaptikWebView = resultWrapper.HaptikWebView();
        float HaptikSDK$e = resultWrapper.HaptikSDK$e();
        T ag$a = anonymousClass7.ag$a(HaptikWebView, Float.NaN, DataSet.Rounding.DOWN);
        T ag$a2 = anonymousClass7.ag$a(HaptikSDK$e, Float.NaN, DataSet.Rounding.UP);
        this.toString = ag$a == 0 ? 0 : anonymousClass7.valueOf((MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass7) ag$a);
        int valueOf = ag$a2 != 0 ? anonymousClass7.valueOf((MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass7) ag$a2) : 0;
        this.ag$a = valueOf;
        this.values = (int) ((valueOf - this.toString) * max);
    }
}

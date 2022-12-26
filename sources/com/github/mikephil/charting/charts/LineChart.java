package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import o.MediaBrowserServiceCompat;
import o.onSetVolumeTo;
/* loaded from: classes4.dex */
public class LineChart extends BarLineChartBase<MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.AnonymousClass2> implements MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass2 {
    public LineChart(Context context) {
        super(context);
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void values() {
        super.values();
        this.newSession = new onSetVolumeTo(this, this.ICustomTabsCallback$Default, this.requestPostMessageChannel);
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass2
    public MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.AnonymousClass2 IPostMessageService$Stub$Proxy() {
        return (MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.AnonymousClass2) this.onMessageChannelReady;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.newSession != null && (this.newSession instanceof onSetVolumeTo)) {
            ((onSetVolumeTo) this.newSession).ah$a();
        }
        super.onDetachedFromWindow();
    }
}

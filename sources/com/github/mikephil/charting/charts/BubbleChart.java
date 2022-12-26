package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import o.MediaBrowserServiceCompat;
import o.MediaSessionManagerImplBase;
import o.parcelListToItemList;
/* loaded from: classes4.dex */
public class BubbleChart extends BarLineChartBase<MediaBrowserServiceCompat.AnonymousClass4> implements parcelListToItemList {
    public BubbleChart(Context context) {
        super(context);
    }

    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void values() {
        super.values();
        this.newSession = new MediaSessionManagerImplBase(this, this.ICustomTabsCallback$Default, this.requestPostMessageChannel);
    }

    @Override // o.parcelListToItemList
    public MediaBrowserServiceCompat.AnonymousClass4 j_() {
        return (MediaBrowserServiceCompat.AnonymousClass4) this.onMessageChannelReady;
    }
}

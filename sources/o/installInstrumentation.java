package o;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.RadarEntry;
import o.MediaBrowserServiceCompat;
/* loaded from: classes7.dex */
public class installInstrumentation extends MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1 {
    private int ag$a;
    private String[] values;

    public installInstrumentation() {
        this.values = new String[0];
        this.ag$a = 0;
    }

    public installInstrumentation(String[] strArr) {
        this.values = new String[0];
        this.ag$a = 0;
        if (strArr != null) {
            ag$a(strArr);
        }
    }

    public void ag$a(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        this.values = strArr;
        this.ag$a = strArr.length;
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String valueOf(BarEntry barEntry) {
        return toString(barEntry);
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String ah$a(float f, BarEntry barEntry) {
        return toString(barEntry);
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String ag$a(Entry entry) {
        return toString(entry);
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String toString(float f, PieEntry pieEntry) {
        return toString(pieEntry);
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String values(RadarEntry radarEntry) {
        return toString(radarEntry);
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String ag$a(BubbleEntry bubbleEntry) {
        return toString(bubbleEntry);
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String ah$a(CandleEntry candleEntry) {
        return toString(candleEntry);
    }

    private String toString(Entry entry) {
        int round = Math.round(entry.HaptikWebView());
        return (round < 0 || round >= this.ag$a || round != ((int) entry.HaptikWebView())) ? "" : this.values[round];
    }
}

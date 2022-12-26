package o;

import com.github.mikephil.charting.charts.PieChart;
import o.MediaBrowserServiceCompat;
/* loaded from: classes4.dex */
public class sendResult extends checkExtraFields<PieChart> {
    public sendResult(PieChart pieChart) {
        super(pieChart);
    }

    @Override // o.checkExtraFields
    protected MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2 toString(int i, float f, float f2) {
        MediaBrowserServiceCompat.ServiceCallbacksCompat valueOf = ((MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.AnonymousClass1) ((PieChart) this.toString).onTransact()).valueOf();
        return new MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2(i, valueOf.HaptikSDK$d(i).ah$b(), f, f2, 0, valueOf.ah$b());
    }
}

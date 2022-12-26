package o;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;
import o.MediaBrowserServiceCompat;
/* loaded from: classes4.dex */
public abstract class checkExtraFields<T extends PieRadarChartBase> implements sendError {
    protected T toString;
    protected List<MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2> values = new ArrayList();

    protected abstract MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2 toString(int i, float f, float f2);

    public checkExtraFields(T t) {
        this.toString = t;
    }

    @Override // o.sendError
    public MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2 toString(float f, float f2) {
        if (this.toString.ag$a(f, f2) > this.toString.getSignupData()) {
            return null;
        }
        float values = this.toString.values(f, f2);
        T t = this.toString;
        if (t instanceof PieChart) {
            values /= t.getInterfaceDescriptor().values();
        }
        int ag$a = this.toString.ag$a(values);
        if (ag$a < 0 || ag$a >= this.toString.onTransact().ah$b().setDefaultImpl()) {
            return null;
        }
        return toString(ag$a, f, f2);
    }
}

package o;

import com.github.mikephil.charting.charts.BarLineChartBase;
import java.util.WeakHashMap;
/* loaded from: classes4.dex */
public class findField {
    private WeakHashMap<BarLineChartBase, MultiDex> valueOf = new WeakHashMap<>();

    public MultiDex valueOf(BarLineChartBase barLineChartBase) {
        MultiDex multiDex;
        synchronized (this) {
            if (!this.valueOf.containsKey(barLineChartBase)) {
                this.valueOf.put(barLineChartBase, new MultiDex());
            }
            multiDex = this.valueOf.get(barLineChartBase);
        }
        return multiDex;
    }
}

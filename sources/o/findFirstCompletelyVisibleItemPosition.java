package o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;
import o.collectAdjacentPrefetchPositions;
/* loaded from: classes7.dex */
public final class findFirstCompletelyVisibleItemPosition {
    private final AppMeasurementSdk ag$a;
    private final collectAdjacentPrefetchPositions.values toString;
    final Set valueOf;
    private final collectInitialPrefetchPositions values;

    public findFirstCompletelyVisibleItemPosition(AppMeasurementSdk appMeasurementSdk, collectAdjacentPrefetchPositions.values valuesVar) {
        this.toString = valuesVar;
        this.ag$a = appMeasurementSdk;
        collectInitialPrefetchPositions collectinitialprefetchpositions = new collectInitialPrefetchPositions(this);
        this.values = collectinitialprefetchpositions;
        appMeasurementSdk.registerOnMeasurementEventListener(collectinitialprefetchpositions);
        this.valueOf = new HashSet();
    }
}

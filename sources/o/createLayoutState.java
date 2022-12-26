package o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import o.collectAdjacentPrefetchPositions;
/* loaded from: classes7.dex */
public final class createLayoutState {
    private final AppMeasurementSdk ag$a;
    private final collectAdjacentPrefetchPositions.values valueOf;
    private final convertFocusDirectionToLayoutDirection values;

    public createLayoutState(AppMeasurementSdk appMeasurementSdk, collectAdjacentPrefetchPositions.values valuesVar) {
        this.valueOf = valuesVar;
        this.ag$a = appMeasurementSdk;
        convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection = new convertFocusDirectionToLayoutDirection(this);
        this.values = convertfocusdirectiontolayoutdirection;
        appMeasurementSdk.registerOnMeasurementEventListener(convertfocusdirectiontolayoutdirection);
    }
}

package o;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import o.collectAdjacentPrefetchPositions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class convertFocusDirectionToLayoutDirection implements AppMeasurementSdk.OnEventListener {
    final /* synthetic */ createLayoutState values;

    public convertFocusDirectionToLayoutDirection(createLayoutState createlayoutstate) {
        this.values = createlayoutstate;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgs
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        collectAdjacentPrefetchPositions.values valuesVar;
        if (str == null || !assertNotInLayoutOrScroll.values(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        valuesVar = this.values.valueOf;
        valuesVar.ah$a(3, bundle2);
    }
}

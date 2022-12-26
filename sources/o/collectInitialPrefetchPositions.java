package o;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import o.collectAdjacentPrefetchPositions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class collectInitialPrefetchPositions implements AppMeasurementSdk.OnEventListener {
    final /* synthetic */ findFirstCompletelyVisibleItemPosition ag$a;

    public collectInitialPrefetchPositions(findFirstCompletelyVisibleItemPosition findfirstcompletelyvisibleitemposition) {
        this.ag$a = findfirstcompletelyvisibleitemposition;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgs
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        collectAdjacentPrefetchPositions.values valuesVar;
        if (this.ag$a.valueOf.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(com.apxor.androidsdk.core.Constants.EVENTS_TABLE, assertNotInLayoutOrScroll.toString(str2));
            valuesVar = this.ag$a.toString;
            valuesVar.ah$a(2, bundle2);
        }
    }
}

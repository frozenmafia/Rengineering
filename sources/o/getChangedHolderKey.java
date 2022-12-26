package o;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a;
import o.getChildDrawingOrder;
/* loaded from: classes7.dex */
public final /* synthetic */ class getChangedHolderKey implements getChildDrawingOrder.toString {
    public static final /* synthetic */ getChangedHolderKey toString = new getChangedHolderKey();

    private /* synthetic */ getChangedHolderKey() {
    }

    @Override // o.getChildDrawingOrder.toString
    public final Object values(JsonReader jsonReader) {
        CrashlyticsReport$toString$ag$a$ah$a$ah$a.values isLogoutPending;
        isLogoutPending = getChildDrawingOrder.isLogoutPending(jsonReader);
        return isLogoutPending;
    }
}

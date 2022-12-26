package o;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a;
import o.getChildDrawingOrder;
/* loaded from: classes7.dex */
public final /* synthetic */ class getChildAdapterPosition implements getChildDrawingOrder.toString {
    public static final /* synthetic */ getChildAdapterPosition ah$a = new getChildAdapterPosition();

    private /* synthetic */ getChildAdapterPosition() {
    }

    @Override // o.getChildDrawingOrder.toString
    public final Object values(JsonReader jsonReader) {
        CrashlyticsReport$toString$ag$a HaptikSDK$d;
        HaptikSDK$d = getChildDrawingOrder.HaptikSDK$d(jsonReader);
        return HaptikSDK$d;
    }
}

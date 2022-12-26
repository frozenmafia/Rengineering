package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;
/* loaded from: classes7.dex */
public final /* synthetic */ class getMinFlingVelocity implements fetchWidthAndHeight {
    public static final /* synthetic */ getMinFlingVelocity toString = new getMinFlingVelocity();

    private /* synthetic */ getMinFlingVelocity() {
    }

    @Override // o.fetchWidthAndHeight
    public final Object valueOf(Object obj) {
        byte[] bytes;
        bytes = getScrollState.values.ah$a((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
        return bytes;
    }
}

package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;
/* loaded from: classes5.dex */
public final /* synthetic */ class releaseGlows implements Comparator {
    public static final /* synthetic */ releaseGlows values = new releaseGlows();

    private /* synthetic */ releaseGlows() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareTo;
        compareTo = ((CrashlyticsReport.valueOf) obj).valueOf().compareTo(((CrashlyticsReport.valueOf) obj2).valueOf());
        return compareTo;
    }
}

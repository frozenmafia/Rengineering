package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
/* loaded from: classes7.dex */
public abstract class getFullClassName {
    public abstract CrashlyticsReport ag$a();

    public abstract String ah$a();

    public abstract File valueOf();

    public static getFullClassName values(CrashlyticsReport crashlyticsReport, String str, File file) {
        return new createLayoutManager(crashlyticsReport, str, file);
    }
}

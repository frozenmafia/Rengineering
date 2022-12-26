package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class createLayoutManager extends getFullClassName {
    private final String ah$a;
    private final File toString;
    private final CrashlyticsReport values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public createLayoutManager(CrashlyticsReport crashlyticsReport, String str, File file) {
        Objects.requireNonNull(crashlyticsReport, "Null report");
        this.values = crashlyticsReport;
        Objects.requireNonNull(str, "Null sessionId");
        this.ah$a = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.toString = file;
    }

    @Override // o.getFullClassName
    public CrashlyticsReport ag$a() {
        return this.values;
    }

    @Override // o.getFullClassName
    public String ah$a() {
        return this.ah$a;
    }

    @Override // o.getFullClassName
    public File valueOf() {
        return this.toString;
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.values + ", sessionId=" + this.ah$a + ", reportFile=" + this.toString + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getFullClassName) {
            getFullClassName getfullclassname = (getFullClassName) obj;
            return this.values.equals(getfullclassname.ag$a()) && this.ah$a.equals(getfullclassname.ah$a()) && this.toString.equals(getfullclassname.valueOf());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.values.hashCode() ^ 1000003) * 1000003) ^ this.ah$a.hashCode()) * 1000003) ^ this.toString.hashCode();
    }
}

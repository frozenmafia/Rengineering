package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes5.dex */
final class consumePendingUpdateOperations extends CrashlyticsReport.valueOf {
    private final String ah$a;
    private final String valueOf;

    private consumePendingUpdateOperations(String str, String str2) {
        this.ah$a = str;
        this.valueOf = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.valueOf
    public String valueOf() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.valueOf
    public String ag$a() {
        return this.valueOf;
    }

    public String toString() {
        return "CustomAttribute{key=" + this.ah$a + ", value=" + this.valueOf + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.valueOf) {
            CrashlyticsReport.valueOf valueof = (CrashlyticsReport.valueOf) obj;
            return this.ah$a.equals(valueof.valueOf()) && this.valueOf.equals(valueof.ag$a());
        }
        return false;
    }

    public int hashCode() {
        return ((this.ah$a.hashCode() ^ 1000003) * 1000003) ^ this.valueOf.hashCode();
    }
}

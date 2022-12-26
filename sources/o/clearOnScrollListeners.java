package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes5.dex */
final class clearOnScrollListeners extends CrashlyticsReport.values {
    private final String ah$a;
    private final findViewHolderForItemId<CrashlyticsReport.values.toString> values;

    private clearOnScrollListeners(findViewHolderForItemId<CrashlyticsReport.values.toString> findviewholderforitemid, String str) {
        this.values = findviewholderforitemid;
        this.ah$a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.values
    public findViewHolderForItemId<CrashlyticsReport.values.toString> values() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.values
    public String ah$a() {
        return this.ah$a;
    }

    public String toString() {
        return "FilesPayload{files=" + this.values + ", orgId=" + this.ah$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.values) {
            CrashlyticsReport.values valuesVar = (CrashlyticsReport.values) obj;
            if (this.values.equals(valuesVar.values())) {
                String str = this.ah$a;
                if (str == null) {
                    if (valuesVar.ah$a() == null) {
                        return true;
                    }
                } else if (str.equals(valuesVar.ah$a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.values.hashCode();
        String str = this.ah$a;
        return ((hashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }
}

package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$valueOf$ag$a;
/* loaded from: classes5.dex */
final class dispatchLayout extends CrashlyticsReport$toString$valueOf$ag$a {
    private final String values;

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$valueOf$ag$a
    public String valueOf() {
        return this.values;
    }

    public String toString() {
        return "Organization{clsId=" + this.values + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$valueOf$ag$a) {
            return this.values.equals(((CrashlyticsReport$toString$valueOf$ag$a) obj).valueOf());
        }
        return false;
    }

    public int hashCode() {
        return this.values.hashCode() ^ 1000003;
    }
}

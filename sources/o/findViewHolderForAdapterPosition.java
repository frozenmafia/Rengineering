package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a;
/* loaded from: classes5.dex */
final class findViewHolderForAdapterPosition extends CrashlyticsReport$toString$ag$a.values {
    private final String ag$a;

    private findViewHolderForAdapterPosition(String str) {
        this.ag$a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a.values
    public String ag$a() {
        return this.ag$a;
    }

    public String toString() {
        return "Log{content=" + this.ag$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ag$a.values) {
            return this.ag$a.equals(((CrashlyticsReport$toString$ag$a.values) obj).ag$a());
        }
        return false;
    }

    public int hashCode() {
        return this.ag$a.hashCode() ^ 1000003;
    }
}

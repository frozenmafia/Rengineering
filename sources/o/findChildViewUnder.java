package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$HaptikSDK$a;
/* loaded from: classes5.dex */
final class findChildViewUnder extends CrashlyticsReport$toString$HaptikSDK$a {
    private final String toString;

    private findChildViewUnder(String str) {
        this.toString = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$HaptikSDK$a
    public String valueOf() {
        return this.toString;
    }

    public String toString() {
        return "User{identifier=" + this.toString + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$HaptikSDK$a) {
            return this.toString.equals(((CrashlyticsReport$toString$HaptikSDK$a) obj).valueOf());
        }
        return false;
    }

    public int hashCode() {
        return this.toString.hashCode() ^ 1000003;
    }
}

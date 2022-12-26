package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$valueOf$ag$a;
import java.util.Objects;
/* loaded from: classes5.dex */
final class dispatchPendingImportantForAccessibilityChanges extends CrashlyticsReport.toString.valueOf {
    private final String HaptikSDK$a;
    private final String ag$a;
    private final String ah$a;
    private final CrashlyticsReport$toString$valueOf$ag$a ah$b;
    private final String toString;
    private final String valueOf;
    private final String values;

    private dispatchPendingImportantForAccessibilityChanges(String str, String str2, String str3, CrashlyticsReport$toString$valueOf$ag$a crashlyticsReport$toString$valueOf$ag$a, String str4, String str5, String str6) {
        this.valueOf = str;
        this.HaptikSDK$a = str2;
        this.values = str3;
        this.ah$b = crashlyticsReport$toString$valueOf$ag$a;
        this.ag$a = str4;
        this.ah$a = str5;
        this.toString = str6;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf
    public String valueOf() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf
    public String ah$b() {
        return this.HaptikSDK$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf
    public String values() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf
    public CrashlyticsReport$toString$valueOf$ag$a HaptikSDK$a() {
        return this.ah$b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf
    public String HaptikSDK$b() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf
    public String ah$a() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf
    public String ag$a() {
        return this.toString;
    }

    public String toString() {
        return "Application{identifier=" + this.valueOf + ", version=" + this.HaptikSDK$a + ", displayVersion=" + this.values + ", organization=" + this.ah$b + ", installationUuid=" + this.ag$a + ", developmentPlatform=" + this.ah$a + ", developmentPlatformVersion=" + this.toString + "}";
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport$toString$valueOf$ag$a crashlyticsReport$toString$valueOf$ag$a;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.toString.valueOf) {
            CrashlyticsReport.toString.valueOf valueof = (CrashlyticsReport.toString.valueOf) obj;
            if (this.valueOf.equals(valueof.valueOf()) && this.HaptikSDK$a.equals(valueof.ah$b()) && ((str = this.values) != null ? str.equals(valueof.values()) : valueof.values() == null) && ((crashlyticsReport$toString$valueOf$ag$a = this.ah$b) != null ? crashlyticsReport$toString$valueOf$ag$a.equals(valueof.HaptikSDK$a()) : valueof.HaptikSDK$a() == null) && ((str2 = this.ag$a) != null ? str2.equals(valueof.HaptikSDK$b()) : valueof.HaptikSDK$b() == null) && ((str3 = this.ah$a) != null ? str3.equals(valueof.ah$a()) : valueof.ah$a() == null)) {
                String str4 = this.toString;
                if (str4 == null) {
                    if (valueof.ag$a() == null) {
                        return true;
                    }
                } else if (str4.equals(valueof.ag$a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        int hashCode2 = this.HaptikSDK$a.hashCode();
        String str = this.values;
        int hashCode3 = str == null ? 0 : str.hashCode();
        CrashlyticsReport$toString$valueOf$ag$a crashlyticsReport$toString$valueOf$ag$a = this.ah$b;
        int hashCode4 = crashlyticsReport$toString$valueOf$ag$a == null ? 0 : crashlyticsReport$toString$valueOf$ag$a.hashCode();
        String str2 = this.ag$a;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ah$a;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.toString;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }

    /* loaded from: classes7.dex */
    public static final class valueOf extends CrashlyticsReport.toString.valueOf.values {
        private CrashlyticsReport$toString$valueOf$ag$a HaptikSDK$a;
        private String HaptikSDK$b;
        private String ag$a;
        private String ah$a;
        private String toString;
        private String valueOf;
        private String values;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf.values
        public CrashlyticsReport.toString.valueOf.values toString(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.values = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf.values
        public CrashlyticsReport.toString.valueOf.values invoke(String str) {
            Objects.requireNonNull(str, "Null version");
            this.HaptikSDK$b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf.values
        public CrashlyticsReport.toString.valueOf.values ah$a(String str) {
            this.ag$a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf.values
        public CrashlyticsReport.toString.valueOf.values valueOf(String str) {
            this.valueOf = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf.values
        public CrashlyticsReport.toString.valueOf.values values(String str) {
            this.toString = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf.values
        public CrashlyticsReport.toString.valueOf.values ag$a(String str) {
            this.ah$a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.valueOf.values
        public CrashlyticsReport.toString.valueOf ag$a() {
            String str = "";
            if (this.values == null) {
                str = " identifier";
            }
            if (this.HaptikSDK$b == null) {
                str = str + " version";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new dispatchPendingImportantForAccessibilityChanges(this.values, this.HaptikSDK$b, this.ag$a, this.HaptikSDK$a, this.valueOf, this.toString, this.ah$a);
        }
    }
}

package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ag$a;
import java.util.Objects;
/* loaded from: classes5.dex */
final class animateAppearance extends CrashlyticsReport {
    private final int HaptikSDK$a;
    private final CrashlyticsReport.toString HaptikSDK$c;
    private final String ag$a;
    private final String ah$a;
    private final String ah$b;
    private final String toString;
    private final CrashlyticsReport.values valueOf;
    private final String values;

    private animateAppearance(String str, String str2, int i, String str3, String str4, String str5, CrashlyticsReport.toString tostring, CrashlyticsReport.values valuesVar) {
        this.ah$b = str;
        this.toString = str2;
        this.HaptikSDK$a = i;
        this.ag$a = str3;
        this.ah$a = str4;
        this.values = str5;
        this.HaptikSDK$c = tostring;
        this.valueOf = valuesVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String HaptikSDK$a() {
        return this.ah$b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String ah$a() {
        return this.toString;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int HaptikSDK$b() {
        return this.HaptikSDK$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String values() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String valueOf() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String ag$a() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.toString invoke() {
        return this.HaptikSDK$c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.values HaptikSDK$c() {
        return this.valueOf;
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.ah$b + ", gmpAppId=" + this.toString + ", platform=" + this.HaptikSDK$a + ", installationUuid=" + this.ag$a + ", buildVersion=" + this.ah$a + ", displayVersion=" + this.values + ", session=" + this.HaptikSDK$c + ", ndkPayload=" + this.valueOf + "}";
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.toString tostring;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport) {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            if (this.ah$b.equals(crashlyticsReport.HaptikSDK$a()) && this.toString.equals(crashlyticsReport.ah$a()) && this.HaptikSDK$a == crashlyticsReport.HaptikSDK$b() && this.ag$a.equals(crashlyticsReport.values()) && this.ah$a.equals(crashlyticsReport.valueOf()) && this.values.equals(crashlyticsReport.ag$a()) && ((tostring = this.HaptikSDK$c) != null ? tostring.equals(crashlyticsReport.invoke()) : crashlyticsReport.invoke() == null)) {
                CrashlyticsReport.values valuesVar = this.valueOf;
                if (valuesVar == null) {
                    if (crashlyticsReport.HaptikSDK$c() == null) {
                        return true;
                    }
                } else if (valuesVar.equals(crashlyticsReport.HaptikSDK$c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ah$b.hashCode();
        int hashCode2 = this.toString.hashCode();
        int i = this.HaptikSDK$a;
        int hashCode3 = this.ag$a.hashCode();
        int hashCode4 = this.ah$a.hashCode();
        int hashCode5 = this.values.hashCode();
        CrashlyticsReport.toString tostring = this.HaptikSDK$c;
        int hashCode6 = tostring == null ? 0 : tostring.hashCode();
        CrashlyticsReport.values valuesVar = this.valueOf;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (valuesVar != null ? valuesVar.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport$ag$a ah$b() {
        return new toString(this);
    }

    /* loaded from: classes7.dex */
    public static final class toString extends CrashlyticsReport$ag$a {
        private CrashlyticsReport.toString HaptikSDK$a;
        private Integer HaptikSDK$b;
        private String HaptikSDK$c;
        private String ag$a;
        private String ah$a;
        private String toString;
        private String valueOf;
        private CrashlyticsReport.values values;

        public toString() {
        }

        private toString(CrashlyticsReport crashlyticsReport) {
            this.HaptikSDK$c = crashlyticsReport.HaptikSDK$a();
            this.valueOf = crashlyticsReport.ah$a();
            this.HaptikSDK$b = Integer.valueOf(crashlyticsReport.HaptikSDK$b());
            this.toString = crashlyticsReport.values();
            this.ag$a = crashlyticsReport.valueOf();
            this.ah$a = crashlyticsReport.ag$a();
            this.HaptikSDK$a = crashlyticsReport.invoke();
            this.values = crashlyticsReport.HaptikSDK$c();
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ag$a
        public CrashlyticsReport$ag$a values(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.HaptikSDK$c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ag$a
        public CrashlyticsReport$ag$a ah$a(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.valueOf = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ag$a
        public CrashlyticsReport$ag$a values(int i) {
            this.HaptikSDK$b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ag$a
        public CrashlyticsReport$ag$a toString(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.toString = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ag$a
        public CrashlyticsReport$ag$a ag$a(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.ag$a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ag$a
        public CrashlyticsReport$ag$a valueOf(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.ah$a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ag$a
        public CrashlyticsReport$ag$a ah$a(CrashlyticsReport.toString tostring) {
            this.HaptikSDK$a = tostring;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ag$a
        public CrashlyticsReport$ag$a toString(CrashlyticsReport.values valuesVar) {
            this.values = valuesVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ag$a
        public CrashlyticsReport ah$a() {
            String str = "";
            if (this.HaptikSDK$c == null) {
                str = " sdkVersion";
            }
            if (this.valueOf == null) {
                str = str + " gmpAppId";
            }
            if (this.HaptikSDK$b == null) {
                str = str + " platform";
            }
            if (this.toString == null) {
                str = str + " installationUuid";
            }
            if (this.ag$a == null) {
                str = str + " buildVersion";
            }
            if (this.ah$a == null) {
                str = str + " displayVersion";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new animateAppearance(this.HaptikSDK$c, this.valueOf, this.HaptikSDK$b.intValue(), this.toString, this.ag$a, this.ah$a, this.HaptikSDK$a, this.values);
        }
    }
}

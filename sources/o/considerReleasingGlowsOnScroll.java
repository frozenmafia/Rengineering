package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$HaptikSDK$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a;
import java.util.Objects;
/* loaded from: classes5.dex */
final class considerReleasingGlowsOnScroll extends CrashlyticsReport.toString {
    private final String HaptikSDK$a;
    private final long HaptikSDK$b;
    private final String HaptikSDK$c;
    private final CrashlyticsReport$toString$HaptikSDK$a HaptikWebView;
    private final findViewHolderForItemId<CrashlyticsReport$toString$ag$a> ag$a;
    private final CrashlyticsReport$toString$ah$a ah$a;
    private final int ah$b;
    private final CrashlyticsReport.toString.AbstractC0308toString invoke;
    private final boolean toString;
    private final Long valueOf;
    private final CrashlyticsReport.toString.valueOf values;

    private considerReleasingGlowsOnScroll(String str, String str2, long j, Long l, boolean z, CrashlyticsReport.toString.valueOf valueof, CrashlyticsReport$toString$HaptikSDK$a crashlyticsReport$toString$HaptikSDK$a, CrashlyticsReport.toString.AbstractC0308toString abstractC0308toString, CrashlyticsReport$toString$ah$a crashlyticsReport$toString$ah$a, findViewHolderForItemId<CrashlyticsReport$toString$ag$a> findviewholderforitemid, int i) {
        this.HaptikSDK$a = str;
        this.HaptikSDK$c = str2;
        this.HaptikSDK$b = j;
        this.valueOf = l;
        this.toString = z;
        this.values = valueof;
        this.HaptikWebView = crashlyticsReport$toString$HaptikSDK$a;
        this.invoke = abstractC0308toString;
        this.ah$a = crashlyticsReport$toString$ah$a;
        this.ag$a = findviewholderforitemid;
        this.ah$b = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public String HaptikSDK$b() {
        return this.HaptikSDK$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public String invoke() {
        return this.HaptikSDK$c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public long HaptikSDK$a() {
        return this.HaptikSDK$b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public Long valueOf() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public boolean HaptikSDK$d() {
        return this.toString;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public CrashlyticsReport.toString.valueOf ag$a() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public CrashlyticsReport$toString$HaptikSDK$a getInitSettings() {
        return this.HaptikWebView;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public CrashlyticsReport.toString.AbstractC0308toString HaptikSDK$c() {
        return this.invoke;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public CrashlyticsReport$toString$ah$a ah$a() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public findViewHolderForItemId<CrashlyticsReport$toString$ag$a> values() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public int ah$b() {
        return this.ah$b;
    }

    public String toString() {
        return "Session{generator=" + this.HaptikSDK$a + ", identifier=" + this.HaptikSDK$c + ", startedAt=" + this.HaptikSDK$b + ", endedAt=" + this.valueOf + ", crashed=" + this.toString + ", app=" + this.values + ", user=" + this.HaptikWebView + ", os=" + this.invoke + ", device=" + this.ah$a + ", events=" + this.ag$a + ", generatorType=" + this.ah$b + "}";
    }

    public boolean equals(Object obj) {
        Long l;
        CrashlyticsReport$toString$HaptikSDK$a crashlyticsReport$toString$HaptikSDK$a;
        CrashlyticsReport.toString.AbstractC0308toString abstractC0308toString;
        CrashlyticsReport$toString$ah$a crashlyticsReport$toString$ah$a;
        findViewHolderForItemId<CrashlyticsReport$toString$ag$a> findviewholderforitemid;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.toString) {
            CrashlyticsReport.toString tostring = (CrashlyticsReport.toString) obj;
            return this.HaptikSDK$a.equals(tostring.HaptikSDK$b()) && this.HaptikSDK$c.equals(tostring.invoke()) && this.HaptikSDK$b == tostring.HaptikSDK$a() && ((l = this.valueOf) != null ? l.equals(tostring.valueOf()) : tostring.valueOf() == null) && this.toString == tostring.HaptikSDK$d() && this.values.equals(tostring.ag$a()) && ((crashlyticsReport$toString$HaptikSDK$a = this.HaptikWebView) != null ? crashlyticsReport$toString$HaptikSDK$a.equals(tostring.getInitSettings()) : tostring.getInitSettings() == null) && ((abstractC0308toString = this.invoke) != null ? abstractC0308toString.equals(tostring.HaptikSDK$c()) : tostring.HaptikSDK$c() == null) && ((crashlyticsReport$toString$ah$a = this.ah$a) != null ? crashlyticsReport$toString$ah$a.equals(tostring.ah$a()) : tostring.ah$a() == null) && ((findviewholderforitemid = this.ag$a) != null ? findviewholderforitemid.equals(tostring.values()) : tostring.values() == null) && this.ah$b == tostring.ah$b();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.HaptikSDK$a.hashCode();
        int hashCode2 = this.HaptikSDK$c.hashCode();
        long j = this.HaptikSDK$b;
        int i = (int) (j ^ (j >>> 32));
        Long l = this.valueOf;
        int hashCode3 = l == null ? 0 : l.hashCode();
        int i2 = this.toString ? 1231 : 1237;
        int hashCode4 = this.values.hashCode();
        CrashlyticsReport$toString$HaptikSDK$a crashlyticsReport$toString$HaptikSDK$a = this.HaptikWebView;
        int hashCode5 = crashlyticsReport$toString$HaptikSDK$a == null ? 0 : crashlyticsReport$toString$HaptikSDK$a.hashCode();
        CrashlyticsReport.toString.AbstractC0308toString abstractC0308toString = this.invoke;
        int hashCode6 = abstractC0308toString == null ? 0 : abstractC0308toString.hashCode();
        CrashlyticsReport$toString$ah$a crashlyticsReport$toString$ah$a = this.ah$a;
        int hashCode7 = crashlyticsReport$toString$ah$a == null ? 0 : crashlyticsReport$toString$ah$a.hashCode();
        findViewHolderForItemId<CrashlyticsReport$toString$ag$a> findviewholderforitemid = this.ag$a;
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ hashCode3) * 1000003) ^ i2) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ (findviewholderforitemid != null ? findviewholderforitemid.hashCode() : 0)) * 1000003) ^ this.ah$b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString
    public CrashlyticsReport.toString.values getSignupData() {
        return new values(this);
    }

    /* loaded from: classes7.dex */
    public static final class values extends CrashlyticsReport.toString.values {
        private String HaptikSDK$a;
        private CrashlyticsReport.toString.AbstractC0308toString HaptikSDK$b;
        private Integer HaptikSDK$c;
        private CrashlyticsReport.toString.valueOf ag$a;
        private Boolean ah$a;
        private String ah$b;
        private CrashlyticsReport$toString$HaptikSDK$a getSignupData;
        private Long invoke;
        private findViewHolderForItemId<CrashlyticsReport$toString$ag$a> toString;
        private Long valueOf;
        private CrashlyticsReport$toString$ah$a values;

        public values() {
        }

        private values(CrashlyticsReport.toString tostring) {
            this.ah$b = tostring.HaptikSDK$b();
            this.HaptikSDK$a = tostring.invoke();
            this.invoke = Long.valueOf(tostring.HaptikSDK$a());
            this.valueOf = tostring.valueOf();
            this.ah$a = Boolean.valueOf(tostring.HaptikSDK$d());
            this.ag$a = tostring.ag$a();
            this.getSignupData = tostring.getInitSettings();
            this.HaptikSDK$b = tostring.HaptikSDK$c();
            this.values = tostring.ah$a();
            this.toString = tostring.values();
            this.HaptikSDK$c = Integer.valueOf(tostring.ah$b());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values ah$a(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.ah$b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values toString(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.HaptikSDK$a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values valueOf(long j) {
            this.invoke = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values values(Long l) {
            this.valueOf = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values ah$a(boolean z) {
            this.ah$a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values ag$a(CrashlyticsReport.toString.valueOf valueof) {
            Objects.requireNonNull(valueof, "Null app");
            this.ag$a = valueof;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values ah$a(CrashlyticsReport$toString$HaptikSDK$a crashlyticsReport$toString$HaptikSDK$a) {
            this.getSignupData = crashlyticsReport$toString$HaptikSDK$a;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values values(CrashlyticsReport.toString.AbstractC0308toString abstractC0308toString) {
            this.HaptikSDK$b = abstractC0308toString;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values ah$a(CrashlyticsReport$toString$ah$a crashlyticsReport$toString$ah$a) {
            this.values = crashlyticsReport$toString$ah$a;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values ah$a(findViewHolderForItemId<CrashlyticsReport$toString$ag$a> findviewholderforitemid) {
            this.toString = findviewholderforitemid;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString.values valueOf(int i) {
            this.HaptikSDK$c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.values
        public CrashlyticsReport.toString values() {
            String str = "";
            if (this.ah$b == null) {
                str = " generator";
            }
            if (this.HaptikSDK$a == null) {
                str = str + " identifier";
            }
            if (this.invoke == null) {
                str = str + " startedAt";
            }
            if (this.ah$a == null) {
                str = str + " crashed";
            }
            if (this.ag$a == null) {
                str = str + " app";
            }
            if (this.HaptikSDK$c == null) {
                str = str + " generatorType";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new considerReleasingGlowsOnScroll(this.ah$b, this.HaptikSDK$a, this.invoke.longValue(), this.valueOf, this.ah$a.booleanValue(), this.ag$a, this.getSignupData, this.HaptikSDK$b, this.values, this.toString, this.HaptikSDK$c.intValue());
        }
    }
}

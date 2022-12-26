package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ag$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a;
import java.util.Objects;
/* loaded from: classes5.dex */
final class dispatchOnScrolled extends CrashlyticsReport$toString$ag$a$ah$a {
    private final int ag$a;
    private final Boolean ah$a;
    private final findViewHolderForItemId<CrashlyticsReport.valueOf> toString;
    private final findViewHolderForItemId<CrashlyticsReport.valueOf> valueOf;
    private final CrashlyticsReport$toString$ag$a$ah$a$ah$a values;

    private dispatchOnScrolled(CrashlyticsReport$toString$ag$a$ah$a$ah$a crashlyticsReport$toString$ag$a$ah$a$ah$a, findViewHolderForItemId<CrashlyticsReport.valueOf> findviewholderforitemid, findViewHolderForItemId<CrashlyticsReport.valueOf> findviewholderforitemid2, Boolean bool, int i) {
        this.values = crashlyticsReport$toString$ag$a$ah$a$ah$a;
        this.toString = findviewholderforitemid;
        this.valueOf = findviewholderforitemid2;
        this.ah$a = bool;
        this.ag$a = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a
    public CrashlyticsReport$toString$ag$a$ah$a$ah$a values() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a
    public findViewHolderForItemId<CrashlyticsReport.valueOf> ag$a() {
        return this.toString;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a
    public findViewHolderForItemId<CrashlyticsReport.valueOf> valueOf() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a
    public Boolean ah$a() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a
    public int HaptikSDK$b() {
        return this.ag$a;
    }

    public String toString() {
        return "Application{execution=" + this.values + ", customAttributes=" + this.toString + ", internalKeys=" + this.valueOf + ", background=" + this.ah$a + ", uiOrientation=" + this.ag$a + "}";
    }

    public boolean equals(Object obj) {
        findViewHolderForItemId<CrashlyticsReport.valueOf> findviewholderforitemid;
        findViewHolderForItemId<CrashlyticsReport.valueOf> findviewholderforitemid2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ag$a$ah$a) {
            CrashlyticsReport$toString$ag$a$ah$a crashlyticsReport$toString$ag$a$ah$a = (CrashlyticsReport$toString$ag$a$ah$a) obj;
            return this.values.equals(crashlyticsReport$toString$ag$a$ah$a.values()) && ((findviewholderforitemid = this.toString) != null ? findviewholderforitemid.equals(crashlyticsReport$toString$ag$a$ah$a.ag$a()) : crashlyticsReport$toString$ag$a$ah$a.ag$a() == null) && ((findviewholderforitemid2 = this.valueOf) != null ? findviewholderforitemid2.equals(crashlyticsReport$toString$ag$a$ah$a.valueOf()) : crashlyticsReport$toString$ag$a$ah$a.valueOf() == null) && ((bool = this.ah$a) != null ? bool.equals(crashlyticsReport$toString$ag$a$ah$a.ah$a()) : crashlyticsReport$toString$ag$a$ah$a.ah$a() == null) && this.ag$a == crashlyticsReport$toString$ag$a$ah$a.HaptikSDK$b();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.values.hashCode();
        findViewHolderForItemId<CrashlyticsReport.valueOf> findviewholderforitemid = this.toString;
        int hashCode2 = findviewholderforitemid == null ? 0 : findviewholderforitemid.hashCode();
        findViewHolderForItemId<CrashlyticsReport.valueOf> findviewholderforitemid2 = this.valueOf;
        int hashCode3 = findviewholderforitemid2 == null ? 0 : findviewholderforitemid2.hashCode();
        Boolean bool = this.ah$a;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a
    public CrashlyticsReport$toString$ag$a$ah$a$ag$a invoke() {
        return new valueOf(this);
    }

    /* loaded from: classes5.dex */
    public static final class valueOf extends CrashlyticsReport$toString$ag$a$ah$a$ag$a {
        private Integer ag$a;
        private findViewHolderForItemId<CrashlyticsReport.valueOf> ah$a;
        private Boolean toString;
        private findViewHolderForItemId<CrashlyticsReport.valueOf> valueOf;
        private CrashlyticsReport$toString$ag$a$ah$a$ah$a values;

        public valueOf() {
        }

        private valueOf(CrashlyticsReport$toString$ag$a$ah$a crashlyticsReport$toString$ag$a$ah$a) {
            this.values = crashlyticsReport$toString$ag$a$ah$a.values();
            this.valueOf = crashlyticsReport$toString$ag$a$ah$a.ag$a();
            this.ah$a = crashlyticsReport$toString$ag$a$ah$a.valueOf();
            this.toString = crashlyticsReport$toString$ag$a$ah$a.ah$a();
            this.ag$a = Integer.valueOf(crashlyticsReport$toString$ag$a$ah$a.HaptikSDK$b());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ag$a values(CrashlyticsReport$toString$ag$a$ah$a$ah$a crashlyticsReport$toString$ag$a$ah$a$ah$a) {
            Objects.requireNonNull(crashlyticsReport$toString$ag$a$ah$a$ah$a, "Null execution");
            this.values = crashlyticsReport$toString$ag$a$ah$a$ah$a;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ag$a valueOf(findViewHolderForItemId<CrashlyticsReport.valueOf> findviewholderforitemid) {
            this.valueOf = findviewholderforitemid;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ag$a ah$a(findViewHolderForItemId<CrashlyticsReport.valueOf> findviewholderforitemid) {
            this.ah$a = findviewholderforitemid;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ag$a ah$a(Boolean bool) {
            this.toString = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ag$a valueOf(int i) {
            this.ag$a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a valueOf() {
            String str = "";
            if (this.values == null) {
                str = " execution";
            }
            if (this.ag$a == null) {
                str = str + " uiOrientation";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new dispatchOnScrolled(this.values, this.valueOf, this.ah$a, this.toString, this.ag$a.intValue());
        }
    }
}

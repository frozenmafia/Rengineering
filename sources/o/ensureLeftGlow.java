package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a;
import java.util.Objects;
/* loaded from: classes5.dex */
final class ensureLeftGlow extends CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString {
    private final CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString ag$a;
    private final String ah$a;
    private final int toString;
    private final String valueOf;
    private final findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> values;

    private ensureLeftGlow(String str, String str2, findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> findviewholderforitemid, CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString tostring, int i) {
        this.valueOf = str;
        this.ah$a = str2;
        this.values = findviewholderforitemid;
        this.ag$a = tostring;
        this.toString = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString
    public String HaptikSDK$b() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString
    public String ag$a() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString
    public findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> ah$a() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString
    public CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString valueOf() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString
    public int values() {
        return this.toString;
    }

    public String toString() {
        return "Exception{type=" + this.valueOf + ", reason=" + this.ah$a + ", frames=" + this.values + ", causedBy=" + this.ag$a + ", overflowCount=" + this.toString + "}";
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString tostring;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString) {
            CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString tostring2 = (CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString) obj;
            return this.valueOf.equals(tostring2.HaptikSDK$b()) && ((str = this.ah$a) != null ? str.equals(tostring2.ag$a()) : tostring2.ag$a() == null) && this.values.equals(tostring2.ah$a()) && ((tostring = this.ag$a) != null ? tostring.equals(tostring2.valueOf()) : tostring2.valueOf() == null) && this.toString == tostring2.values();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        String str = this.ah$a;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.values.hashCode();
        CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString tostring = this.ag$a;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (tostring != null ? tostring.hashCode() : 0)) * 1000003) ^ this.toString;
    }

    /* loaded from: classes5.dex */
    public static final class values extends CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a {
        private CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString ag$a;
        private findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> ah$a;
        private Integer toString;
        private String valueOf;
        private String values;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a toString(String str) {
            Objects.requireNonNull(str, "Null type");
            this.valueOf = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a values(String str) {
            this.values = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a toString(findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> findviewholderforitemid) {
            Objects.requireNonNull(findviewholderforitemid, "Null frames");
            this.ah$a = findviewholderforitemid;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a valueOf(CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString tostring) {
            this.ag$a = tostring;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a ah$a(int i) {
            this.toString = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$toString$ag$a
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString valueOf() {
            String str = "";
            if (this.valueOf == null) {
                str = " type";
            }
            if (this.ah$a == null) {
                str = str + " frames";
            }
            if (this.toString == null) {
                str = str + " overflowCount";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new ensureLeftGlow(this.valueOf, this.values, this.ah$a, this.ag$a, this.toString.intValue());
        }
    }
}

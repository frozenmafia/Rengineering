package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a;
import java.util.Objects;
/* loaded from: classes5.dex */
final class ensureRightGlow extends CrashlyticsReport$toString$ag$a$ah$a$ah$a {
    private final CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a ag$a;
    private final CrashlyticsReport$ah$a ah$a;
    private final findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a> toString;
    private final findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values> valueOf;
    private final CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString values;

    private ensureRightGlow(findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values> findviewholderforitemid, CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString tostring, CrashlyticsReport$ah$a crashlyticsReport$ah$a, CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a, findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a> findviewholderforitemid2) {
        this.valueOf = findviewholderforitemid;
        this.values = tostring;
        this.ah$a = crashlyticsReport$ah$a;
        this.ag$a = crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a;
        this.toString = findviewholderforitemid2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a
    public findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values> invoke() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a
    public CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString valueOf() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a
    public CrashlyticsReport$ah$a values() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a
    public CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a ag$a() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a
    public findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a> ah$a() {
        return this.toString;
    }

    public String toString() {
        return "Execution{threads=" + this.valueOf + ", exception=" + this.values + ", appExitInfo=" + this.ah$a + ", signal=" + this.ag$a + ", binaries=" + this.toString + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ag$a$ah$a$ah$a) {
            CrashlyticsReport$toString$ag$a$ah$a$ah$a crashlyticsReport$toString$ag$a$ah$a$ah$a = (CrashlyticsReport$toString$ag$a$ah$a$ah$a) obj;
            findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values> findviewholderforitemid = this.valueOf;
            if (findviewholderforitemid != null ? findviewholderforitemid.equals(crashlyticsReport$toString$ag$a$ah$a$ah$a.invoke()) : crashlyticsReport$toString$ag$a$ah$a$ah$a.invoke() == null) {
                CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString tostring = this.values;
                if (tostring != null ? tostring.equals(crashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf()) : crashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf() == null) {
                    CrashlyticsReport$ah$a crashlyticsReport$ah$a = this.ah$a;
                    if (crashlyticsReport$ah$a != null ? crashlyticsReport$ah$a.equals(crashlyticsReport$toString$ag$a$ah$a$ah$a.values()) : crashlyticsReport$toString$ag$a$ah$a$ah$a.values() == null) {
                        if (this.ag$a.equals(crashlyticsReport$toString$ag$a$ah$a$ah$a.ag$a()) && this.toString.equals(crashlyticsReport$toString$ag$a$ah$a$ah$a.ah$a())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values> findviewholderforitemid = this.valueOf;
        int hashCode = findviewholderforitemid == null ? 0 : findviewholderforitemid.hashCode();
        CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString tostring = this.values;
        int hashCode2 = tostring == null ? 0 : tostring.hashCode();
        CrashlyticsReport$ah$a crashlyticsReport$ah$a = this.ah$a;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (crashlyticsReport$ah$a != null ? crashlyticsReport$ah$a.hashCode() : 0)) * 1000003) ^ this.ag$a.hashCode()) * 1000003) ^ this.toString.hashCode();
    }

    /* loaded from: classes5.dex */
    public static final class toString extends CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf {
        private CrashlyticsReport$ah$a ag$a;
        private CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString ah$a;
        private findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values> toString;
        private findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a> valueOf;
        private CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a values;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf toString(findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values> findviewholderforitemid) {
            this.toString = findviewholderforitemid;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf ah$a(CrashlyticsReport$toString$ag$a$ah$a$ah$a.toString tostring) {
            this.ah$a = tostring;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf values(CrashlyticsReport$ah$a crashlyticsReport$ah$a) {
            this.ag$a = crashlyticsReport$ah$a;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf ag$a(CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a) {
            Objects.requireNonNull(crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a, "Null signal");
            this.values = crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf valueOf(findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a> findviewholderforitemid) {
            Objects.requireNonNull(findviewholderforitemid, "Null binaries");
            this.valueOf = findviewholderforitemid;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.valueOf
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a valueOf() {
            String str = "";
            if (this.values == null) {
                str = " signal";
            }
            if (this.valueOf == null) {
                str = str + " binaries";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new ensureRightGlow(this.toString, this.ah$a, this.ag$a, this.values, this.valueOf);
        }
    }
}

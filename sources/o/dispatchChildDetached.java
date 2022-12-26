package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a;
import java.util.Objects;
/* loaded from: classes5.dex */
final class dispatchChildDetached extends CrashlyticsReport$toString$ag$a {
    private final CrashlyticsReport$toString$ag$a$ah$a ag$a;
    private final long ah$a;
    private final CrashlyticsReport$toString$ag$a$ag$a toString;
    private final String valueOf;
    private final CrashlyticsReport$toString$ag$a.values values;

    private dispatchChildDetached(long j, String str, CrashlyticsReport$toString$ag$a$ah$a crashlyticsReport$toString$ag$a$ah$a, CrashlyticsReport$toString$ag$a$ag$a crashlyticsReport$toString$ag$a$ag$a, CrashlyticsReport$toString$ag$a.values valuesVar) {
        this.ah$a = j;
        this.valueOf = str;
        this.ag$a = crashlyticsReport$toString$ag$a$ah$a;
        this.toString = crashlyticsReport$toString$ag$a$ag$a;
        this.values = valuesVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a
    public long valueOf() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a
    public String HaptikSDK$a() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a
    public CrashlyticsReport$toString$ag$a$ah$a values() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a
    public CrashlyticsReport$toString$ag$a$ag$a ah$a() {
        return this.toString;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a
    public CrashlyticsReport$toString$ag$a.values ag$a() {
        return this.values;
    }

    public String toString() {
        return "Event{timestamp=" + this.ah$a + ", type=" + this.valueOf + ", app=" + this.ag$a + ", device=" + this.toString + ", log=" + this.values + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ag$a) {
            CrashlyticsReport$toString$ag$a crashlyticsReport$toString$ag$a = (CrashlyticsReport$toString$ag$a) obj;
            if (this.ah$a == crashlyticsReport$toString$ag$a.valueOf() && this.valueOf.equals(crashlyticsReport$toString$ag$a.HaptikSDK$a()) && this.ag$a.equals(crashlyticsReport$toString$ag$a.values()) && this.toString.equals(crashlyticsReport$toString$ag$a.ah$a())) {
                CrashlyticsReport$toString$ag$a.values valuesVar = this.values;
                if (valuesVar == null) {
                    if (crashlyticsReport$toString$ag$a.ag$a() == null) {
                        return true;
                    }
                } else if (valuesVar.equals(crashlyticsReport$toString$ag$a.ag$a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.ah$a;
        int i = (int) (j ^ (j >>> 32));
        int hashCode = this.valueOf.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        int hashCode3 = this.toString.hashCode();
        CrashlyticsReport$toString$ag$a.values valuesVar = this.values;
        return ((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (valuesVar == null ? 0 : valuesVar.hashCode());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a
    public CrashlyticsReport$toString$ag$a.valueOf HaptikSDK$b() {
        return new values(this);
    }

    /* loaded from: classes5.dex */
    public static final class values extends CrashlyticsReport$toString$ag$a.valueOf {
        private CrashlyticsReport$toString$ag$a$ah$a ag$a;
        private Long ah$a;
        private CrashlyticsReport$toString$ag$a$ag$a toString;
        private String valueOf;
        private CrashlyticsReport$toString$ag$a.values values;

        public values() {
        }

        private values(CrashlyticsReport$toString$ag$a crashlyticsReport$toString$ag$a) {
            this.ah$a = Long.valueOf(crashlyticsReport$toString$ag$a.valueOf());
            this.valueOf = crashlyticsReport$toString$ag$a.HaptikSDK$a();
            this.ag$a = crashlyticsReport$toString$ag$a.values();
            this.toString = crashlyticsReport$toString$ag$a.ah$a();
            this.values = crashlyticsReport$toString$ag$a.ag$a();
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a.valueOf
        public CrashlyticsReport$toString$ag$a.valueOf ah$a(long j) {
            this.ah$a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a.valueOf
        public CrashlyticsReport$toString$ag$a.valueOf ag$a(String str) {
            Objects.requireNonNull(str, "Null type");
            this.valueOf = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a.valueOf
        public CrashlyticsReport$toString$ag$a.valueOf toString(CrashlyticsReport$toString$ag$a$ah$a crashlyticsReport$toString$ag$a$ah$a) {
            Objects.requireNonNull(crashlyticsReport$toString$ag$a$ah$a, "Null app");
            this.ag$a = crashlyticsReport$toString$ag$a$ah$a;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a.valueOf
        public CrashlyticsReport$toString$ag$a.valueOf ag$a(CrashlyticsReport$toString$ag$a$ag$a crashlyticsReport$toString$ag$a$ag$a) {
            Objects.requireNonNull(crashlyticsReport$toString$ag$a$ag$a, "Null device");
            this.toString = crashlyticsReport$toString$ag$a$ag$a;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a.valueOf
        public CrashlyticsReport$toString$ag$a.valueOf ah$a(CrashlyticsReport$toString$ag$a.values valuesVar) {
            this.values = valuesVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a.valueOf
        public CrashlyticsReport$toString$ag$a valueOf() {
            String str = "";
            if (this.ah$a == null) {
                str = " timestamp";
            }
            if (this.valueOf == null) {
                str = str + " type";
            }
            if (this.ag$a == null) {
                str = str + " app";
            }
            if (this.toString == null) {
                str = str + " device";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new dispatchChildDetached(this.ah$a.longValue(), this.valueOf, this.ag$a, this.toString, this.values);
        }
    }
}

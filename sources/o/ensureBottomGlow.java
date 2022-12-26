package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a;
import java.util.Objects;
/* loaded from: classes5.dex */
final class ensureBottomGlow extends CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a {
    private final String ag$a;
    private final long toString;
    private final String valueOf;

    private ensureBottomGlow(String str, String str2, long j) {
        this.valueOf = str;
        this.ag$a = str2;
        this.toString = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a
    public String ag$a() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a
    public String values() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a
    public long valueOf() {
        return this.toString;
    }

    public String toString() {
        return "Signal{name=" + this.valueOf + ", code=" + this.ag$a + ", address=" + this.toString + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a) {
            CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a = (CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a) obj;
            return this.valueOf.equals(crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.ag$a()) && this.ag$a.equals(crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.values()) && this.toString == crashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.valueOf();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        long j = this.toString;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* loaded from: classes5.dex */
    public static final class valueOf extends CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.values {
        private String toString;
        private Long valueOf;
        private String values;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.values ah$a(String str) {
            Objects.requireNonNull(str, "Null name");
            this.toString = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.values toString(String str) {
            Objects.requireNonNull(str, "Null code");
            this.values = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.values valueOf(long j) {
            this.valueOf = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$ag$a ag$a() {
            String str = "";
            if (this.toString == null) {
                str = " name";
            }
            if (this.values == null) {
                str = str + " code";
            }
            if (this.valueOf == null) {
                str = str + " address";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new ensureBottomGlow(this.toString, this.values, this.valueOf.longValue());
        }
    }
}

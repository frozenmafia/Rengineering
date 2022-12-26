package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$values$ah$a;
import java.util.Objects;
/* loaded from: classes5.dex */
final class ensureTopGlow extends CrashlyticsReport$toString$ag$a$ah$a$ah$a.values {
    private final int ag$a;
    private final String valueOf;
    private final findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> values;

    private ensureTopGlow(String str, int i, findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> findviewholderforitemid) {
        this.valueOf = str;
        this.ag$a = i;
        this.values = findviewholderforitemid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.values
    public String ag$a() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.values
    public int valueOf() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a.values
    public findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> ah$a() {
        return this.values;
    }

    public String toString() {
        return "Thread{name=" + this.valueOf + ", importance=" + this.ag$a + ", frames=" + this.values + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ag$a$ah$a$ah$a.values) {
            CrashlyticsReport$toString$ag$a$ah$a$ah$a.values valuesVar = (CrashlyticsReport$toString$ag$a$ah$a$ah$a.values) obj;
            return this.valueOf.equals(valuesVar.ag$a()) && this.ag$a == valuesVar.valueOf() && this.values.equals(valuesVar.ah$a());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.valueOf.hashCode() ^ 1000003) * 1000003) ^ this.ag$a) * 1000003) ^ this.values.hashCode();
    }

    /* loaded from: classes5.dex */
    public static final class toString extends CrashlyticsReport$toString$ag$a$ah$a$ah$a$values$ah$a {
        private Integer ah$a;
        private findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> toString;
        private String valueOf;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$values$ah$a
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$values$ah$a toString(String str) {
            Objects.requireNonNull(str, "Null name");
            this.valueOf = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$values$ah$a
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$values$ah$a values(int i) {
            this.ah$a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$values$ah$a
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a$values$ah$a toString(findViewHolderForItemId<CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString> findviewholderforitemid) {
            Objects.requireNonNull(findviewholderforitemid, "Null frames");
            this.toString = findviewholderforitemid;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$values$ah$a
        public CrashlyticsReport$toString$ag$a$ah$a$ah$a.values values() {
            String str = "";
            if (this.valueOf == null) {
                str = " name";
            }
            if (this.ah$a == null) {
                str = str + " importance";
            }
            if (this.toString == null) {
                str = str + " frames";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new ensureTopGlow(this.valueOf, this.ah$a.intValue(), this.toString);
        }
    }
}

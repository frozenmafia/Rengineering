package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a;
import java.util.Objects;
/* loaded from: classes5.dex */
public abstract class CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a {
    public abstract String ag$a();

    public abstract long ah$a();

    public abstract String valueOf();

    public abstract long values();

    public static values HaptikSDK$b() {
        return new values() { // from class: o.exceptionLabel$ag$a
            private Long ag$a;
            private Long toString;
            private String valueOf;
            private String values;

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.values
            public CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.values values(long j) {
                this.toString = Long.valueOf(j);
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.values
            public CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.values ah$a(long j) {
                this.ag$a = Long.valueOf(j);
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.values
            public CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.values ag$a(String str) {
                Objects.requireNonNull(str, "Null name");
                this.valueOf = str;
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.values
            public CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.values toString(String str) {
                this.values = str;
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.values
            public CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a valueOf() {
                String str = "";
                if (this.toString == null) {
                    str = " baseAddress";
                }
                if (this.ag$a == null) {
                    str = str + " size";
                }
                if (this.valueOf == null) {
                    str = str + " name";
                }
                if (!str.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:" + str);
                }
                return new exceptionLabel(this.toString.longValue(), this.ag$a.longValue(), this.valueOf, this.values);
            }
        };
    }

    public byte[] HaptikSDK$c() {
        String valueOf = valueOf();
        if (valueOf != null) {
            return valueOf.getBytes(CrashlyticsReport.ah$a);
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static abstract class values {
        public abstract values ag$a(String str);

        public abstract values ah$a(long j);

        public abstract values toString(String str);

        public abstract CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a valueOf();

        public abstract values values(long j);

        public values ah$a(byte[] bArr) {
            return toString(new String(bArr, CrashlyticsReport.ah$a));
        }
    }
}

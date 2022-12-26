package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a;
import java.util.Objects;
/* loaded from: classes5.dex */
public abstract class CrashlyticsReport$toString$ah$a {

    /* loaded from: classes7.dex */
    public static abstract class values {
        public abstract values ag$a(int i);

        public abstract values ag$a(String str);

        public abstract values ah$a(int i);

        public abstract values ah$a(long j);

        public abstract values ah$a(boolean z);

        public abstract CrashlyticsReport$toString$ah$a ah$a();

        public abstract values valueOf(int i);

        public abstract values valueOf(String str);

        public abstract values values(long j);

        public abstract values values(String str);
    }

    public abstract long HaptikSDK$a();

    public abstract String HaptikSDK$b();

    public abstract int HaptikSDK$c();

    public abstract int ag$a();

    public abstract long ah$a();

    public abstract boolean ah$b();

    public abstract String invoke();

    public abstract String valueOf();

    public abstract int values();

    public static values HaptikSDK$e() {
        return new values() { // from class: o.dispatchOnScrollStateChanged$ag$a
            private Boolean HaptikSDK$b;
            private String HaptikSDK$c;
            private Long ag$a;
            private String ah$a;
            private Long ah$b;
            private Integer invoke;
            private Integer toString;
            private Integer valueOf;
            private String values;

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a.values
            public CrashlyticsReport$toString$ah$a.values valueOf(int i) {
                this.toString = Integer.valueOf(i);
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a.values
            public CrashlyticsReport$toString$ah$a.values valueOf(String str) {
                Objects.requireNonNull(str, "Null model");
                this.ah$a = str;
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a.values
            public CrashlyticsReport$toString$ah$a.values ah$a(int i) {
                this.valueOf = Integer.valueOf(i);
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a.values
            public CrashlyticsReport$toString$ah$a.values values(long j) {
                this.ah$b = Long.valueOf(j);
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a.values
            public CrashlyticsReport$toString$ah$a.values ah$a(long j) {
                this.ag$a = Long.valueOf(j);
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a.values
            public CrashlyticsReport$toString$ah$a.values ah$a(boolean z) {
                this.HaptikSDK$b = Boolean.valueOf(z);
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a.values
            public CrashlyticsReport$toString$ah$a.values ag$a(int i) {
                this.invoke = Integer.valueOf(i);
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a.values
            public CrashlyticsReport$toString$ah$a.values values(String str) {
                Objects.requireNonNull(str, "Null manufacturer");
                this.values = str;
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a.values
            public CrashlyticsReport$toString$ah$a.values ag$a(String str) {
                Objects.requireNonNull(str, "Null modelClass");
                this.HaptikSDK$c = str;
                return this;
            }

            @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a.values
            public CrashlyticsReport$toString$ah$a ah$a() {
                String str = "";
                if (this.toString == null) {
                    str = " arch";
                }
                if (this.ah$a == null) {
                    str = str + " model";
                }
                if (this.valueOf == null) {
                    str = str + " cores";
                }
                if (this.ah$b == null) {
                    str = str + " ram";
                }
                if (this.ag$a == null) {
                    str = str + " diskSpace";
                }
                if (this.HaptikSDK$b == null) {
                    str = str + " simulator";
                }
                if (this.invoke == null) {
                    str = str + " state";
                }
                if (this.values == null) {
                    str = str + " manufacturer";
                }
                if (this.HaptikSDK$c == null) {
                    str = str + " modelClass";
                }
                if (!str.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:" + str);
                }
                return new dispatchOnScrollStateChanged(this.toString.intValue(), this.ah$a, this.valueOf.intValue(), this.ah$b.longValue(), this.ag$a.longValue(), this.HaptikSDK$b.booleanValue(), this.invoke.intValue(), this.values, this.HaptikSDK$c, null);
            }
        };
    }
}

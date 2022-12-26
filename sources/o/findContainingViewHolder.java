package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a;
/* loaded from: classes5.dex */
final class findContainingViewHolder extends CrashlyticsReport$toString$ag$a$ag$a {
    private final boolean ag$a;
    private final Double ah$a;
    private final long ah$b;
    private final int toString;
    private final int valueOf;
    private final long values;

    private findContainingViewHolder(Double d, int i, boolean z, int i2, long j, long j2) {
        this.ah$a = d;
        this.toString = i;
        this.ag$a = z;
        this.valueOf = i2;
        this.ah$b = j;
        this.values = j2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a
    public Double ah$a() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a
    public int values() {
        return this.toString;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a
    public boolean HaptikSDK$c() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a
    public int valueOf() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a
    public long ah$b() {
        return this.ah$b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a
    public long ag$a() {
        return this.values;
    }

    public String toString() {
        return "Device{batteryLevel=" + this.ah$a + ", batteryVelocity=" + this.toString + ", proximityOn=" + this.ag$a + ", orientation=" + this.valueOf + ", ramUsed=" + this.ah$b + ", diskUsed=" + this.values + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ag$a$ag$a) {
            CrashlyticsReport$toString$ag$a$ag$a crashlyticsReport$toString$ag$a$ag$a = (CrashlyticsReport$toString$ag$a$ag$a) obj;
            Double d = this.ah$a;
            if (d != null ? d.equals(crashlyticsReport$toString$ag$a$ag$a.ah$a()) : crashlyticsReport$toString$ag$a$ag$a.ah$a() == null) {
                if (this.toString == crashlyticsReport$toString$ag$a$ag$a.values() && this.ag$a == crashlyticsReport$toString$ag$a$ag$a.HaptikSDK$c() && this.valueOf == crashlyticsReport$toString$ag$a$ag$a.valueOf() && this.ah$b == crashlyticsReport$toString$ag$a$ag$a.ah$b() && this.values == crashlyticsReport$toString$ag$a$ag$a.ag$a()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Double d = this.ah$a;
        int hashCode = d == null ? 0 : d.hashCode();
        int i = this.toString;
        int i2 = this.ag$a ? 1231 : 1237;
        int i3 = this.valueOf;
        long j = this.ah$b;
        long j2 = this.values;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    /* loaded from: classes5.dex */
    public static final class valueOf extends CrashlyticsReport$toString$ag$a$ag$a.values {
        private Long ag$a;
        private Integer ah$a;
        private Long invoke;
        private Boolean toString;
        private Integer valueOf;
        private Double values;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ag$a.values values(Double d) {
            this.values = d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ag$a.values valueOf(int i) {
            this.ah$a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ag$a.values ah$a(boolean z) {
            this.toString = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ag$a.values ag$a(int i) {
            this.valueOf = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ag$a.values ag$a(long j) {
            this.invoke = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ag$a.values values(long j) {
            this.ag$a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ag$a.values
        public CrashlyticsReport$toString$ag$a$ag$a ah$a() {
            String str = "";
            if (this.ah$a == null) {
                str = " batteryVelocity";
            }
            if (this.toString == null) {
                str = str + " proximityOn";
            }
            if (this.valueOf == null) {
                str = str + " orientation";
            }
            if (this.invoke == null) {
                str = str + " ramUsed";
            }
            if (this.ag$a == null) {
                str = str + " diskUsed";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new findContainingViewHolder(this.values, this.ah$a.intValue(), this.toString.booleanValue(), this.valueOf.intValue(), this.invoke.longValue(), this.ag$a.longValue());
        }
    }
}

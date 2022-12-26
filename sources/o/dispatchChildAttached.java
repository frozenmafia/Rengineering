package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a;
import java.util.Objects;
/* loaded from: classes5.dex */
final class dispatchChildAttached extends CrashlyticsReport$ah$a {
    private final long HaptikSDK$a;
    private final String HaptikSDK$b;
    private final long HaptikSDK$c;
    private final int ag$a;
    private final long ah$a;
    private final String toString;
    private final int valueOf;
    private final int values;

    private dispatchChildAttached(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.ag$a = i;
        this.toString = str;
        this.values = i2;
        this.valueOf = i3;
        this.ah$a = j;
        this.HaptikSDK$c = j2;
        this.HaptikSDK$a = j3;
        this.HaptikSDK$b = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a
    public int values() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a
    public String valueOf() {
        return this.toString;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a
    public int ah$b() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a
    public int ag$a() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a
    public long ah$a() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a
    public long HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a
    public long HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a
    public String HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.ag$a + ", processName=" + this.toString + ", reasonCode=" + this.values + ", importance=" + this.valueOf + ", pss=" + this.ah$a + ", rss=" + this.HaptikSDK$c + ", timestamp=" + this.HaptikSDK$a + ", traceFile=" + this.HaptikSDK$b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$ah$a) {
            CrashlyticsReport$ah$a crashlyticsReport$ah$a = (CrashlyticsReport$ah$a) obj;
            if (this.ag$a == crashlyticsReport$ah$a.values() && this.toString.equals(crashlyticsReport$ah$a.valueOf()) && this.values == crashlyticsReport$ah$a.ah$b() && this.valueOf == crashlyticsReport$ah$a.ag$a() && this.ah$a == crashlyticsReport$ah$a.ah$a() && this.HaptikSDK$c == crashlyticsReport$ah$a.HaptikSDK$b() && this.HaptikSDK$a == crashlyticsReport$ah$a.HaptikSDK$a()) {
                String str = this.HaptikSDK$b;
                if (str == null) {
                    if (crashlyticsReport$ah$a.HaptikSDK$c() == null) {
                        return true;
                    }
                } else if (str.equals(crashlyticsReport$ah$a.HaptikSDK$c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.ag$a;
        int hashCode = this.toString.hashCode();
        int i2 = this.values;
        int i3 = this.valueOf;
        long j = this.ah$a;
        int i4 = (int) (j ^ (j >>> 32));
        long j2 = this.HaptikSDK$c;
        int i5 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.HaptikSDK$a;
        int i6 = (int) (j3 ^ (j3 >>> 32));
        String str = this.HaptikSDK$b;
        return ((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    /* loaded from: classes7.dex */
    public static final class toString extends CrashlyticsReport$ah$a.values {
        private Long HaptikSDK$a;
        private String HaptikSDK$b;
        private Integer ag$a;
        private String ah$a;
        private Long ah$b;
        private Integer toString;
        private Long valueOf;
        private Integer values;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a.values
        public CrashlyticsReport$ah$a.values valueOf(int i) {
            this.toString = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a.values
        public CrashlyticsReport$ah$a.values values(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.ah$a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a.values
        public CrashlyticsReport$ah$a.values ag$a(int i) {
            this.values = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a.values
        public CrashlyticsReport$ah$a.values ah$a(int i) {
            this.ag$a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a.values
        public CrashlyticsReport$ah$a.values ag$a(long j) {
            this.valueOf = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a.values
        public CrashlyticsReport$ah$a.values ah$a(long j) {
            this.HaptikSDK$a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a.values
        public CrashlyticsReport$ah$a.values toString(long j) {
            this.ah$b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a.values
        public CrashlyticsReport$ah$a.values valueOf(String str) {
            this.HaptikSDK$b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ah$a.values
        public CrashlyticsReport$ah$a values() {
            String str = "";
            if (this.toString == null) {
                str = " pid";
            }
            if (this.ah$a == null) {
                str = str + " processName";
            }
            if (this.values == null) {
                str = str + " reasonCode";
            }
            if (this.ag$a == null) {
                str = str + " importance";
            }
            if (this.valueOf == null) {
                str = str + " pss";
            }
            if (this.HaptikSDK$a == null) {
                str = str + " rss";
            }
            if (this.ah$b == null) {
                str = str + " timestamp";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new dispatchChildAttached(this.toString.intValue(), this.ah$a, this.values.intValue(), this.ag$a.intValue(), this.valueOf.longValue(), this.HaptikSDK$a.longValue(), this.ah$b.longValue(), this.HaptikSDK$b);
        }
    }
}

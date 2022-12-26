package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;
/* loaded from: classes5.dex */
final class findContainingItemView extends CrashlyticsReport.toString.AbstractC0308toString {
    private final String ah$a;
    private final int toString;
    private final boolean valueOf;
    private final String values;

    private findContainingItemView(int i, String str, String str2, boolean z) {
        this.toString = i;
        this.ah$a = str;
        this.values = str2;
        this.valueOf = z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.AbstractC0308toString
    public int ah$a() {
        return this.toString;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.AbstractC0308toString
    public String ag$a() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.AbstractC0308toString
    public String values() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.AbstractC0308toString
    public boolean valueOf() {
        return this.valueOf;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.toString + ", version=" + this.ah$a + ", buildVersion=" + this.values + ", jailbroken=" + this.valueOf + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.toString.AbstractC0308toString) {
            CrashlyticsReport.toString.AbstractC0308toString abstractC0308toString = (CrashlyticsReport.toString.AbstractC0308toString) obj;
            return this.toString == abstractC0308toString.ah$a() && this.ah$a.equals(abstractC0308toString.ag$a()) && this.values.equals(abstractC0308toString.values()) && this.valueOf == abstractC0308toString.valueOf();
        }
        return false;
    }

    public int hashCode() {
        int i = this.toString;
        int hashCode = this.ah$a.hashCode();
        return ((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ this.values.hashCode()) * 1000003) ^ (this.valueOf ? 1231 : 1237);
    }

    /* loaded from: classes7.dex */
    public static final class toString extends CrashlyticsReport.toString.AbstractC0308toString.AbstractC0309toString {
        private String ag$a;
        private Integer ah$a;
        private Boolean toString;
        private String valueOf;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.AbstractC0308toString.AbstractC0309toString
        public CrashlyticsReport.toString.AbstractC0308toString.AbstractC0309toString toString(int i) {
            this.ah$a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.AbstractC0308toString.AbstractC0309toString
        public CrashlyticsReport.toString.AbstractC0308toString.AbstractC0309toString valueOf(String str) {
            Objects.requireNonNull(str, "Null version");
            this.valueOf = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.AbstractC0308toString.AbstractC0309toString
        public CrashlyticsReport.toString.AbstractC0308toString.AbstractC0309toString values(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.ag$a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.AbstractC0308toString.AbstractC0309toString
        public CrashlyticsReport.toString.AbstractC0308toString.AbstractC0309toString valueOf(boolean z) {
            this.toString = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.AbstractC0308toString.AbstractC0309toString
        public CrashlyticsReport.toString.AbstractC0308toString values() {
            String str = "";
            if (this.ah$a == null) {
                str = " platform";
            }
            if (this.valueOf == null) {
                str = str + " version";
            }
            if (this.ag$a == null) {
                str = str + " buildVersion";
            }
            if (this.toString == null) {
                str = str + " jailbroken";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new findContainingItemView(this.ah$a.intValue(), this.valueOf, this.ag$a, this.toString.booleanValue());
        }
    }
}

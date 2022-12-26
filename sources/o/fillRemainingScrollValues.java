package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a;
/* loaded from: classes5.dex */
final class fillRemainingScrollValues extends CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString {
    private final String ag$a;
    private final int ah$a;
    private final long toString;
    private final long valueOf;
    private final String values;

    private fillRemainingScrollValues(long j, String str, String str2, long j2, int i) {
        this.toString = j;
        this.values = str;
        this.ag$a = str2;
        this.valueOf = j2;
        this.ah$a = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.ag.a.ah.a.ah.a.values.toString
    public long ah$a() {
        return this.toString;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.ag.a.ah.a.ah.a.values.toString
    public String HaptikSDK$b() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.ag.a.ah.a.ah.a.values.toString
    public String valueOf() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.ag.a.ah.a.ah.a.values.toString
    public long ag$a() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.toString.ag.a.ah.a.ah.a.values.toString
    public int values() {
        return this.ah$a;
    }

    public String toString() {
        return "Frame{pc=" + this.toString + ", symbol=" + this.values + ", file=" + this.ag$a + ", offset=" + this.valueOf + ", importance=" + this.ah$a + "}";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString) {
            CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString tostring = (CrashlyticsReport$toString$ag$a$ah$a$ah$a.values.toString) obj;
            return this.toString == tostring.ah$a() && this.values.equals(tostring.HaptikSDK$b()) && ((str = this.ag$a) != null ? str.equals(tostring.valueOf()) : tostring.valueOf() == null) && this.valueOf == tostring.ag$a() && this.ah$a == tostring.values();
        }
        return false;
    }

    public int hashCode() {
        long j = this.toString;
        int i = (int) (j ^ (j >>> 32));
        int hashCode = this.values.hashCode();
        String str = this.ag$a;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.valueOf;
        return ((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.ah$a;
    }
}

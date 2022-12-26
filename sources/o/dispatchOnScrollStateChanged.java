package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a;
/* loaded from: classes5.dex */
final class dispatchOnScrollStateChanged extends CrashlyticsReport$toString$ah$a {
    private final int HaptikSDK$b;
    private final long HaptikSDK$c;
    private final long ag$a;
    private final String ah$a;
    private final String ah$b;
    private final boolean invoke;
    private final String toString;
    private final int valueOf;
    private final int values;

    private dispatchOnScrollStateChanged(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.valueOf = i;
        this.ah$a = str;
        this.values = i2;
        this.HaptikSDK$c = j;
        this.ag$a = j2;
        this.invoke = z;
        this.HaptikSDK$b = i3;
        this.toString = str2;
        this.ah$b = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a
    public int values() {
        return this.valueOf;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a
    public String HaptikSDK$b() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a
    public int ag$a() {
        return this.values;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a
    public long HaptikSDK$a() {
        return this.HaptikSDK$c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a
    public long ah$a() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a
    public boolean ah$b() {
        return this.invoke;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a
    public int HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a
    public String valueOf() {
        return this.toString;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ah$a
    public String invoke() {
        return this.ah$b;
    }

    public String toString() {
        return "Device{arch=" + this.valueOf + ", model=" + this.ah$a + ", cores=" + this.values + ", ram=" + this.HaptikSDK$c + ", diskSpace=" + this.ag$a + ", simulator=" + this.invoke + ", state=" + this.HaptikSDK$b + ", manufacturer=" + this.toString + ", modelClass=" + this.ah$b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ah$a) {
            CrashlyticsReport$toString$ah$a crashlyticsReport$toString$ah$a = (CrashlyticsReport$toString$ah$a) obj;
            return this.valueOf == crashlyticsReport$toString$ah$a.values() && this.ah$a.equals(crashlyticsReport$toString$ah$a.HaptikSDK$b()) && this.values == crashlyticsReport$toString$ah$a.ag$a() && this.HaptikSDK$c == crashlyticsReport$toString$ah$a.HaptikSDK$a() && this.ag$a == crashlyticsReport$toString$ah$a.ah$a() && this.invoke == crashlyticsReport$toString$ah$a.ah$b() && this.HaptikSDK$b == crashlyticsReport$toString$ah$a.HaptikSDK$c() && this.toString.equals(crashlyticsReport$toString$ah$a.valueOf()) && this.ah$b.equals(crashlyticsReport$toString$ah$a.invoke());
        }
        return false;
    }

    public int hashCode() {
        int i = this.valueOf;
        int hashCode = this.ah$a.hashCode();
        int i2 = this.values;
        long j = this.HaptikSDK$c;
        int i3 = (int) (j ^ (j >>> 32));
        long j2 = this.ag$a;
        int i4 = (int) (j2 ^ (j2 >>> 32));
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ (this.invoke ? 1231 : 1237)) * 1000003) ^ this.HaptikSDK$b) * 1000003) ^ this.toString.hashCode()) * 1000003) ^ this.ah$b.hashCode();
    }
}

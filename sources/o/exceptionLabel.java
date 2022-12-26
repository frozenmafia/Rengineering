package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a;
/* loaded from: classes5.dex */
final class exceptionLabel extends CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a {
    private final long ag$a;
    private final String ah$a;
    private final long toString;
    private final String valueOf;

    private exceptionLabel(long j, long j2, String str, String str2) {
        this.ag$a = j;
        this.toString = j2;
        this.ah$a = str;
        this.valueOf = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a
    public long values() {
        return this.ag$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a
    public long ah$a() {
        return this.toString;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a
    public String ag$a() {
        return this.ah$a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a
    public String valueOf() {
        return this.valueOf;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.ag$a + ", size=" + this.toString + ", name=" + this.ah$a + ", uuid=" + this.valueOf + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a) {
            CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a crashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a = (CrashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a) obj;
            if (this.ag$a == crashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.values() && this.toString == crashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.ah$a() && this.ah$a.equals(crashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.ag$a())) {
                String str = this.valueOf;
                if (str == null) {
                    if (crashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.valueOf() == null) {
                        return true;
                    }
                } else if (str.equals(crashlyticsReport$toString$ag$a$ah$a$ah$a$ah$a.valueOf())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.ag$a;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.toString;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int hashCode = this.ah$a.hashCode();
        String str = this.valueOf;
        return ((((i2 ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }
}

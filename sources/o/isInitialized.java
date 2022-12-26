package o;
/* loaded from: classes4.dex */
public final class isInitialized {
    private final String ah$a;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isInitialized) {
            isInitialized isinitialized = (isInitialized) obj;
            return runAnimators.values((Object) this.valueOf, (Object) isinitialized.valueOf) && runAnimators.values((Object) this.ah$a, (Object) isinitialized.ah$a) && runAnimators.values((Object) this.values, (Object) isinitialized.values);
        }
        return false;
    }

    public int hashCode() {
        return (((this.valueOf.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.values.hashCode();
    }

    public String toString() {
        return "EnrolmentInitData(authCode=" + this.valueOf + ", deviceId=" + this.ah$a + ", correlationId=" + this.values + ')';
    }

    public isInitialized(String str, String str2, String str3) {
        runAnimators.ag$a(str, "authCode");
        runAnimators.ag$a(str2, "deviceId");
        runAnimators.ag$a(str3, "correlationId");
        this.valueOf = str;
        this.ah$a = str2;
        this.values = str3;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final String values() {
        return this.values;
    }
}

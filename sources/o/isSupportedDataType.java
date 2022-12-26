package o;
/* loaded from: classes6.dex */
public final class isSupportedDataType {
    @isFullSpan(valueOf = "signedDeviceId")
    private final String toString;
    @isFullSpan(valueOf = "encryptedData")
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isSupportedDataType) {
                isSupportedDataType issupporteddatatype = (isSupportedDataType) obj;
                return runAnimators.values((Object) this.toString, (Object) issupporteddatatype.toString) && runAnimators.values((Object) this.valueOf, (Object) issupporteddatatype.valueOf);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.toString;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.valueOf;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EnrollmentData(signedDeviceId=" + this.toString + ", encryptedData=" + this.valueOf + ")";
    }

    public isSupportedDataType(String str, String str2) {
        runAnimators.valueOf(str, "signedDeviceId");
        runAnimators.valueOf(str2, "encryptedData");
        this.toString = str;
        this.valueOf = str2;
    }
}

package o;
/* loaded from: classes6.dex */
public final class isSeekableFD {
    @isFullSpan(valueOf = "safetyNetData")
    private final String ag$a;
    @isFullSpan(valueOf = "idToken")
    private final String toString;
    @isFullSpan(valueOf = "timestamp")
    private final String values;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isSeekableFD) {
                isSeekableFD isseekablefd = (isSeekableFD) obj;
                return runAnimators.values((Object) this.toString, (Object) isseekablefd.toString) && runAnimators.values((Object) this.ag$a, (Object) isseekablefd.ag$a) && runAnimators.values((Object) this.values, (Object) isseekablefd.values);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.toString;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.ag$a;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.values;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "EncryptedData(idToken=" + this.toString + ", safetyNetData=" + this.ag$a + ", timestamp=" + this.values + ")";
    }

    public isSeekableFD(String str, String str2, String str3) {
        runAnimators.valueOf(str, "idToken");
        runAnimators.valueOf(str2, "safetyNetData");
        runAnimators.valueOf(str3, "timestamp");
        this.toString = str;
        this.ag$a = str2;
        this.values = str3;
    }
}

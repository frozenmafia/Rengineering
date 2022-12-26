package o;
/* loaded from: classes6.dex */
public final class isOrfFormat {
    @isFullSpan(valueOf = "publicKey")
    private final isWebpFormat ag$a;
    @isFullSpan(valueOf = "vDeviceId")
    private final String valueOf;
    @isFullSpan(valueOf = "authCode")
    private final String values;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isOrfFormat) {
                isOrfFormat isorfformat = (isOrfFormat) obj;
                return runAnimators.values((Object) this.values, (Object) isorfformat.values) && runAnimators.values((Object) this.valueOf, (Object) isorfformat.valueOf) && runAnimators.values(this.ag$a, isorfformat.ag$a);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.values;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.valueOf;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        isWebpFormat iswebpformat = this.ag$a;
        return (((hashCode * 31) + hashCode2) * 31) + (iswebpformat != null ? iswebpformat.hashCode() : 0);
    }

    public String toString() {
        return "DecryptedEnrollmentResponse(authCode=" + this.values + ", deviceId=" + this.valueOf + ", visaPublicKey=" + this.ag$a + ")";
    }

    public final String values() {
        return this.values;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final isWebpFormat ag$a() {
        return this.ag$a;
    }
}

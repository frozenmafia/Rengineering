package o;
/* loaded from: classes6.dex */
public final class isSupportedFormatForSavingAttributes {
    @isFullSpan(valueOf = "deviceNonce")
    private final String ag$a;
    @isFullSpan(valueOf = "safetyNetData")
    private final String toString;
    @isFullSpan(valueOf = "deviceIdData")
    private final isSupportedMimeType valueOf;
    @isFullSpan(valueOf = "publicKeyObject")
    private final isWebpFormat values;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isSupportedFormatForSavingAttributes) {
                isSupportedFormatForSavingAttributes issupportedformatforsavingattributes = (isSupportedFormatForSavingAttributes) obj;
                return runAnimators.values(this.values, issupportedformatforsavingattributes.values) && runAnimators.values((Object) this.ag$a, (Object) issupportedformatforsavingattributes.ag$a) && runAnimators.values((Object) this.toString, (Object) issupportedformatforsavingattributes.toString) && runAnimators.values(this.valueOf, issupportedformatforsavingattributes.valueOf);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        isWebpFormat iswebpformat = this.values;
        int hashCode = iswebpformat != null ? iswebpformat.hashCode() : 0;
        String str = this.ag$a;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.toString;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        isSupportedMimeType issupportedmimetype = this.valueOf;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (issupportedmimetype != null ? issupportedmimetype.hashCode() : 0);
    }

    public String toString() {
        return "EnrollmentRequestPayload(publicKeyObject=" + this.values + ", deviceNonce=" + this.ag$a + ", safetyNetData=" + this.toString + ", deviceData=" + this.valueOf + ")";
    }

    public isSupportedFormatForSavingAttributes(isWebpFormat iswebpformat, String str, String str2, isSupportedMimeType issupportedmimetype) {
        runAnimators.valueOf(iswebpformat, "publicKeyObject");
        runAnimators.valueOf(str, "deviceNonce");
        runAnimators.valueOf(str2, "safetyNetData");
        runAnimators.valueOf(issupportedmimetype, "deviceData");
        this.values = iswebpformat;
        this.ag$a = str;
        this.toString = str2;
        this.valueOf = issupportedmimetype;
    }
}

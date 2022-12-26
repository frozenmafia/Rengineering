package o;
/* loaded from: classes6.dex */
public final class isRw2Format {
    @isFullSpan(valueOf = "merchantDetails")
    private final parseTiffHeaders ag$a;
    @isFullSpan(valueOf = "encryptedAuthCodeReq")
    private final String ah$a;
    @isFullSpan(valueOf = "customerDetails")
    private final isJpegFormat toString;
    @isFullSpan(valueOf = "staticKeyRefId")
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isRw2Format) {
                isRw2Format isrw2format = (isRw2Format) obj;
                return runAnimators.values(this.toString, isrw2format.toString) && runAnimators.values(this.ag$a, isrw2format.ag$a) && runAnimators.values((Object) this.valueOf, (Object) isrw2format.valueOf) && runAnimators.values((Object) this.ah$a, (Object) isrw2format.ah$a);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        isJpegFormat isjpegformat = this.toString;
        int hashCode = isjpegformat != null ? isjpegformat.hashCode() : 0;
        parseTiffHeaders parsetiffheaders = this.ag$a;
        int hashCode2 = parsetiffheaders != null ? parsetiffheaders.hashCode() : 0;
        String str = this.valueOf;
        int hashCode3 = str != null ? str.hashCode() : 0;
        String str2 = this.ah$a;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EnrollmentRequest(customerDetails=" + this.toString + ", merchantDetails=" + this.ag$a + ", visaStaticRefId=" + this.valueOf + ", encryptedPayload=" + this.ah$a + ")";
    }

    public isRw2Format(isJpegFormat isjpegformat, parseTiffHeaders parsetiffheaders, String str, String str2) {
        runAnimators.valueOf(isjpegformat, "customerDetails");
        runAnimators.valueOf(parsetiffheaders, "merchantDetails");
        runAnimators.valueOf(str, "visaStaticRefId");
        runAnimators.valueOf(str2, "encryptedPayload");
        this.toString = isjpegformat;
        this.ag$a = parsetiffheaders;
        this.valueOf = str;
        this.ah$a = str2;
    }
}

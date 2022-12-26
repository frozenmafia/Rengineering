package o;
/* loaded from: classes6.dex */
public final class readImageFileDirectory {
    @isFullSpan(valueOf = "merchantDetails")
    private final parseTiffHeaders ag$a;
    @isFullSpan(valueOf = "paRes")
    private final String toString;
    @isFullSpan(valueOf = "viesAuthDetails")
    private final isHeifFormat valueOf;
    @isFullSpan(valueOf = "customerDetails")
    private final isJpegFormat values;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof readImageFileDirectory) {
                readImageFileDirectory readimagefiledirectory = (readImageFileDirectory) obj;
                return runAnimators.values(this.values, readimagefiledirectory.values) && runAnimators.values(this.ag$a, readimagefiledirectory.ag$a) && runAnimators.values((Object) this.toString, (Object) readimagefiledirectory.toString) && runAnimators.values(this.valueOf, readimagefiledirectory.valueOf);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        isJpegFormat isjpegformat = this.values;
        int hashCode = isjpegformat != null ? isjpegformat.hashCode() : 0;
        parseTiffHeaders parsetiffheaders = this.ag$a;
        int hashCode2 = parsetiffheaders != null ? parsetiffheaders.hashCode() : 0;
        String str = this.toString;
        int hashCode3 = str != null ? str.hashCode() : 0;
        isHeifFormat isheifformat = this.valueOf;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (isheifformat != null ? isheifformat.hashCode() : 0);
    }

    public String toString() {
        return "ValidationRequest(customerDetails=" + this.values + ", merchantDetails=" + this.ag$a + ", paRes=" + this.toString + ", authDetails=" + this.valueOf + ")";
    }

    public readImageFileDirectory(isJpegFormat isjpegformat, parseTiffHeaders parsetiffheaders, String str, isHeifFormat isheifformat) {
        runAnimators.valueOf(isjpegformat, "customerDetails");
        runAnimators.valueOf(parsetiffheaders, "merchantDetails");
        runAnimators.valueOf(str, "paRes");
        runAnimators.valueOf(isheifformat, "authDetails");
        this.values = isjpegformat;
        this.ag$a = parsetiffheaders;
        this.toString = str;
        this.valueOf = isheifformat;
    }
}

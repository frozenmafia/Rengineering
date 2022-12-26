package o;
/* loaded from: classes6.dex */
public final class isJpegFormat {
    @isFullSpan(valueOf = "merchantCustId")
    private final String ag$a;
    @isFullSpan(valueOf = "merchantCardAlias")
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isJpegFormat) {
                isJpegFormat isjpegformat = (isJpegFormat) obj;
                return runAnimators.values((Object) this.valueOf, (Object) isjpegformat.valueOf) && runAnimators.values((Object) this.ag$a, (Object) isjpegformat.ag$a);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.valueOf;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.ag$a;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CustomerDetails(merchantCardAlias=" + this.valueOf + ", merchantCustomerId=" + this.ag$a + ")";
    }

    public isJpegFormat(String str, String str2) {
        runAnimators.valueOf(str, "merchantCardAlias");
        runAnimators.valueOf(str2, "merchantCustomerId");
        this.valueOf = str;
        this.ag$a = str2;
    }
}

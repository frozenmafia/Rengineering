package o;
/* loaded from: classes6.dex */
public final class isHeifFormat {
    @isFullSpan(valueOf = "viesAuthCode")
    private final String ag$a;
    @isFullSpan(valueOf = "deviceId")
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isHeifFormat) {
                isHeifFormat isheifformat = (isHeifFormat) obj;
                return runAnimators.values((Object) this.ah$a, (Object) isheifformat.ah$a) && runAnimators.values((Object) this.ag$a, (Object) isheifformat.ag$a);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.ah$a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.ag$a;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AuthDetails(deviceId=" + this.ah$a + ", authCode=" + this.ag$a + ")";
    }

    public isHeifFormat(String str, String str2) {
        runAnimators.valueOf(str, "deviceId");
        runAnimators.valueOf(str2, "authCode");
        this.ah$a = str;
        this.ag$a = str2;
    }
}

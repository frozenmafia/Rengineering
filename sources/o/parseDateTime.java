package o;
/* loaded from: classes6.dex */
public final class parseDateTime {
    @isFullSpan(valueOf = "respDesc")
    private final String ag$a;
    @isFullSpan(valueOf = "respCode")
    private final String values;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof parseDateTime) {
                parseDateTime parsedatetime = (parseDateTime) obj;
                return runAnimators.values((Object) this.values, (Object) parsedatetime.values) && runAnimators.values((Object) this.ag$a, (Object) parsedatetime.ag$a);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.values;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.ag$a;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Status(responseCode=" + this.values + ", responseDescription=" + this.ag$a + ")";
    }
}

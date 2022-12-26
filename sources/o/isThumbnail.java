package o;
/* loaded from: classes6.dex */
public final class isThumbnail {
    @isFullSpan(valueOf = "data")
    private final String toString;
    @isFullSpan(valueOf = "status")
    private final parseDateTime values;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isThumbnail) {
                isThumbnail isthumbnail = (isThumbnail) obj;
                return runAnimators.values(this.values, isthumbnail.values) && runAnimators.values((Object) this.toString, (Object) isthumbnail.toString);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        parseDateTime parsedatetime = this.values;
        int hashCode = parsedatetime != null ? parsedatetime.hashCode() : 0;
        String str = this.toString;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "EnrollmentResponse(status=" + this.values + ", data=" + this.toString + ")";
    }

    public final String ag$a() {
        return this.toString;
    }
}

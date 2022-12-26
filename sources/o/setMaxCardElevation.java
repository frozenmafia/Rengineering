package o;
/* loaded from: classes6.dex */
public final class setMaxCardElevation {
    @isFullSpan(valueOf = "eventType")
    private String ag$a;
    @isFullSpan(valueOf = "redirectUrl")
    private String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setMaxCardElevation) {
            setMaxCardElevation setmaxcardelevation = (setMaxCardElevation) obj;
            return runAnimators.values((Object) this.ag$a, (Object) setmaxcardelevation.ag$a) && runAnimators.values((Object) this.toString, (Object) setmaxcardelevation.toString);
        }
        return false;
    }

    public int hashCode() {
        return (this.ag$a.hashCode() * 31) + this.toString.hashCode();
    }

    public String toString() {
        String str = this.ag$a;
        String str2 = this.toString;
        return "WebViewEvent(eventType=" + str + ", redirectUrl=" + str2 + ")";
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.toString;
    }
}

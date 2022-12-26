package o;
/* loaded from: classes6.dex */
public final class isPngFormat {
    @isFullSpan(valueOf = "data")
    private final String ag$a;
    @isFullSpan(valueOf = "signedJws ")
    private final String values;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isPngFormat) {
                isPngFormat ispngformat = (isPngFormat) obj;
                return runAnimators.values((Object) this.ag$a, (Object) ispngformat.ag$a) && runAnimators.values((Object) this.values, (Object) ispngformat.values);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.ag$a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.values;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DecryptedJwe(data=" + this.ag$a + ", signedJws=" + this.values + ")";
    }

    public isPngFormat(String str, String str2) {
        runAnimators.valueOf(str, "data");
        runAnimators.valueOf(str2, "signedJws");
        this.ag$a = str;
        this.values = str2;
    }

    public final String ah$a() {
        return this.ag$a;
    }

    public final String values() {
        return this.values;
    }
}

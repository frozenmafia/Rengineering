package o;
/* loaded from: classes6.dex */
public final class isWebpFormat {
    @isFullSpan(valueOf = "keyType")
    private final String ag$a;
    @isFullSpan(valueOf = "keySize")
    private final String ah$a;
    @isFullSpan(valueOf = "publicKey")
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof isWebpFormat) {
                isWebpFormat iswebpformat = (isWebpFormat) obj;
                return runAnimators.values((Object) this.ag$a, (Object) iswebpformat.ag$a) && runAnimators.values((Object) this.ah$a, (Object) iswebpformat.ah$a) && runAnimators.values((Object) this.valueOf, (Object) iswebpformat.valueOf);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.ag$a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.ah$a;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.valueOf;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "KeyObject(keyType=" + this.ag$a + ", keySize=" + this.ah$a + ", keyValue=" + this.valueOf + ")";
    }

    public isWebpFormat(String str, String str2, String str3) {
        runAnimators.valueOf(str, "keyType");
        runAnimators.valueOf(str2, "keySize");
        runAnimators.valueOf(str3, "keyValue");
        this.ag$a = str;
        this.ah$a = str2;
        this.valueOf = str3;
    }

    public final String values() {
        return this.ag$a;
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}

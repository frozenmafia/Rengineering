package o;
/* loaded from: classes.dex */
public final class onActive {
    private final String ag$a;
    private final String ah$a;
    private final String toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onActive) {
            onActive onactive = (onActive) obj;
            return runAnimators.values((Object) this.values, (Object) onactive.values) && runAnimators.values((Object) this.ag$a, (Object) onactive.ag$a) && runAnimators.values((Object) this.ah$a, (Object) onactive.ah$a) && runAnimators.values((Object) this.toString, (Object) onactive.toString) && runAnimators.values((Object) this.valueOf, (Object) onactive.valueOf);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.values.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        String str = this.ah$a;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.toString;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        String str = this.values;
        String str2 = this.ag$a;
        String str3 = this.ah$a;
        String str4 = this.toString;
        String str5 = this.valueOf;
        return "FCUserInfo(userId=" + str + ", name=" + str2 + ", mobileNo=" + str3 + ", email=" + str4 + ", profilePic=" + str5 + ")";
    }

    public onActive(String str, String str2, String str3, String str4, String str5) {
        runAnimators.ag$a(str, "userId");
        runAnimators.ag$a(str2, "name");
        runAnimators.ag$a(str5, "profilePic");
        this.values = str;
        this.ag$a = str2;
        this.ah$a = str3;
        this.toString = str4;
        this.valueOf = str5;
    }

    public /* synthetic */ onActive(String str, String str2, String str3, String str4, String str5, int i, getTargetTypes gettargettypes) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5);
    }

    public final String HaptikSDK$c() {
        return this.values;
    }

    public final String ah$a() {
        return this.ag$a;
    }

    public final String values() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.toString;
    }

    public final String ag$a() {
        return this.valueOf;
    }
}

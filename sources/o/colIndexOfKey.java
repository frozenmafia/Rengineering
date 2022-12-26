package o;
/* loaded from: classes.dex */
public final class colIndexOfKey {
    private final boolean HaptikSDK$a;
    private final Integer HaptikSDK$b;
    private final String ag$a;
    private final boolean ah$a;
    private final String ah$b;
    private final Integer toString;
    private final boolean valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof colIndexOfKey) {
            colIndexOfKey colindexofkey = (colIndexOfKey) obj;
            return runAnimators.values(this.HaptikSDK$b, colindexofkey.HaptikSDK$b) && runAnimators.values((Object) this.ah$b, (Object) colindexofkey.ah$b) && runAnimators.values((Object) this.values, (Object) colindexofkey.values) && runAnimators.values((Object) this.ag$a, (Object) colindexofkey.ag$a) && runAnimators.values(this.toString, colindexofkey.toString) && this.valueOf == colindexofkey.valueOf && this.ah$a == colindexofkey.ah$a && this.HaptikSDK$a == colindexofkey.HaptikSDK$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.HaptikSDK$b;
        int hashCode = num == null ? 0 : num.hashCode();
        String str = this.ah$b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.values;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ag$a;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.toString;
        int hashCode5 = num2 != null ? num2.hashCode() : 0;
        boolean z = this.valueOf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        boolean z2 = this.ah$a;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        boolean z3 = this.HaptikSDK$a;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + i2) * 31) + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        Integer num = this.HaptikSDK$b;
        String str = this.ah$b;
        String str2 = this.values;
        String str3 = this.ag$a;
        Integer num2 = this.toString;
        boolean z = this.valueOf;
        boolean z2 = this.ah$a;
        boolean z3 = this.HaptikSDK$a;
        return "GeoBlockData(stateId=" + num + ", stateName=" + str + ", cityName=" + str2 + ", countryName=" + str3 + ", pinCode=" + num2 + ", isGpsStateBanned=" + z + ", isProfileStateBanned=" + z2 + ", shouldConfirmState=" + z3 + ")";
    }

    public colIndexOfKey(Integer num, String str, String str2, String str3, Integer num2, boolean z, boolean z2, boolean z3) {
        this.HaptikSDK$b = num;
        this.ah$b = str;
        this.values = str2;
        this.ag$a = str3;
        this.toString = num2;
        this.valueOf = z;
        this.ah$a = z2;
        this.HaptikSDK$a = z3;
    }

    public final Integer HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final String HaptikSDK$b() {
        return this.ah$b;
    }

    public final String ag$a() {
        return this.values;
    }

    public final String values() {
        return this.ag$a;
    }

    public final Integer ah$a() {
        return this.toString;
    }

    public final boolean invoke() {
        return this.valueOf;
    }

    public final boolean HaptikSDK$a() {
        return this.ah$a;
    }

    public final boolean valueOf() {
        return this.HaptikSDK$a;
    }
}

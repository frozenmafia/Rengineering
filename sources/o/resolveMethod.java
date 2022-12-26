package o;
/* loaded from: classes.dex */
public final class resolveMethod {
    private final String HaptikSDK$a;
    private final String ag$a;
    private final boolean ah$a;
    private final String invoke;
    private final int toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof resolveMethod) {
            resolveMethod resolvemethod = (resolveMethod) obj;
            return runAnimators.values((Object) this.valueOf, (Object) resolvemethod.valueOf) && runAnimators.values((Object) this.values, (Object) resolvemethod.values) && runAnimators.values((Object) this.invoke, (Object) resolvemethod.invoke) && runAnimators.values((Object) this.HaptikSDK$a, (Object) resolvemethod.HaptikSDK$a) && this.ah$a == resolvemethod.ah$a && runAnimators.values((Object) this.ag$a, (Object) resolvemethod.ag$a) && this.toString == resolvemethod.toString;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        int hashCode2 = this.values.hashCode();
        int hashCode3 = this.invoke.hashCode();
        int hashCode4 = this.HaptikSDK$a.hashCode();
        boolean z = this.ah$a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + this.ag$a.hashCode()) * 31) + this.toString;
    }

    public String toString() {
        String str = this.valueOf;
        String str2 = this.values;
        String str3 = this.invoke;
        String str4 = this.HaptikSDK$a;
        boolean z = this.ah$a;
        String str5 = this.ag$a;
        int i = this.toString;
        return "PlayerBasicDetailsModel(name=" + str + ", nameInitial=" + str2 + ", specialRole=" + str3 + ", squadAndRole=" + str4 + ", hasSpecialRole=" + z + ", imageUrl=" + str5 + ", playerId=" + i + ")";
    }

    public resolveMethod(String str, String str2, String str3, String str4, boolean z, String str5, int i) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "nameInitial");
        runAnimators.ag$a(str3, "specialRole");
        runAnimators.ag$a(str4, "squadAndRole");
        runAnimators.ag$a(str5, "imageUrl");
        this.valueOf = str;
        this.values = str2;
        this.invoke = str3;
        this.HaptikSDK$a = str4;
        this.ah$a = z;
        this.ag$a = str5;
        this.toString = i;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$a;
    }

    public final int HaptikSDK$c() {
        return this.toString;
    }

    public final boolean ag$a() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.valueOf;
    }

    public final String invoke() {
        return this.invoke;
    }

    public final String valueOf() {
        return this.values;
    }

    public final String values() {
        return this.ag$a;
    }
}

package o;
/* loaded from: classes3.dex */
public final class isDataOnly {
    private final int ag$a;
    private final String ah$a;
    private final boolean ah$b;
    private final int toString;
    private final int valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isDataOnly) {
            isDataOnly isdataonly = (isDataOnly) obj;
            return runAnimators.values((Object) this.values, (Object) isdataonly.values) && runAnimators.values((Object) this.ah$a, (Object) isdataonly.ah$a) && this.ag$a == isdataonly.ag$a && this.valueOf == isdataonly.valueOf && this.ah$b == isdataonly.ah$b && this.toString == isdataonly.toString;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.values.hashCode();
        int hashCode2 = this.ah$a.hashCode();
        int i = this.ag$a;
        int i2 = this.valueOf;
        boolean z = this.ah$b;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + i2) * 31) + i3) * 31) + this.toString;
    }

    public String toString() {
        String str = this.values;
        String str2 = this.ah$a;
        int i = this.ag$a;
        int i2 = this.valueOf;
        boolean z = this.ah$b;
        int i3 = this.toString;
        return "FancodeInfoItemModel(sectionName=" + str + ", sectionValue=" + str2 + ", ctaIconRsrc=" + i + ", clickAction=" + i2 + ", showDivider=" + z + ", paddingRight=" + i3 + ")";
    }

    public isDataOnly(String str, String str2, int i, int i2, boolean z, int i3) {
        runAnimators.ag$a(str, "sectionName");
        runAnimators.ag$a(str2, "sectionValue");
        this.values = str;
        this.ah$a = str2;
        this.ag$a = i;
        this.valueOf = i2;
        this.ah$b = z;
        this.toString = i3;
    }

    public final String valueOf() {
        return this.values;
    }

    public final String HaptikSDK$b() {
        return this.ah$a;
    }

    public final int ah$a() {
        return this.ag$a;
    }

    public final int values() {
        return this.valueOf;
    }

    public final boolean HaptikSDK$a() {
        return this.ah$b;
    }

    public final int ag$a() {
        return this.toString;
    }
}

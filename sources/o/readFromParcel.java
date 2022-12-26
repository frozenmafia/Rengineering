package o;
/* loaded from: classes.dex */
public final class readFromParcel {
    private final int ag$a;
    private final int ah$a;
    private final int toString;
    private final boolean valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof readFromParcel) {
            readFromParcel readfromparcel = (readFromParcel) obj;
            return runAnimators.values((Object) this.values, (Object) readfromparcel.values) && this.valueOf == readfromparcel.valueOf && this.ah$a == readfromparcel.ah$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.values.hashCode();
        boolean z = this.valueOf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((hashCode * 31) + i) * 31) + this.ah$a;
    }

    public String toString() {
        String str = this.values;
        boolean z = this.valueOf;
        int i = this.ah$a;
        return "PlayerValueModel(value=" + str + ", isBold=" + z + ", widthInDp=" + i + ")";
    }

    public readFromParcel(String str, boolean z, int i) {
        runAnimators.ag$a(str, "value");
        this.values = str;
        this.valueOf = z;
        this.ah$a = i;
        this.toString = com.app.dream11Pro.R.font.d11_font_normal__700;
        this.ag$a = com.app.dream11Pro.R.font.d11_font_normal__400;
    }

    public final String values() {
        return this.values;
    }

    public final boolean HaptikSDK$b() {
        return this.valueOf;
    }

    public final int ah$a() {
        return this.ah$a;
    }

    public final int ag$a() {
        return this.toString;
    }

    public final int valueOf() {
        return this.ag$a;
    }
}
